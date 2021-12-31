package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement signLink;
	@FindBy(linkText = "Sign Out") WebElement signOutBtn;


	public WebElement getSignLink() {
		return signLink;
	}


	public WebElement getSignOutBtn() {
		return signOutBtn;
	}



}
