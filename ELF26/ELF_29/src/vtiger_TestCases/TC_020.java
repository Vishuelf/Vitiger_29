package vtiger_TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import vtiger.BaseClass;
import vtiger.POMRepository;

public class TC_020 extends BaseClass{
	public POMRepository hm;
	public JavascriptExecutor js;
    
	@Test
	public void fillAndCancel() {
		hm=new POMRepository(driver);
		hm= new POMRepository(driver);
		js=(JavascriptExecutor) driver;
		hm.getLeadLink().click();
		hm.getNewleadBtn().click();
		hm.getLastNameField().sendKeys("vishu");
		hm.getTitleFiled().sendKeys("TY Team");
	
	    hm.getPhoneFiled().sendKeys("222");
	    hm.getMobiletextField().sendKeys("222");
	    js.executeScript("window.scrollBy(0,2000);");
	    hm.getFirstFiled().sendKeys("Abhi");
	    hm.getStateField().sendKeys("suhas");
	    hm.getStreetField().sendKeys("vasu");
	    hm.getPostalCodeField().sendKeys("0215");
	    hm.getContryField().sendKeys("india");
	    hm.getDescriptionField().sendKeys("hii we are the best friend in TY",Keys.ENTER,"i love you",Keys.ENTER,"vishu");
		hm.getCancelbtn().click();
	}


}
