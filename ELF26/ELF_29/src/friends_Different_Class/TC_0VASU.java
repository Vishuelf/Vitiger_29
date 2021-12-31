package friends_Different_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_0VASU {
	@Parameters({"vishu","browser","url","url2"})
	@Test(groups = "hot")
	public void crush(String Name, 
						String broserName,
						String appUrl1,
						String appUrl2)
	{
		//Reporter.log("Counter Queen",true);
		System.out.println(Name);
		if(broserName.equalsIgnoreCase("vishu")){
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(appUrl1);
		}else {
			System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(appUrl2);
			
		}
		
	}

}
