package vtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public  WebDriver driver;
	public LoginPage lg;
	public LogoutPage lo;
	public ReadDataFromExcel read;
	public String excel="./resorces/Book1.xlsx";


	@BeforeClass
	public void LaunchingTheBrowser() {
		String ActualUrl = "http://localhost:8888/";
		System.setProperty("webdriver.chrome.driver","./drivers/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl, expectedUrl, "User not able to navigate to the login page");
		Reporter.log("Login page is displaying",true);
	}  

	@BeforeMethod
	public void LoginTotheApp() throws EncryptedDocumentException, IOException {
		String actualPage = "http://localhost:8888/index.php?action=index&module=Home";
		read=new ReadDataFromExcel();
		lg=new LoginPage(driver);
		lg.getUserNameField().sendKeys(read.getDataFromExel(excel, 0, 0, "sheet1"));
		lg.getPasswordField().sendKeys(read.getDataFromExel(excel, 0, 1, "sheet1"));
		lg.getLogInBtn().click();
		String expectedPage = driver.getCurrentUrl();
		Assert.assertEquals(actualPage, expectedPage, "user is not able to navigate to the homepage");
		Reporter.log("Home page is open",true);
	}

	@AfterMethod
	public void  LogouttheApp() {
		String Actualpage = "vtiger CRM 5 - Commercial Open Source CRM";
		lo=new LogoutPage(driver);
		WebElement ele = lo.getSignLink();
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		lo.getSignOutBtn().click();
		String expectedpage = driver.getTitle();
		Assert.assertEquals(Actualpage, expectedpage, "user is not able to logout the application");
		Reporter.log("user is successfully logout the application",true);
	}

	@AfterClass
	public void ClosetheBrowser() {
		driver.quit();

	}


}



