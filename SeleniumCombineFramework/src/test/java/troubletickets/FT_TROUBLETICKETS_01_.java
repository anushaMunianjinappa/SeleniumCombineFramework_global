package troubletickets;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_TROUBLETICKETS_01_ extends Baseclass  {
	@Test
	public void Creating_a_Trouble_Tickets_with_valid_details_ft() {
		
		troubleticket.getTroubleTicketslink().click();
		troubleticket.getTroubleticketsIcon().click();
		//troubleticket.getTroubletickettextfield();
//		troubleticket.getTroubletickettextfield().sendKeys("deepa");
		troubleticket.getTicketstatusDropDown().click();
		
		utility.handlingDropDown(troubleticket.getTicketstatusDropDown(), "In Progress");
		troubleticket.getInProgressDropDown().click();
		troubleticket.getSaveButton();
		
		
//		troubleticket.getTroubleTicketslink().click();
//		troubleticket.getTroubleticketsIcon().click();
//
//		//troubleticket.getTickettitleTextField().sendKeys("thapa");
//		troubleticket.getTicketstatusDropDown().click();
//		utility.handlingDropDown(troubleticket.getTicketstatusDropDown(), "In Progress");
//		troubleticket.getInProgressDropDown().click();
//		troubleticket.getSaveButton();
//		//troubleticket.get
	}
}
       