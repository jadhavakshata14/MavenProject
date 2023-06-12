package org.grid.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TJTestClass {

	 WebDriver driver;
	    String nodeURL;
	    
	    @Parameters({"Port"})
	    @BeforeMethod()
	    public void setUp(String Port) throws MalformedURLException
	    {           
	        if(Port.equalsIgnoreCase("5555"))
	        {
	            nodeURL = "http://192.168.31.206:4444/wd/hub";
	            System.out.println("Chrome Browser Initiated");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();            
	            capabilities.setBrowserName("chrome");
	            capabilities.setPlatform(Platform.WINDOWS);
	            
	            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
	            
	            driver.get("https://www.apple.com/");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	        
	        else
	            if(Port.equalsIgnoreCase("6666"))
	            {
	                nodeURL = "http://192.168.31.206:4444/wd/hub";
	                System.out.println("Microsoft Edge Browser Initiated");
	                DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
	                capabilities1.setBrowserName("MicrosoftEdge");
	                capabilities1.setPlatform(Platform.WINDOWS);
	                
	                driver = new RemoteWebDriver(new URL(nodeURL),capabilities1);   
	                
	                driver.get("https://www.apple.com/");
	                driver.manage().window().maximize();
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            }
	        
	       
	    }
	    
	    @Test
	    public void appleSite() throws InterruptedException
	    {
	        try
	        {
	        
	        driver.findElement(By.xpath("//*[@id=\'ac-globalnav\']/div/ul[2]/li[3]")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.cssSelector("#chapternav > div > ul > li.chapternav-item.chapternav-item-ipad-air > a > figure")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.linkText("Why iPad")).click();
	        Thread.sleep(2000);
	        }
	        
	        catch(Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }

	    
	    @AfterMethod()
	    public void tearDown()
	    {
	            driver.quit();
	            System.out.println("Browser Closed");
	    }
	}