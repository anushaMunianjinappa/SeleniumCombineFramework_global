package products;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_PRODUCTS_01 extends Baseclass {
	@Test
	public void Creating_a_products_with_valid_details_ft() {
		//utility.handlingDropDown(product.getProductcategoryDropDown(), "Software");
		product.getProductLink().click();
		product.getCreateProductIcon().click();
		product.getProductnameTextField().sendKeys("prateek");
		//product.getProductcategoryDropDown().click();
		utility.handlingDropDown(product.getProductcategoryDropDown(), "Software");
		product.getSoftwareDopDown().click();
		product.getSaveButton().click();
		utility.mouseHoveringOnElement(driver,home.getAdminIcon());
		home.getSignoutButton().click();
	}
}
 