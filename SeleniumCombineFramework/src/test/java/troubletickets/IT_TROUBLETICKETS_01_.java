package troubletickets;

import org.testng.annotations.Test;

import generics.Baseclass;

public class IT_TROUBLETICKETS_01_ extends Baseclass{
	@Test
	public void Creating_a_Trouble_Tickets_with_valid_details_it() throws InterruptedException {
		troubleticket.getTroubleTicketslink().click();
		troubleticket.getTroubleticketsIcon().click();
		troubleticket.getTicket_titleTextField().sendKeys("muni");
		troubleticket.getTicketstatusDropDown().click();
		utility.handlingDropDown(troubleticket.getTicketstatusDropDown(), "In Progress");
		Thread.sleep(2000);
		troubleticket.getInProgressDropDown().click();
		Thread.sleep(2000);
		troubleticket.getSaveButton().click();
		Thread.sleep(2000);
		troubleticket.getTroubleTicketslink1().click();
		Thread.sleep(2000);
		
		//troubleticket.get
	}

}
