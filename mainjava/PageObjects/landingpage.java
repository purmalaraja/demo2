package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	WebDriver driver;

	public landingpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = ".//ul[@class='nav navbar-nav navbar-right']")
	WebElement visible;
	
	private @FindBy(css="div[class='text-center']")
	
	WebElement gettitle;

	private @FindBy(css = "a[href*='sign_in']")
	WebElement login;

	public WebElement login() {

		return login;
	}

	
	 public WebElement gettitle() {
	 
	 return gettitle; }
	 
	public WebElement visible() {

		return visible;
	}

	

}
