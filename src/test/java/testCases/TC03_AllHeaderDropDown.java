package testCases;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AllHeaderDropDowns;
import testBase.BaseClass;

public class TC03_AllHeaderDropDown extends BaseClass {

	
	AllHeaderDropDowns headerDropdwn;

	@Test(priority = 3, groups = { "sanity", "regression" })
	public void AllHeader_dropdown() {
		headerDropdwn = new AllHeaderDropDowns(driver);
		try {
			logger.info("**** Starting TC03_AllHeaderDropDown testcase ****");
			headerDropdwn = new AllHeaderDropDowns(driver);

			
		//Capture the data from Company dropdown
			headerDropdwn.ClickOnCompany();
			logger.info("Clicked on Company Dropdown");
			
			screenshot("Company_Dropdown");
			logger.info("Captured screenshot of People Dropdown");
			
			List<String> headerData = headerDropdwn.CompanyDropdown();
			excelUtilities.setListData(filePath, "Header", excelColumn++, headerData);
			logger.info("Captured list on Company Dropdown");

			
		//Capture the data from ServiceLine dropdown	
			headerDropdwn.clickOnServiceLine();
			logger.info("Clicked on Service Line Dropdown");
			
			screenshot("ServiceLine_Dropdown");
			logger.info("Captured screenshot of ServiceLine Dropdown");
			
			List<String> serviceLineData = headerDropdwn.SeviceLineDropdown();
			excelUtilities.setListData(filePath, "Header", excelColumn++, serviceLineData);
			logger.info("Captured list on Service Line Dropdown");

			
		//Capture the data from SalesResource dropdown	
			headerDropdwn.clickOnSalesResource();
			logger.info("Clicked on Sales Resource Dropdown");
			
			screenshot("SalesResources_Dropdown");
			logger.info("Captured screenshot of SalesResources Dropdown");
			
			List<String> salesResData = headerDropdwn.SaleResourceDropdown();
			excelUtilities.setListData(filePath, "Header", excelColumn++, salesResData);
			logger.info("Captured list on Sales Resource Dropdown");
			
			
		//Capture the data from Market And Countries dropdown
			headerDropdwn.ClickOnMarketAndCountry();
			logger.info("Clicked on Market And Countries Dropdown");
			
			screenshot("MarketAndCountry_Dropdown");
			logger.info("Captured screenshot of MarketAndCountry Dropdown");
			
			List<String> marketData = headerDropdwn.MarketAndCountriesDropdown();
			excelUtilities.setListData(filePath, "Header", excelColumn++, marketData);
			logger.info("Captured list on Dropdown");

			
		//Capture the data from Corporate Function dropdown	
			headerDropdwn.clickOnCorporateFunction();
			logger.info("Clicked on Corporate Function Dropdown");
			
			screenshot("CorporateFunction_Dropdown");
			logger.info("Captured screenshot of Corporate Function Dropdown");
			
			List<String> corporateData = headerDropdwn.CorporateFunctionsDropdown();
			excelUtilities.setListData(filePath, "Header", excelColumn++, corporateData);
			logger.info("Captured list on Corporate Function Dropdown");


		//Capture the data from People dropdown	
			headerDropdwn.clickOnPeopleDroDown();
			logger.info("Clicked on People Dropdown");
			
			screenshot("People_Dropdown");
			logger.info("Captured screenshot of People Dropdown");
			
			List<String> peopleData = headerDropdwn.PeopleDropdown();
			excelUtilities.setListData(filePath, "Header", excelColumn++, peopleData);
			logger.info("Captured list on People Dropdown");

			logger.info("**** Finished TC03_AllHeaderDropDown testcase ****");

		} catch (Exception e) {
			System.out.println(e);
			logger.error("TC03 Failed");
			Assert.fail();
		}
	}

}
