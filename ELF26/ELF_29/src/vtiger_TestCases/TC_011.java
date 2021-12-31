package vtiger_TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_011 extends BaseClass {
	public POMRepository hm;

	@Test
	public void creatNewLeadByGivingValidInputToAnnualRevenue() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		String actualPage2 = " http://localhost:8888/index.php?action=DetailView&module=Leads&record=10&parenttab=Marketing&viewname=0&start=";
		String ActualPage = " http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing";
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();

		String expectedPage = driver.getCurrentUrl();
		SoftAssert assert1=new SoftAssert();
		assert1.assertNotEquals(ActualPage, expectedPage);

		Reporter.log("CreatNewLead page is displaying",true);
		hm.getLastNameField().sendKeys("BN");
		hm.getCompanyfield().sendKeys("ELF");
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");
		hm.getAnualField().sendKeys("2");
		hm.getSaveBtn().click();
		String expectdPage2 = driver.getCurrentUrl();

		assert1.assertNotEquals(actualPage2, expectdPage2);
		Reporter.log("new lead is created and unique lead no is generated ",true);





	}


}
