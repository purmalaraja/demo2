package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="[id='user_email']")
	WebElement email;


	@FindBy(css="[type='password']")
	public WebElement Password;
	
	@FindBy(css ="[name='commit']")
	WebElement submit;
	
	public WebElement email() {

		return email;
	}
	public WebElement Password() {

		return Password;
	}
	public WebElement submit() {

		return submit;
	}
	

}
