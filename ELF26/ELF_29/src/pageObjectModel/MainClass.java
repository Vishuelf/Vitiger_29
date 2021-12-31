package pageObjectModel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://www.flipkart.com/");
		String parent = driver.getWindowHandle();
		
		HomePage page=new HomePage(driver);
		page.getClose().click();
		page.getSearchBar().click();
		page.getSearchBar().sendKeys("keypadMObiles",Keys.ENTER);
		page.getPhone1().click();
		page.getPhone2().click();
		page.getPhone3().click();
		//page.getCartBtn().click();
		Set<String> chil = driver.getWindowHandles();
		chil.remove(parent);
		for(String window:chil) {
			driver.switchTo().window(window);
			page.getAddBtn().click();
		}
		
		 
	}

}
