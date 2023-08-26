package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPage {
	public DocumentsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Documents")
	private WebElement Documentslink;

	@FindBy(linkText = "Create a Document")
	private WebElement CreateDocumentsIcon;


	@FindBy(xpath = "//img[@title=\"Create Document...\"]")
	private WebElement TitleTextField;

	@FindBy(xpath = "//input[@name=\"button\"][1]")
	private WebElement SaveButton;

	public WebElement getDocumentslink() {
		return Documentslink;
	}

	public WebElement getCreateDocumentsIcon() {
		return CreateDocumentsIcon;
	}

	public WebElement getTitleTextField() {
		return TitleTextField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}



}
