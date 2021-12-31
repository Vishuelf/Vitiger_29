package vtiger_TestCases;

import org.testng.annotations.Test;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_010A extends BaseClass {

	public POMRepository hm;

	@Test
	public void userCheck() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");
		
		hm.getUsrCheckBox().click();

}
}