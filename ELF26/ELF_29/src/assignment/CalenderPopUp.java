package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions a=new Actions(driver);
		a.click().perform();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		int date=18;
		String mn="Apr";
		int yr=2022;
		pass(driver,mn,date,yr);
		

	}

	private static void pass(WebDriver driver, String mn, int date, int yr) {
	  for(;;) {
		  try{driver.findElement(By.xpath("//div[contains(@aria-label,'"+mn+" "+date+" "+yr+"')]" )).click();
		  break;
		  }catch (NoSuchElementException e) {
			// TODO: handle exception
			  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
	  }
		
	}

}
