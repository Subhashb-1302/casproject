package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderList extends BasePage{

	public HeaderList(WebDriver driver) {
		super(driver);	
	}

	@FindBy(xpath="//div[@role='menubar']//descendant::div/div")
	List<WebElement> headerLists;
	
	public void headerInfo() {
		{
			for(WebElement headerList:headerLists) {
				System.out.println(headerList.getText());
			}
		}

	}
}
