package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthelfbatch@rediffmail.com");
		
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("vishu");
	
		WebElement Frameelement = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(Frameelement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("hi sir good evening its working");
		driver.switchTo().defaultContent();
	
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[@title='vishu']/..//cite[@class='rd_mail_tickbox']")).click();
		driver.findElement(By.xpath("//span[@class='rd_fil_del']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();

	}

	}


