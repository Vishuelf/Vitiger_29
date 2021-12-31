package testNGProject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_023 { 

	@Test(dependsOnMethods = "crush_Account")
	public void Creat_Visu()
	{
      Reporter.log("VISHU",true);
	}
	@Test()
	public void modified_Account()
	{
		Reporter.log("VISHU,SUHAS,ABHI",true);
	}
	@Test()
	public void upadte_Account()
	{
		Reporter.log("VISHU,SUHAS,ABHI,GIRI,VASU",true);
	}
	@Test()
	public void crush_Account()
	{
		Reporter.log("GIRI",true);
		Reporter.log("ur not accepted my propose",true);
		
	}
}
