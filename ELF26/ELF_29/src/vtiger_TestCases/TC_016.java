package vtiger_TestCases;

import org.testng.annotations.Test;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_016 extends BaseClass {
	public POMRepository hm;

	@Test
	public void invalid_email() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");
	
		hm.getEmailFiled().sendKeys("gasuhagbdu");
		hm.getSecondaryMailField().sendKeys("hbdyugud");
		hm.getSaveBtn().click();
	}


}
