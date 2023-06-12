package org.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddToCartPage {
WebDriver driver;
	
	public AddToCartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-button-72")
	WebElement addToCartButton;
	
	public void checkAddToCart() {
		Assert.assertTrue(addToCartButton.isDisplayed());
	}
}
