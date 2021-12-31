package friends_Different_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_0VISHU {
	@Test(groups = "hunk")
	public void handsum_Hunk()
	{
		Reporter.log("He is the Handsome in the class",true);
	
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://www.trivago.com/");
	}

}
