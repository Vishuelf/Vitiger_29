package vtiger_TestCases;

import org.testng.annotations.Test;

import vtiger.BaseClass;
import vtiger.POMRepository;


public class TC_017 extends BaseClass {
	public POMRepository hm;

	@Test
	public void invalid_email() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");
	
	    hm.getPhoneFiled().sendKeys("222");
	    hm.getMobiletextField().sendKeys("222");
		hm.getSaveBtn().click();
	}


}
