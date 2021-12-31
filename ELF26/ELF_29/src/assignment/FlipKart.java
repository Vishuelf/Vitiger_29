package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("keypadMObiles",Keys.ENTER);


		driver.findElement(By.xpath("//img[contains(@src,'https://rukminim1.flixcart.com/image/312/312/jza5uvk0/mobile/g/h/8/lava-a3-a3-original-i')]")).click();
		driver.findElement(By.xpath("//div[text()='Kechaoda K116']")).click();
		driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/312/312/jza5uvk0/mobile/z/r/z/lava-a3-a3-original-imafftvgyd53gean.jpeg?q=70']")).click();

		Set<String> childwindow = driver.getWindowHandles();
		childwindow.remove(parentwindow);
		for (String loop : childwindow) {  
			driver.switchTo().window(loop);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();

		
	
		driver.findElement(By.xpath("//a[text()='Kechaoda K116']/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();
	}


	}


