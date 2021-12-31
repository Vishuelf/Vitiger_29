package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import vtiger.LoginPage;

public class PropertyFile {
	public  WebDriver driver;
	public  LoginPage lg;

	@Test
	public void log() throws IOException {
		// TODO Auto-generated method stub
		lg=new LoginPage(driver);
		File file=new File("./resorces/data.properties");
		FileInputStream read=new FileInputStream(file);
		Properties p=new Properties();
		p.load(read);
		String url = p.getProperty("Url");
		String user = p.getProperty("username");
		String pass = p.getProperty("password");
		

		System.setProperty("webdriver.chrome.driver","./drivers/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		lg.getUserNameField().sendKeys(user);
		lg.getPasswordField().sendKeys(pass);
		lg.getLogInBtn().click();
	}
		

	}


