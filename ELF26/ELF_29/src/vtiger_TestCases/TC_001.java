package vtiger_TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_001 extends BaseClass {
	
	public POMRepository hm;
	@Test
	
	public void  NavigateToLeadPage() {
		String ActualPage = " http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing";
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		
		String expectedPage = driver.getCurrentUrl();
		SoftAssert assert1=new SoftAssert();
		assert1.assertNotEquals(ActualPage, expectedPage);
		
		Reporter.log("CreatNewLead page is displaying",true);
		assert1.assertAll();
		
	
	}

}
