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

public class Visibletext extends BaseConfiguration {
	public static Logger log =LogManager.getLogger(Vlaidation.class.getName());
	@BeforeTest
	
	public void InvokeBrowser() throws IOException {
		driver=InitializeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("application entered url");
	}

	@Test
	public void verifycontcatbar() {
		landingpage ld = new landingpage(driver);

		assertTrue(ld.visible().isDisplayed());
		log.info("application displayed");

	}

	@AfterTest

	public void logout() {
		driver.close();
		driver=null;
	}

}
