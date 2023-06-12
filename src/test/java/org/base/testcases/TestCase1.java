package org.base.testcases;

import java.net.MalformedURLException;

import org.base.pack.BaseConfig;
import org.openqa.selenium.WebDriver;
import org.page.objects.AddToCartPage;
import org.page.objects.DesktopsPage;
import org.page.objects.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 extends BaseConfig {

	HomePage homeObj;
	DesktopsPage desktopObj;
	AddToCartPage addCartObj;
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		homeObj = new HomePage(driver);
		desktopObj = new DesktopsPage(driver);
		addCartObj = new AddToCartPage(driver);
	}
	@Test
	public void test1() {
		homeObj.checkHomePage();
		homeObj.navigateToDesktop();
		desktopObj.navigateToCart();
		addCartObj.checkAddToCart();
		
	}
}
