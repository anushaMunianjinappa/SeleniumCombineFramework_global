package contacts;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_CONTACTS_01 extends Baseclass {
@Test
	public void Creating_a_contact_with_valid_details_ft() throws InterruptedException 
	{
		
	contact.getContactsButton().click();
	
	contact.getCreateNewContactButton().click();
	
	//contact.getFirstNameTextField().sendKeys("mamatha");
	
	contact.getLastNameTextField().sendKeys("p");
	
	//contact.getCompanyTextField().sendKeys("qsp");
	
	
	
	//contact.getSalutationTypeButton().click();
	
	//utility.handlingDropDown(contact.getSalutationTypeButton(),"Ms.");

	
//	contact.getMrsButton().click();
	
	//contact.getTextButton().sendKeys("navyaanu");
	contact.getSaveButton().click();
	Thread.sleep(4000);
	} 
} 

         