package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class portalhomepage {
	WebDriver driver;

	public portalhomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(css = "[name='query']")
	WebElement search;

	public WebElement search() {

		return search;
	}

	
	 
	

}
