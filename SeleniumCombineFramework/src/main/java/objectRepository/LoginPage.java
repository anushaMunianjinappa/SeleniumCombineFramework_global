package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name")
	private WebElement usernameTextfield;

	@FindBy(name = "user_password")
	private WebElement passwordTextfield;

	@FindBy(id ="submitButton")
	private WebElement loginButton;

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void loginToApplication(String username, String password) {
		getUsernameTextfield().sendKeys(username);
		getPasswordTextfield().sendKeys(password);
		getLoginButton().click();
	}

}
