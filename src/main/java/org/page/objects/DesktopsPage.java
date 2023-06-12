package org.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage {
WebDriver driver;
	
	public DesktopsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@value='Add to cart'])[1]")
	WebElement addToCartButton1;
	
	public void navigateToCart() {
		addToCartButton1.click();
	}
}
