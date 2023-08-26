package organisation;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_ORGANISATION_01_Test extends Baseclass {
	@Test
	public void Creating_a_organisation_with_valid_details_ft() throws InterruptedException {
		
		organisation.getOrganizationsButton().click();
		
		organisation.getCreateOrganizationButton().click();
		
		organisation.getAccountnameTextField().sendKeys("arpitha");
		
		organisation.getSavebutton().click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		

	}

}
        