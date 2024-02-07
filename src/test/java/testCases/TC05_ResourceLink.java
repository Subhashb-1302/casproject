package testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ResourceLink;
import testBase.BaseClass;

public class TC05_ResourceLink extends BaseClass {

	@Test(priority = 5, groups = { "sanity", "regression" })
	public void Resource() {

		try {
			logger.info("**** Starting TC05_ResourceLink testcase ****");
			ResourceLink res = new ResourceLink(driver);

			
			res.capturePageHeading();
			logger.info("Captured the Page Heading in Ethics and Compliences Page");

			screenshot("EthicsNCompliences");
			logger.info("Captured the screenshot of Page heading in Ethics N Compliences");

		//Capture Data from Resource Data		
			res.captureTitleOfResourceLink();
			logger.info("Capturing Tittle of Resource/links in Ethics and Compliences Page");

			List<String> resourceLinkData = res.resourceLinkList();
			excelUtilities.setListData(filePath, "Header", excelColumn++, resourceLinkData);
			logger.info("List of links avilable in the resource/ links");

		//Capture Data from Key Ethics & Compliance Focus Areas	
			res.tittleOfKeyFocusArea();
			logger.info("Capturing Tittle of Key Ethics & Compliance Focus Areas");

			screenshot("KeyFocusArea");
			logger.info("Captured the screenshot of Key Ethics & Compliance Focus Areas");

			List<String> focusAreaData = res.listofKeyFocusArea();
			excelUtilities.setListData(filePath, "Header", excelColumn++, focusAreaData);
			logger.info("List avilable under Key Ethics & Compliance Focus Areas");

			logger.info("**** Finished TC05_ResourceLink testcase ****");

		} catch (Exception e) {
			System.out.println(e);
			logger.error("TC_05 failed");
			Assert.fail();
		}
	}

}
