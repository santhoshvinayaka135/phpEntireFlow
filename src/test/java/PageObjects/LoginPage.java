package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManagement.DriverManager;

public class LoginPage {
	
	public LoginPage() {

		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath = "//div[@class='col-md-8']")
	WebElement verify;
	

	public WebElement Email() {
		return email;
	}

	public WebElement Password() {
		return password;
	}
	
	public WebElement Login() {
		return login;
	}
	
	public WebElement Verify()
	{
		return verify;
	}
	
	public void fillDetails()
	{
		RegistrationPage rp = new RegistrationPage();
		email.sendKeys(rp.em);
		password.sendKeys(rp.s);
		login.click();
	}
	
	public void enterEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void enterPassword(String ppass)
	{
		password.sendKeys(ppass);
	}

}
