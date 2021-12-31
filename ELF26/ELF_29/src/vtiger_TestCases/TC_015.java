package vtiger_TestCases;

import org.testng.annotations.Test;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_015 extends BaseClass {

	public POMRepository hm;

	@Test
	public void different_email() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");
	
		hm.getEmailFiled().sendKeys("sweetarpita91@gmail.com");
		hm.getSecondaryMailField().sendKeys("sambit.17@gmail.com");
		hm.getSaveBtn().click();
		

}
}
