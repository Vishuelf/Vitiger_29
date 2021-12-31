package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalinderPopUpTrivago {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		driver.get("https://www.trivago.com/");
		WebElement element = driver.findElement(By.id("onetrust-accept-btn-handler"));
		wait.until(ExpectedConditions.visibilityOf(element));
		Thread.sleep(3000);
		element.click();
		driver.findElement(By.xpath("//span[text()='Check in']")).click();
		int year = 2022;
		String month = "January";
		int day = 26;
		pass(driver,year,month,day);
		
	}
	public static void pass(WebDriver driver, int year, String month, int day) {
		for(;;) {
			try {
				driver.findElement(By.xpath("//time[@datetime=']")).click();
			driver.findElement(By.xpath("//time[@datetime='2022-01-28']")).click();
				
				break;
				
			}catch(NoSuchElementException e) {
			driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
			}
		}
		
		
		

	}

}
