package org.grid.drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RcDriver {
	@Test
    public void scenario1() throws MalformedURLException
    {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setBrowserName("MicrosoftEdge");
       
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.195:4444"), dc);
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
       
       
    }
}
