package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverManagement.DriverManager;

public class AfterLoginPage {

	public AfterLoginPage() {

		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}

	@FindBy(xpath = "(//div/h3)[1]")
	WebElement verify;
	
	@FindBy(xpath = "(//a[@id='dropdownCurrency'])[2]")
	WebElement user;
	
	@FindBy(xpath = "//div/a[contains(text(),'Logout')]")
	WebElement logout;

	public WebElement Verify() {
		return verify;
	}
	
	public WebElement CurrentUser() {
		return user;
	}
	
	public WebElement Logout() {
		return logout;
	}
	
	public LoginScenario doLogin()
	{
		user.click();
		logout.click();
		
		return new LoginScenario();
	}
	
	

}
