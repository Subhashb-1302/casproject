package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.ProfileVerification;
import testBase.BaseClass;


public class TC01_ProfileVerification extends BaseClass {
	
	@Test (priority=1,groups= {"sanity"})
	public void profile_Verification() {
		try {
			logger.info("*** Starting TC01_ProfileVerification TestCase ***");
			ProfileVerification prof = new ProfileVerification(driver);
			
			
			prof.clickOnProfile();
			logger.info("Clicked on Profile in Be.cognizant Page");
			
			//Thread.sleep(2000);
			prof.captureProfileName();
			logger.info("Captured the Profile Name in Be.cognizant Page");		
			
			//Thread.sleep(2000);
			prof.captureProfileEmail();
			logger.info("Captured the Profile Email in Be.cognizant Page");
		
			//Thread.sleep(2000);
			screenshot("ProfileScrshot");
			logger.info("profile screenshot was captured");
			
			logger.info("*** Finished Profile Verification TestCase ***");
		} 
		catch(Exception e) {
			System.out.println(e);
			logger.error("TC01 Failed");
			Assert.fail();
		}
		
	}

}
