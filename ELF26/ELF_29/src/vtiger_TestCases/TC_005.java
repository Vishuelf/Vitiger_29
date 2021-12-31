package vtiger_TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import vtiger.BaseClass;
import vtiger.POMRepository;


public class TC_005 extends BaseClass {
	public POMRepository hm;
	@Test
	public void creatNewLeadbykeepAllTheMandatoryFieldBlankAndSave() {
		String actualText = "Last Name cannot be empty";
		String ActualPage = " http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing";
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		
		String expectedPage = driver.getCurrentUrl();
		SoftAssert assert1=new SoftAssert();
		assert1.assertNotEquals(ActualPage, expectedPage);
		
		Reporter.log("CreatNewLead page is displaying",true);
		hm.getNewleadBtn().click();
		hm.getFirstFiled().sendKeys("Vishwa") ;
		hm.getTitleFiled().sendKeys("TY PPL");
	    hm.getAnualField().sendKeys("100");
	    hm.getEmailFiled().sendKeys("vishu@gmail.com");
	   
	    hm.getSaveBtn().click();
	    String expectedText = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
Assert.assertEquals(actualText, expectedText, "not Handled");
		
		Reporter.log(expectedText,true);
		
		
	}

}
