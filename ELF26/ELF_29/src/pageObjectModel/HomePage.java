package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[3text()='✕']")
	private WebElement close;
	
	@FindBy(xpath = "//img[contains(@src,'https://rukminim1.flixcart.com/image/312/312/jza5uvk0/mobile/g/h/8/lava-a3-a3-original-i')]")
	private WebElement phone1;
	
	@FindBy(xpath = "//div[text()='SPICE STYLE']")
	private WebElement phone2;

	@FindBy(xpath = "//img[@src='https://rukminim1.flixcart.com/image/312/312/jza5uvk0/mobile/z/r/z/lava-a3-a3-original-imafftvgyd53gean.jpeg?q=70']")
	private WebElement phone3;
	
	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement cartBtn;
	
	@FindBy(xpath = "//button[text()='GO TO CART']")
	private WebElement addBtn;
	
	
	
	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getPhone1() {
		return phone1;
	}

	public WebElement getPhone2() {
		return phone2;
	}

	public WebElement getPhone3() {
		return phone3;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}
	
	
	
	
	
	
}
