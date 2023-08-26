package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Products")
	private WebElement productLink;
	
	@FindBy(xpath = "//a[@href=\"index.php?module=Products&action=EditView&return_action=DetailView&parenttab=Inventory\"][1]")
	private WebElement createProductIcon;
	
	@FindBy(xpath = "//select[@name=\"productcategory\"]")
	private WebElement productcategoryropdown;
	
	@FindBy(xpath = "//input[@name=\"productname\"]")
	private WebElement productnameTextField;

	@FindBy(xpath = "//option[@value=\"Software\"]")
	private WebElement SoftwareDopDown;
	
	@FindBy(xpath = "//input[@name=\"button\"][1]")
	private WebElement SaveButton;
	
	public WebElement getProductLink() {
		return productLink;
	}
	public WebElement getCreateProductIcon() {
		return createProductIcon;
	}
	public WebElement getProductnameTextField() {
		return productnameTextField;
	}
	public WebElement getProductcategoryDropDown() {
		return productcategoryropdown;
	}
	public WebElement getSoftwareDopDown() {
		return SoftwareDopDown;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}

}
