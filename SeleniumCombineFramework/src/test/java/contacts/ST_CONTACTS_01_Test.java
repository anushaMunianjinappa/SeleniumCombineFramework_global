package contacts;

import org.testng.annotations.Test;

import generics.Baseclass;

public class ST_CONTACTS_01_Test extends Baseclass {
	@Test

	public void Creating_a_contact_with_valid_details_st() throws InterruptedException 
	{

		contact.getContactsButton().click();

		contact.getCreateNewContactButton().click();

	//	contact.getSalutationTypeButton().click();
		//utility.handlingDropDown(contact.getSalutationTypeButton(),"Ms.");

//		contact.getMrsButton().click();

		//contact.getTextButton().sendKeys("navya");
		Thread.sleep(2000);

		contact.getLastNameTextField().sendKeys("m");
		Thread.sleep(2000);


		contact.getSaveButton().click();
		Thread.sleep(2000);

		contact.getContactsButton1().click();

		contact.getCheckbox().click();
		Thread.sleep(2000);
		
		contact.getDeleteButton().click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();


		Thread.sleep(4000);
	}

}
