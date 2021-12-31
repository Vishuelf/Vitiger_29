package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name") private WebElement userNameField;
	@FindBy(name = "user_password") private WebElement passwordField;
	@FindBy(id = "submitButton") private WebElement logInBtn;

	public WebElement getUserNameField() {
		return userNameField;
	}
	public WebElement getPasswordField() {
		return passwordField;
	}
	public WebElement getLogInBtn() {
		return logInBtn;
	}



}