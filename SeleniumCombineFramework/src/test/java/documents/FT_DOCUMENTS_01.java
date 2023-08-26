package documents;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_DOCUMENTS_01 extends Baseclass{
	@Test
	public void Creating_a_documents_with_valid_details_ft() {
	
	documents.getDocumentslink().click();
	
	documents.getCreateDocumentsIcon().click(); 
	
	documents.getTitleTextField().sendKeys("selenium");
	
	documents.getSaveButton().click();
	
}
} 
 