package contacts;

import org.testng.annotations.Test;

import generics.Baseclass;
import generics.ExcelUtility;

public class ST_CONTACTS1_02 extends Baseclass {
	//@Test(dataProvider  ="testdata")
	@Test(dataProvider = "testdata", dataProviderClass = ExcelUtility.class)

	//public void Creating_a_contact_with_valid_details_eu(String TextButton, String LastName) throws InterruptedException 
	public void Creating_a_contact_with_valid_details_eu() throws InterruptedException
	{
 
		contact.getContactsButton().click();

		contact.getCreateNewContactButton().click();

		//contact.getSalutationTypeButton().click();

		//utility.handlingDropDown(contact.getSalutationTypeButton(),"Ms.");
 

 		//contact.getTextButton().sendKeys(TextButton);
 		//contact.getTextButton().sendKeys("manjula");
		Thread.sleep(2000);

		//contact.getLastNameTextField().sendKeys(LastName);
		contact.getLastNameTextField().sendKeys("p");
		Thread.sleep(2000);
   
 
		contact.getSaveButton().click(); 
		Thread.sleep(2000);
		
//		utility.mouseHoveringOnElement(driver,home.getAdminIcon());
//		home.getSignoutButton().click();
		
//		driver.get(property.readingDataFromPropertyFile("url"));
//		login.loginToApplication(property.readingDataFromPropertyFile("username"), property.readingDataFromPropertyFile("password"));
	}
}  
    