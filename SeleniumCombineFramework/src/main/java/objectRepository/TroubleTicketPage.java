package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketPage {
	public TroubleTicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Trouble Tickets")
	private WebElement TroubleTicketslink;

	@FindBy(xpath = "//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement troubleticketsIcon;

	@FindBy(xpath = "//textarea[@cols=\"30\"]")
	private WebElement troubletickettextfield;
	
	@FindBy(name = "ticketstatus")
	private WebElement ticketstatusDropDown;
	
	@FindBy(xpath = "//option[@value=\"In Progress\"]")
	private WebElement InProgressDropDown;
	
	@FindBy(name = "button")
	private WebElement saveButton;

	@FindBy(linkText = "Trouble Tickets")
	private WebElement TroubleTicketslink1;

	public WebElement getTroubleTicketslink() {
		return TroubleTicketslink;
	}

	public WebElement getTroubleticketsIcon() {
		return troubleticketsIcon;
	}

	public WebElement getTroubletickettextfield() {
		return troubletickettextfield;
	}

	public WebElement getTicketstatusDropDown() {
		return ticketstatusDropDown;
	}

	public WebElement getInProgressDropDown() {
		return InProgressDropDown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getTroubleTicketslink1() {
		return TroubleTicketslink1;
	}

	public WebElement getTicket_titleTextField() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//
//	public WebElement getTroubletickettextfield1() {
//		return troubletickettextfield;
//	}
//	//	@FindBy(xpath = "//textarea[@cols=\"30\"]")
//	//	private WebElement tickettitleTextField;
//	//	 
//	@FindBy(name = "ticketstatus")
//	private WebElement ticketstatusDropDown;
//
//	@FindBy(xpath = "//option[@value=\"In Progress\"]")
//	private WebElement inProgressDropDown;
//
//	@FindBy(name = "button")
//	private WebElement saveButton;
//
//	@FindBy(linkText = "Trouble Tickets")
//	private WebElement TroubleTicketslink1;
//
//	public WebElement getTroubleTicketslink1() {
//		return TroubleTicketslink1;
//	}
//
//	public WebElement getTroubleTicketslink() {
//		return TroubleTicketslink;
//	}
//
//	public WebElement getTroubleticketsIcon() {
//		return troubleticketsIcon;
//	}
//
//	//	public WebElement getTicket_titleTextField() {
//	//		return tickettitleTextField;
//	//	}
//
//	public WebElement getTicketstatusDropDown() {
//		return ticketstatusDropDown;
//	}
//
//	public WebElement getInProgressDropDown() {
//		return inProgressDropDown;
//	}
//
//	public WebElement getSaveButton() {
//		return saveButton;
//	}
//
//	//	public WebElement getTroubletickettextfield() {
//	//		// TODO Auto-generated method stub
//	//		return null;
//	//	}
//	//	


}
