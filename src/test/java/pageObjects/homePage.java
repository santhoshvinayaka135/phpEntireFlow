package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Training.BenchTrainingEbay.DriverManager;

public class homePage {

	//WebDriver driver;

	public homePage() {
		//this.driver = driver;
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}

	@FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']/a")
	WebElement account;

	@FindBy(xpath = "//div/a[contains(text(),'Sign Up')]")
	WebElement signUp;

	public WebElement Account() {
		return account;
	}

	public WebElement SignUp() {
		return signUp;
	}

	public RegistrationPage SignUpProcess() {

		// Click on myAccount button
		account.click();
		// Click on Sign up button
		signUp.click();
		return new RegistrationPage();
	}
}
