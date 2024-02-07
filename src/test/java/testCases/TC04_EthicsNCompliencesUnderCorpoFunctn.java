package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.EthicsNCompliancesUnderCorpFnctn;
import testBase.BaseClass;


public class TC04_EthicsNCompliencesUnderCorpoFunctn extends BaseClass{
	
	@Test(priority=4,groups={"sanity","regression"})
	public void EthicsNComplience() {
		try {
		logger.info("**** Starting TC04_EthicsNCompliencesUnderCorpoFunctn testcases ****");
		EthicsNCompliancesUnderCorpFnctn ethics = new EthicsNCompliancesUnderCorpFnctn(driver);
		
		
		ethics.ClickOnCorp();
		logger.info("Click on the Corporate Function dropdown");
		
		ethics.HoverOnLegalNCorpoAffairs();
		logger.info("Hover mouse on the Legal And Corporate Affair dropdown");
		
		screenshot("hoverOnLegalNCopr");
		logger.info("Captured screenshot of mouse hovering on Legal and corp Affairs");
		
		ethics.ClickOnEthicsNCompliences();
		logger.info("Click on the Ethics And Compliences Link");
	
		logger.info("**** Finished TC04_EthicsNCompliencesUnderCorpoFunctn testcases ****");
		}
		catch(Exception e) {
			System.out.println(e);
			logger.error("TC_04 failed");
			Assert.fail();
		}
	}

}
