package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage
{
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Leads")
	private WebElement LeadsButton;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement CreatLeadsButton;
	
	@FindBy(name = "salutationtype")
	private WebElement salutationtypeDropDown;
	
	@FindBy(xpath = "//option[@value='Ms.']")
	private WebElement MsButton;
	
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	private WebElement firstnameTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTextField;
	
	@FindBy(name = "company")
	private WebElement companyTextField;
	
	@FindBy(xpath = "//input[@name=\"button\"][1]")
	private WebElement SaveButton;
	
	@FindBy(linkText = "Leads")
	private WebElement LeadsButton1;
	
	@FindBy(name = "selected_id")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@class=\"crmbutton small delete\"]")
	private WebElement deletebutton;
	
	public WebElement getLeadsButton1() {
		return LeadsButton1;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getDeletebutton() {
		return deletebutton;
	}
	public WebElement getLeadsButton() {
		return LeadsButton;
	}
	public WebElement getCreatLeadsButton() {
		return CreatLeadsButton;
	}
	public WebElement getSalutationtypeDropDown() {
		return salutationtypeDropDown;
	}
	public WebElement getMsButton() {
		return MsButton;
	}
	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}
	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}
	public WebElement getCompanyTextField() {
		return companyTextField;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}

}
