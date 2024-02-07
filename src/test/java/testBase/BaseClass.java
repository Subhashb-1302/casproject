package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import utilities.ExcelUtilities;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager; //Log4j
import org.apache.logging.log4j.Logger; //Log4j

public class BaseClass {
	public static WebDriver driver;
	public static Logger logger;
	public Properties p;
	public static ExcelUtilities excelUtilities = new ExcelUtilities();
	public static int excelColumn = 0;
	public static String filePath = ".\\testData\\TestData.xlsx";

	@BeforeTest(groups = { "sanity", "regression"})
	@Parameters({ "browser" })
	public void setUpEnvi(String br) throws IOException {

		// Load properties file
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);

		// Load log4j file
		logger = LogManager.getLogger(this.getClass());

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("No browser is matching");
			return;

		}

		// driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}

	@AfterTest(groups = { "sanity", "regression"})
	public void tearDown() {
		driver.quit();
	}

	public void screenshot(String fileName) throws IOException {
		TakesScreenshot srcshot = (TakesScreenshot) driver;
		File src = srcshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".\\screenshots\\" + fileName + ".png"));
	}

	public String captureScreen(String file) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyyMMddHHss").format(new Date());
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File srcFile = takeScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\ExtentReportScreenshots\\" + file + "_" + timeStamp
				+ ".png";
		File targetFile = new File(targetFilePath);
		srcFile.renameTo(targetFile);
		return targetFilePath;
	}

}
