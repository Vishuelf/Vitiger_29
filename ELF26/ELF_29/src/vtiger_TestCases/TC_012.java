package vtiger_TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_012 extends BaseClass {

	public POMRepository hm;

	@Test
	public void creatNewLeadByGivingInvalidInputToAnnualRevenue() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		String actual = "Invalid Annual Revenue";
		String ActualPage = " http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing";
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();

		String expectedPage = driver.getCurrentUrl();
		SoftAssert assert1=new SoftAssert();
		assert1.assertNotEquals(ActualPage, expectedPage);

		Reporter.log("CreatNewLead page is displaying",true);;
		hm.getLastNameField().sendKeys("BN");
		hm.getCompanyfield().sendKeys("ELF");
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");
		hm.getAnualField().sendKeys("ydf");
		hm.getSaveBtn().click();
		String expected = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		assert1.assertNotEquals(actual, expected);
		Reporter.log(actual,true);


	}


}
