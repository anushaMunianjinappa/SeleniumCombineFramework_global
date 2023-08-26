package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href=\"index.php?module=Accounts&action=index\"]")
	private WebElement OrganizationsButton;
	
	@FindBy(xpath = "//img[@title=\"Create Organization...\"]")
	private WebElement CreateOrganizationButton;
	
	@FindBy(name="accountname")
	private WebElement accountnameTextField;
	
	@FindBy(name = "button")
	private WebElement savebutton;
	
	@FindBy(linkText = "Organizations")
	private WebElement OrganizationsButton1;
	
	public WebElement getOrganizationsButton1() {
		return OrganizationsButton1;
	}
	public WebElement getOrganizationsButton() {
		return OrganizationsButton;
	}
	public WebElement getCreateOrganizationButton() {
		return CreateOrganizationButton;
	}
	public WebElement getAccountnameTextField() {
		return accountnameTextField;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	
}
