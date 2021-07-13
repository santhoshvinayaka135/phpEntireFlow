package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Training.BenchTrainingEbay.DriverManager;

public class afterLoginPage {

	//WebDriver driver;

	public afterLoginPage() {
		//this.driver = driver;
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}

	@FindBy(xpath = "(//div/h3)[1]")
	WebElement verify;

	public WebElement Verify() {
		return verify;
	}

	public void VerifyProcess() throws InterruptedException {
		
		Thread.sleep(2000);
		//Expected result
		String expected = "Hi, Tensa Zangetsu";
		//Actual result
		String actual = verify.getText();
		Assert.assertEquals(actual, expected);

	}

}
