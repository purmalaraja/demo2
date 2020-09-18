package stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;

import PageObjects.LoginPage;
import PageObjects.landingpage;
import PageObjects.portalhomepage;
import configurations.BaseConfiguration;

@RunWith(Cucumber.class)
public class stepdefination extends BaseConfiguration {

	@Given("Initialize the browser chrome")
	public void initialize_the_browser_chrome() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		driver = InitializeBrowser();
	}

	@Given("Navigating to the {string} site")
	public void navigating_to_the_site(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.get(prop.getProperty("url"));
	}

	@Given("click in the login and landing into the sign in page")
	public void click_in_the_login_and_landing_into_the_sign_in_page() {
		// Write code here that turns the phrase above into concrete actions
		landingpage ld = new landingpage(driver);
		ld.login().click();
	}

	@When("^user enter (.+) and (.+) and logs in$")
	public void user_enter_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lg = new LoginPage(driver);
		lg.email().sendKeys(username);
		lg.Password.sendKeys(password);
		lg.submit().click();
	}

	@Then("verify that user is succesfully logs in")
	public void verify_that_user_is_succesfully_logs_in() {
		// Write code here that turns the phrase above into concrete actions
		portalhomepage PP = new portalhomepage(driver);
		Assert.assertTrue(PP.search().isDisplayed());

	}
	 @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }

}