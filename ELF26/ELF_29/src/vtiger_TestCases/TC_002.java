package vtiger_TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import vtiger.BaseClass;
import vtiger.POMRepository;


public class TC_002 extends BaseClass{
	
	public POMRepository hm;
	
	@Test
	public void creatNewLeadbByfillAllTheFieldsAndSave() {
		String actualPage1 = "Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
		String actualPage2 = " http://localhost:8888/index.php?action=DetailView&module=Leads&record=10&parenttab=Marketing&viewname=0&start=";
		hm=new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		String expectedPage1= driver.getTitle();
		SoftAssert assert1=new SoftAssert();
		assert1.assertNotEquals(actualPage1, expectedPage1);
		
		Reporter.log("CreatNewLead page is displaying",true);
		
		
	
		
		hm.getLastNameField().sendKeys("vishu");
		hm.getCompanyfield().sendKeys("TY");
		hm.getSaveBtn().click();
		String expectdPage2 = driver.getCurrentUrl();
		assert1.assertNotEquals(actualPage2, expectdPage2);
		Reporter.log("new lead is created and unique lead no is generated ",true);
		
		
	}

}
