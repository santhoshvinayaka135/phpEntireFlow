package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverManagement.DriverManager;

public class LoginScenario {
	
	public LoginScenario() {

		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
	

	@FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']/a")
	WebElement account;

	@FindBy(xpath = "//div/a[contains(text(),'Login')]")
	WebElement logIn;

	public WebElement Account() {
		return account;
	}

	public WebElement LogIn() {
		return logIn;
	}


}
