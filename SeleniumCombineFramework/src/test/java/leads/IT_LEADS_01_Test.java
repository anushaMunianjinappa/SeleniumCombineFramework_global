package leads;

import org.testng.annotations.Test;

import generics.Baseclass;

public class IT_LEADS_01_Test extends Baseclass{
	@Test
	public void Creating_a_lead_with_valid_details_it() throws InterruptedException {
		leads.getLeadsButton().click();
		leads.getCreatLeadsButton().click();
		//leads.getSalutationtypeDropDown().click();
		//leads.getMsButton().click();
		leads.getFirstnameTextField().sendKeys("haridya");
		leads.getLastnameTextField().sendKeys("M");
		leads.getCompanyTextField().sendKeys("QSpiders");
		Thread.sleep(2000);
		leads.getSaveButton().click();
		Thread.sleep(2000);
		leads.getLeadsButton1().click();
		Thread.sleep(2000);
//		leads.getCheckbox().click();
//		Thread.sleep(2000);
//		leads.getDeletebutton().click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();;
//		Thread.sleep(8000);
	}

}
