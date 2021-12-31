package vtiger_TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_014 extends BaseClass{
	public POMRepository hm;

	@Test
	public void creatNewLeadByGivingInvalidInputToNoOfEmployee() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		String actaulText = "Invalid No Of Employees";
		String ActualPage = " http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing";
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();

		String expectedPage = driver.getCurrentUrl();
		SoftAssert assert1=new SoftAssert();
		assert1.assertNotEquals(ActualPage, expectedPage);

		Reporter.log("CreatNewLead page is displaying",true);

		hm.getCompanyfield().sendKeys("elf");
		hm.getLastNameField().sendKeys("vishu");
		hm.getFirstFiled().sendKeys("chinni");
		hm.getTitleFiled().sendKeys("TY Team");
		hm.getAnualField().sendKeys("2");
		hm.getEmpField().sendKeys("asdf");


		hm.getSaveBtn().click();
		String expectedtext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		assert1.assertNotEquals(actaulText, expectedtext);
		Reporter.log(actaulText,true);


	}


}
