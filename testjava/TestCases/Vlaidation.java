package TestCases;

import static org.testng.Assert.assertEquals;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.landingpage;
import configurations.BaseConfiguration;

public class Vlaidation extends BaseConfiguration {
	public static Logger log =LogManager.getLogger(Vlaidation.class.getName());
	@BeforeTest
	public void InvokeBrowser() throws IOException {
		driver=InitializeBrowser();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("application navigated");
	}

	@Test
	public void verifyheaderemessage() {
		landingpage ld = new landingpage(driver);

		assertEquals(ld.gettitle().getText(), "FEATURED COURSE");
		log.info("sucessfully navigated text message");

	}

	@AfterTest

	public void logout() {
		driver.quit();
		driver=null;
	}

}
