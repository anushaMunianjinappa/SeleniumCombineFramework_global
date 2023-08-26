package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {
	public EmailPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Email")
	private WebElement EmaiLink;
	@FindBy(linkText = "Compose")
	private WebElement ComposeLink;
	@FindBy(xpath = "//input[@name=\"parent_name\"]")
	private WebElement ParentName;
	@FindBy(xpath = "//input[@name=\"button\"][2]")
	private WebElement SaveButton;
	public WebElement getEmaiLink() {
		return EmaiLink;
	}
	public WebElement getComposeLink() {
		return ComposeLink;
	}
	public WebElement getParentName() {
		return ParentName;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}
	

}
