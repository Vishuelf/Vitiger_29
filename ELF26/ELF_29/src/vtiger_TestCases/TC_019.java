package vtiger_TestCases;

import org.testng.annotations.Test;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_019 extends BaseClass{
	public POMRepository hm;

    
	@Test
	public void fillAndCancel() {
		hm=new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		hm.getSaveBtn().click();
	}
	

}
