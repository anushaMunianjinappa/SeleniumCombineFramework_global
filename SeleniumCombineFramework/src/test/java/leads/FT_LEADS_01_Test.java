package leads;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_LEADS_01_Test extends Baseclass {
	@Test
	public void Creating_a_lead_with_valid_details_ft() {
		leads.getLeadsButton().click();
		leads.getCreatLeadsButton().click();
		//leads.getSalutationtypeDropDown().click();
		leads.getMsButton().click();
		leads.getFirstnameTextField().sendKeys("manuja");
		leads.getLastnameTextField().sendKeys("M");
		leads.getCompanyTextField().sendKeys("QSpiders");
		leads.getSaveButton().click();
	}
}
	