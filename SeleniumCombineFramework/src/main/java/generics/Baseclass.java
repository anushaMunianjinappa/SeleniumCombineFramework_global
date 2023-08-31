 package generics;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ContactPage;
import objectRepository.DocumentsPage;
import objectRepository.EmailPage;
import objectRepository.HomePage;
import objectRepository.LeadsPage;
import objectRepository.LoginPage;
import objectRepository.OrganisationPage;
import objectRepository.ProductPage;
import objectRepository.TroubleTicketPage;

public class Baseclass {
	public static WebDriver driver;
	public PropertyUtility property;
	public WebDriverUtility utility;
	public LoginPage login;
	public HomePage home;
	public ContactPage contact;
	public OrganisationPage organisation;
	public LeadsPage leads;
	public ProductPage product;
	public TroubleTicketPage troubleticket;
	public EmailPage email;
	public DocumentsPage documents;
	
	@BeforeClass
	public void launchingBrowser()
	{ 
		property = new PropertyUtility();
		utility = new WebDriverUtility();

		if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox"))
		{
//			System.setProperty("webdriver.chrome.driver", "")
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(property.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void navigatingtoApplication()
	{
		login = new LoginPage(driver);
		home = new HomePage(driver);
		contact= new ContactPage(driver);
		organisation = new OrganisationPage(driver);
		leads = new LeadsPage(driver);
		product= new ProductPage(driver);
		troubleticket= new TroubleTicketPage(driver);
		email=new EmailPage(driver);
		documents = new DocumentsPage(driver);
		
		driver.get(property.readingDataFromPropertyFile("url"));
		login.loginToApplication(property.readingDataFromPropertyFile("username"), property.readingDataFromPropertyFile("password"));
	}
	@AfterMethod
	public void signOutFromApplication() 
	{
		login = new LoginPage(driver);
		home = new HomePage(driver);
		try {
		utility.mouseHoveringOnElement(driver,home.getAdminIcon());
		home.getSignoutButton().click();
		} catch(Exception e) {
			e.printStackTrace();
		
		//home.getSignoutButton().click();
		System.out.println("signed out");
		}
	}
	@AfterClass
	public void closingTheBrowser()
	{ 
		driver.quit();	
	}
}
