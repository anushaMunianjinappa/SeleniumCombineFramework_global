package email;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_EMAIL_01 extends Baseclass {
	@Test
	public void Creating_email_a_with_valid_details() throws InterruptedException {
		email.getComposeLink().click();
		email.getEmaiLink().click();
//		String parentWindow = driver.getWindowHandle();
//		Thread.sleep(2000);
//		
//		Set<String> allId= driver.getWindowHandles();
//		allId.remove(parentWindow);
//		for(String id:allId) {
//			driver.switchTo().window(id);
//		}
//		email.getParentName().sendKeys("manusha209@gmail.com");
//		email.getSaveButton().click();
	}
}  
       