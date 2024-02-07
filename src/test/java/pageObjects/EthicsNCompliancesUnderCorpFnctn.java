package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EthicsNCompliancesUnderCorpFnctn extends BasePage{

	public EthicsNCompliancesUnderCorpFnctn(WebDriver driver) {
		super(driver);
		
	}
	
	
	//Locator 
	@FindBy(xpath="//*[@name='Corporate Functions']")
	WebElement corporateFunction;
	
	@FindBy(xpath="//a[@name='Legal & Corporate Affairs']")
	WebElement legalAndCorpAffairs;
	
	@FindBy(xpath="//a[@name='Ethics and Compliance']")
	WebElement ethicsNCompliences;
	
	public void ClickOnCorp() {
		corporateFunction.click();
	}
	
	public void HoverOnLegalNCorpoAffairs() {
		Actions act = new Actions(driver);
		act.moveToElement(legalAndCorpAffairs).build().perform();
	}
	
	public void ClickOnEthicsNCompliences() {
		ethicsNCompliences.click();
	}

}
