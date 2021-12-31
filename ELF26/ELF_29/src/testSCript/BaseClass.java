package testSCript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	PomClass p;
	
	@BeforeClass
	public void launchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 driver.get("https://app.invoiceninja.com/");
	}
	
	@Parameters({"Url","ActualUser","ActualPass"})
	@BeforeMethod
	public void loginApplication(String Url, String ActuaUser, String ActualPass)
	{
		driver.get(Url);
	    p=new PomClass(driver);
	    p.getUserNameField().clear();
		p.getUserNameField().sendKeys(ActuaUser);
		String ExpectedUser = p.getUserNameField().getAttribute("value"); 
		
		p.getPsswordField().clear();
		p.getPsswordField().sendKeys(ActualPass);
		String ExpectedPass = p.getPsswordField().getAttribute("value");
		p.getLogBtn().click();
		
		if((ActuaUser.equalsIgnoreCase(ExpectedUser)) && (ActualPass.equalsIgnoreCase(ExpectedPass))) {
			System.out.println("User able to Successfully login");
		}else { 
			System.err.println("failed");
		}
	}
	
	
	@AfterMethod
	public void logoutAppliction() {
		p.getLogOutAcc().click();
		p.getLogbtn().click();
	}
	
	@AfterClass
	public void closingTheBrowser(){
		driver.quit();
	}

}
