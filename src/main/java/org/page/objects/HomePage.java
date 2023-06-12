package org.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	Actions action;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@alt='Tricentis Demo Web Shop']")
	WebElement demoLogo;
	
	@FindBy(linkText="Register")
	WebElement registerLink;
	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(xpath="(//*[text()='Shopping cart'])[1]")
	WebElement shoppingCartLink1;

	@FindBy(xpath="(//*[text()='Wishlist'])[1]")
	WebElement wishlistLink1;
	
	//@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	@FindBy(xpath="(//*[@href='/computers'])[1]")
	WebElement computersDropDown;
	
	//@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	@FindBy(xpath="(//*[@href='/desktops'])[1]")
	WebElement desktopDropButton;
	
	public void checkHomePage() {
		Assert.assertTrue(demoLogo.isDisplayed());
		Assert.assertTrue(registerLink.isDisplayed());
		Assert.assertTrue(loginLink.isDisplayed());
		Assert.assertTrue(shoppingCartLink1.isDisplayed());
		Assert.assertTrue(wishlistLink1.isDisplayed());
	}
	
	public void navigateToDesktop() {
		action = new Actions(driver);
		action.moveToElement(computersDropDown).build().perform();
		desktopDropButton.click();
	}
}
