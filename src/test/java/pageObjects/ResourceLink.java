package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ResourceLink extends BasePage {

	public ResourceLink(WebDriver driver) {
		super(driver);
	}
	Actions act = new Actions(driver);
	
	@FindBy(xpath="//div[@title='Ethics & Compliance'][@role='heading']")
	WebElement pageHeading;
	
	@FindBy(xpath="//span[@role='heading']")
	WebElement titleOfResourceLink;
	
	@FindBy(xpath="//div[@data-automation-id='button-card']")
	List<WebElement> resourceLinks;
	
	@FindBy(xpath="//*[@data-automation-id='pageCommandBarFocusModeButton']")
	WebElement clickToMinimize;
	
	@FindBy(xpath="//*[@id='ca847396-d993-42b2-b201-a458b49823b9']") 
	WebElement flag;
	
	@FindBy(xpath="//*[@data-automation-id='webPartTitleReadMode' and text()='Key Ethics & Compliance Focus Areas']")
	WebElement titleOfKeyFocusArea;
	
	@FindBy(xpath="//*[@data-focuszone-id='FocusZone50']//div[@data-automationid='ListCell']/div/div")
	List<WebElement> keyFocusAreasList;
	
	
	public void capturePageHeading() {
		pageHeading.getText().toUpperCase();
	}
	
	public void captureTitleOfResourceLink() {
		titleOfResourceLink.getText().toUpperCase();
	}
	
	public List<String> resourceLinkList() {
		for(WebElement resourceLink:resourceLinks) {
			String resource=resourceLink.getText();
			System.out.println(resource);
		}
		List<String>resourceLisnkTexts=new ArrayList<>();
		for(int i=0; i<resourceLinks.size(); i++) {
			String rL=resourceLinks.get(i).getText();
			resourceLisnkTexts.add(rL);
		}
		return resourceLisnkTexts;
	}
	
	public void tittleOfKeyFocusArea() {
		clickToMinimize.click();  		//To maximize the page
		
		
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", flag);
		
		  titleOfKeyFocusArea.getText().toUpperCase();
	}
	
	public List<String> listofKeyFocusArea() {
		for(WebElement keyFocusAreas:keyFocusAreasList) {
			String keyArea = keyFocusAreas.getText();
			System.out.println(keyArea);
		}
		List<String>keyFocusAreasTexts=new ArrayList<>();
		for(int i=0; i<keyFocusAreasList.size(); i++) {
			String rL=keyFocusAreasList.get(i).getText();
			keyFocusAreasTexts.add(rL);
		}
		return keyFocusAreasTexts;
	}
	
}
