package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Contacts")
	private WebElement ContactsButton;

	@FindBy(xpath = "//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement CreateNewContactButton;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement FirstNameTextField;
	
	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	@FindBy(xpath = "//input[@name=\"company\"]")
	private WebElement CompanyTextField;

//	@FindBy(xpath = "//select[@name='salutationtype']")
//	private WebElement salutationtypeButton;

//	@FindBy(xpath = "//option[@value='Ms.']")
//	private WebElement MsButton;   
//	
//	@FindBy(xpath ="//input[@name=\"firstname\"]")
//	private WebElement TextButton; 
	 
	public WebElement getCompanyTextField1() {
		return CompanyTextField;
	}

	@FindBy(xpath = "//input[@name=\"lastname\"]")
	private WebElement lastNameTextField;
	
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@name=\"selected_id\"]")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@class=\"crmbutton small delete\"]")
     private WebElement deleteButton;
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	@FindBy(linkText = "Contacts")
	private WebElement ContactsButton1;

//	public WebElement getSalutationtypeButton() {
//		return salutationtypeButton;
//	}

	public WebElement getContactsButton1() {
		return ContactsButton1;
	}

	public WebElement getContactsButton() {
		return ContactsButton;
	}

	public WebElement getCreateNewContactButton() {
		return CreateNewContactButton;
	}

	public WebElement getCompanyTextField() {
		// TODO Auto-generated method stub
		return CompanyTextField;
	}

//	public WebElement getSalutationTypeButton() {
//		return salutationtypeButton;
//	}

//	public WebElement getMrsButton() {
//		return MsButton;
//	}
//    
//	public WebElement getTextButton()
//	{
//		return TextButton;
//	}
}
