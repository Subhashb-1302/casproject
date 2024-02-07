package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllHeaderDropDowns extends BasePage {

	public AllHeaderDropDowns(WebDriver driver) {
		super(driver);
		
	}
	
	//LOCATORS
		// 1)Company DropDown:
		@FindBy(xpath="//button[@name='Company']")
		WebElement company;
		
		@FindBy(xpath="//li[@role='presentation']//span")
		List<WebElement> companyDropdownList;
		
		
		// 2)Service Line DropDown:
		@FindBy(xpath="//button[@name='Service Lines']")
		WebElement serviceLine;
		
		@FindBy(xpath="//li[@role='presentation']//span")
		List<WebElement> serviceLineDropDownList;
		
		
		// 3) Sales Resource DropDown:
		@FindBy(xpath="//button[@name='Sales Resources']")
		WebElement salesResource;
		
		@FindBy(xpath="//li[@role='presentation']//span")
		List<WebElement> salesResourceDropDownList;
		
		
		// 4) Market And Country DropDown:
		@FindBy(xpath="//button[@name='Markets and Countries']")
		WebElement marketAndComplience;
		
		@FindBy(xpath="//li[@role='presentation']//span")
		List<WebElement>marketAndCountriesDropDownList;
		
		// 5) Corporate Function DropDown:
		@FindBy(xpath="//button[@name='Corporate Functions']")
		WebElement corporateFunction;
		
		@FindBy(xpath="//li[@role='presentation']//span")
		List<WebElement> corporateFunctionDropDownList;
		
		// 6) People DropDown:
		@FindBy(xpath="//button[@name='People']")
		WebElement people;
		
		@FindBy(xpath="//li[@role='presentation']//span")
		List<WebElement> peopleDropDownList;
		
		
	//ACTIONS
		//1)Company DropDown:
		public void ClickOnCompany() {
			company.click();
		} 

		public List<String> CompanyDropdown() {
			
			for(WebElement compDropdown:companyDropdownList) {
				System.out.println(compDropdown.getText());
			}
			List<String> companyTexts=new ArrayList<String>();
			for(int i=0; i<companyDropdownList.size(); i++) {
				String c=companyDropdownList.get(i).getText();
				companyTexts.add(c);
			}
			return companyTexts;
		}
		
		
		
		//2)Service Line DropDown:
		public void clickOnServiceLine() {
			serviceLine.click();
		}
		
		public List<String> SeviceLineDropdown() {
			for(WebElement serviceDropDown:serviceLineDropDownList) {
				System.out.println(serviceDropDown.getText());
			}
			List<String>serviceLineTexts=new ArrayList<>();
			for(int i=0; i<serviceLineDropDownList.size();i++) {
				String sL=serviceLineDropDownList.get(i).getText();
				serviceLineTexts.add(sL);
			}
			return serviceLineTexts;
		}
		
		//3)Sales Resource DropDown:
		public void clickOnSalesResource() {
			salesResource.click();
		}
		
		public List<String> SaleResourceDropdown() {
			for(WebElement salesDropDown:salesResourceDropDownList) {
				System.out.println(salesDropDown.getText());
			}
			List<String>salesResourceTexts=new ArrayList<>();
			for(int i=0; i<salesResourceDropDownList.size(); i++) {
				String sR=salesResourceDropDownList.get(i).getText();
				salesResourceTexts.add(sR);
			}
			return salesResourceTexts;
		}
		
		//4)Market And Countries DropDown:
		public void ClickOnMarketAndCountry() {
			marketAndComplience.click();
		}
		
		public List<String> MarketAndCountriesDropdown() {
			for(WebElement marketDropDown:marketAndCountriesDropDownList) {
				System.out.println(marketDropDown.getText());
			}
			List<String>marketCountriesTexts=new ArrayList<>();
			for(int i=0; i<marketAndCountriesDropDownList.size(); i++) {
				String mC=marketAndCountriesDropDownList.get(i).getText();
				marketCountriesTexts.add(mC);
			}
			return marketCountriesTexts;
		}
		
		//5)Corporate Functions DropDown:
		public void clickOnCorporateFunction() {
			corporateFunction.click();
		}
		
		public List<String> CorporateFunctionsDropdown() {
			for(WebElement corporateDropDown:corporateFunctionDropDownList) {
				System.out.println(corporateDropDown.getText());
			}
			List<String>corporateFunctionTexts=new ArrayList<>();
			for(int i=0; i<corporateFunctionDropDownList.size();i++) {
				String cF=corporateFunctionDropDownList.get(i).getText();
				corporateFunctionTexts.add(cF);
				}
			return corporateFunctionTexts;
		}
		
		//6)People DropDown:
		public void clickOnPeopleDroDown() {
			people.click();
		}
		
		public List<String> PeopleDropdown() {
			for(WebElement pplDropDown:peopleDropDownList) {
				System.out.println(pplDropDown.getText());
			}
			List<String>peopleTexts=new ArrayList<>();
			for(int i=0; i<peopleDropDownList.size();i++) {
				String p=peopleDropDownList.get(i).getText();
				peopleTexts.add(p);
			}
			return peopleTexts;
		}

}
