package assignment;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrivagoNotHardcoded {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions a=new Actions(driver);
		
		LocalDateTime idt1= LocalDateTime.now();
		
		  String month = idt1.getMonth().toString();
		int day = idt1.getDayOfMonth();
		int year = idt1.getYear();
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
		
		driver.get("https://www.trivago.com/");
		WebElement element = driver.findElement(By.id("onetrust-accept-btn-handler"));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(element));
		a.click(element).perform();
		driver.findElement(By.xpath("//span[text()='Check in']")).click();
		pass(driver,year,month,day);
	}
	
	
	
		public static void pass(WebDriver driver, int year,String month, int day) {
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//time[contains(@datetime,'"+year+" "+month+" "+day+"')]")).click();
				//driver.findElement(By.xpath("//time[contains(@datetime,'"+year+" "+month+" "+day+"')]")).click(); 
				
				break;
				
			}catch(NoSuchElementException e) {
			driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
			}
		}
		
	}	
		

	
	
}
