package vtiger_TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_007 extends BaseClass {
	public POMRepository hm;
	@Test
	public void industryDrop() {
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");
		
		WebElement ele = hm.getIndustryDropDown();
		Select s= new Select(ele);
		s.selectByIndex(2);
		
	}

}
