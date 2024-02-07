package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class ProfileVerification extends BasePage {

	public ProfileVerification(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//div[@id='O365_MainLink_MePhoto']")
	WebElement profile;
	
	@FindBy(xpath="//div[@id='mectrl_currentAccount_primary']")
	WebElement profileEmpName;
	
	@FindBy(xpath="//div[@id='mectrl_currentAccount_secondary']")
	WebElement profileEmail;
	
	SoftAssert sa=new SoftAssert();
	public void clickOnProfile() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", profile);
		profile.click();
	}
	
	public void captureProfileName() {
		String empName=profileEmpName.getText();
		System.out.println(empName);
	
	
		try {
			sa.assertEquals(empName.contains("Subhash"), true,"The empName do not contain word \"Subhash\"" );
		} catch(Exception e) {
			e.printStackTrace();
		}
		sa.assertAll();
	}
	public void captureProfileEmail() {
		String empEmail = profileEmail.getText();
		System.out.println(empEmail);
		
		try {
			sa.assertEquals(empEmail, "2303528@cognizant.com","Email found was Incorrected");
		} catch(Exception e) {
			e.printStackTrace();
		}
		sa.assertAll();
	}
}

