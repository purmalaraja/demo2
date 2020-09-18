package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.landingpage;

import configurations.BaseConfiguration;

public class LoginTest extends BaseConfiguration {
	
	@BeforeTest
	public void InvokeBrowser() throws IOException {
		driver=InitializeBrowser();
		driver.get(prop.getProperty("url"));
		
	}

	@Test
	public void Loginsign() {
		landingpage ld = new landingpage(driver);
		ld.login().click();

		LoginPage lg = new LoginPage(driver);
		lg.email().sendKeys(prop.getProperty("Email"));
		lg.Password.sendKeys(prop.getProperty("Password"));
		lg.submit().click();

	}
	@AfterTest
	public void logout() {
		driver.close();
		driver=null;
	}

}
