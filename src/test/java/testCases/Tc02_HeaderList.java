package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HeaderList;
import testBase.BaseClass;


public class Tc02_HeaderList extends BaseClass {
	
	@Test(priority=2,groups={"sanity","regression"})
	public void Header_list() {
		try {
			logger.info("*** Starting Tc02_HeaderList TestCase ***");
			HeaderList head = new HeaderList(driver);
			logger.info("Capturing the list of Header available in Be.cognizant Page");
			//Thread.sleep(5000);
			
			screenshot("Header_View");
			logger.info("HeaderView screenshot was captured");
			
			head.headerInfo();
			logger.info("*** Finished Tc02_HeaderList TestCase ***");
		} 
		catch(Exception e){
			System.out.println(e);
			logger.error("TC02 Failed");
			Assert.fail();
		}
	}
}