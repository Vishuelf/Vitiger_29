package testSCript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	public PomClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
   //login action
      @FindBy(id="email")
      private WebElement userNameField;
      
      @FindBy(id="password")
      private WebElement psswordField;
      
      @FindBy(id="loginButton")
      private WebElement logBtn;

	public WebElement getUserNameField() {
		return userNameField;
	}

	public WebElement getPsswordField() {
		return psswordField;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}
     //logout
	@FindBy(id="myAccountButton")
	private WebElement logOutAcc;
	
	@FindBy(linkText="Log Out")
	private WebElement logbtn;

	public WebElement getLogOutAcc() {
		return logOutAcc;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}
      

}

