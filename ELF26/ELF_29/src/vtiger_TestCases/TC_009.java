package vtiger_TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_009 extends BaseClass{
	public POMRepository hm;

	@Test
	public void ratedrop() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");

		WebElement ele = hm.getRatingDrpDwon();
		Select s=new Select(ele);
		s.selectByIndex(1);
		hm.getSaveBtn();
	}

}
