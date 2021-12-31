package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMRepository {
	public POMRepository(WebDriver diver) {
		PageFactory.initElements(diver, this);
	}
	@FindBy(linkText = "Leads") private WebElement leadLink;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement newleadBtn;

	@FindBy(name = "lastname") private WebElement lastNameField;
	@FindBy(name = "company") private WebElement companyfield;
	@FindBy(name = "button") private WebElement saveBtn;

	@FindBy(name = "firstname") private WebElement firstFiled;
	@FindBy(id = "designation") private WebElement titleFiled;
	@FindBy(name = "leadsource") private WebElement dropDown;
	@FindBy(id = "noofemployees") private WebElement noEmpField;
	@FindBy(name = "annualrevenue") private WebElement anualField;
	@FindBy(id = "secondaryemail") private WebElement secondaryMailField;
	@FindBy(id="phone") private WebElement phoneFiled;
	@FindBy(id = "mobile") private WebElement mobiletextField;
	@FindBy(id = "email") private WebElement emailFiled;
	@FindBy(name = "leadsource") private WebElement leadDropDown;
	@FindBy(name = "industry") private WebElement industryDropDown;
	@FindBy(name = "leadstatus") private WebElement leadStatusdropDown;
	@FindBy(name = "rating") private WebElement ratingDrpDwon;
	@FindBy(xpath = "//input[@value='T']") private WebElement grpCheckBox;
	@FindBy(xpath = "//input[@value='U']") private WebElement usrCheckBox;
	@FindBy(name = "lane") private WebElement streetField;
	@FindBy(id = "code") private WebElement postalCodeField;
	@FindBy(id = "city") private WebElement cityField;
	@FindBy(id = "country") private WebElement contryField;
	@FindBy(id = "state") private WebElement stateField;
	@FindBy(name = "description") private WebElement descriptionField;
	@FindBy(xpath = "//input[@title='Cancel [Alt+X]']") private WebElement cancelbtn;
	@FindBy(id = "noofemployees") private WebElement empField;




	public WebElement getEmpField() {
		return empField;
	}
	public WebElement getLeadLink() {
		return leadLink;
	}
	public WebElement getNewleadBtn() {
		return newleadBtn;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}
	public WebElement getCompanyfield() {
		return companyfield;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}


	public WebElement getFirstFiled() {
		return firstFiled;
	}
	public WebElement getTitleFiled() {
		return titleFiled;
	}

	public WebElement getDropDown() {
		return dropDown;
	}
	public WebElement getNoEmpField() {
		return noEmpField;
	}
	public WebElement getAnualField() {
		return anualField;
	}
	public WebElement getSecondaryMailField() {
		return secondaryMailField;
	}
	public WebElement getPhoneFiled() {
		return phoneFiled;
	}

	public WebElement getMobiletextField() {
		return mobiletextField;
	}
	public WebElement getEmailFiled() {
		return emailFiled;
	}
	public WebElement getLeadDropDown() {
		return leadDropDown;
	}
	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}
	public WebElement getLeadStatusdropDown() {
		return leadStatusdropDown;
	}
	public WebElement getRatingDrpDwon() {
		return ratingDrpDwon;
	}
	public WebElement getGrpCheckBox() {
		return grpCheckBox;
	}
	public WebElement getUsrCheckBox() {
		return usrCheckBox;
	}
	public WebElement getStreetField() {
		return streetField;
	}
	public WebElement getCityField() {
		return cityField;
	}
	public WebElement getContryField() {
		return contryField;
	}
	public WebElement getStateField() {
		return stateField;
	}
	public WebElement getDescriptionField() {
		return descriptionField;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	public WebElement getPostalCodeField() {
		return postalCodeField;
	}







}
