package com.soucelabs.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoLoginPagetest {

	
@Test
public void loginTest() {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("browserName", "chrome");
	capabilities.setCapability("platform", "WINDOWS");
	
	URL url = null;
	try {
		url = new URL("http://192.168.0.45:7777/wd/hub");
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
	driver.get("https://www.saucedemo.com/");
	driver.findElementById("user-name").sendKeys("test123");
	driver.findElementById("password").sendKeys("test");
	driver.findElementById("login-button").click();

}
	
}
