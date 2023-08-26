package organisation;

import org.testng.annotations.Test;

import generics.Baseclass;

public class IT_ORGANISATION_01_Test extends Baseclass {
	@Test
	public void Creating_a_organisation_with_valid_details_it() throws InterruptedException {
		organisation.getOrganizationsButton().click();
		
		organisation.getCreateOrganizationButton().click();
		Thread.sleep(2000);
		
		organisation.getAccountnameTextField().sendKeys("ashwini");
		Thread.sleep(2000);
		
		organisation.getSavebutton().click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();

		organisation.getOrganizationsButton1().click();
		Thread.sleep(2000);
	}
 
}
 