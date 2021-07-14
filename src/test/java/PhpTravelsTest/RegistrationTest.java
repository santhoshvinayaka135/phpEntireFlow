package PhpTravelsTest;

import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import DriverManagement.DriverManager;
import DriverManagement.TestBase;
import PageObjects.RegistrationPage;
import PageObjects.AfterLoginPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.LoginScenario;

public class RegistrationTest extends TestBase {

//	@Test
//	public void DataDrivenRegistrationTest() throws InterruptedException, IOException {
//
//		// Create a object of homepage
//		HomePage hp = new HomePage();
//		// Create a object of RegistrationPage
//		RegistrationPage rp = hp.SignUpProcess();
//		// Create a object of AfterLoginPage
//		AfterLoginPage alp = rp.LoginProcess();
//		Thread.sleep(2000);
//		// Expected string
//		String expected = "Hi, Tensa Zangetsu";
//		// Actual string
//		String actual = alp.Verify().getText();
//		// Comparing string using assertion
//		Assert.assertEquals(actual, expected);
//		// Create object of LoginScenario
//		LoginScenario ls = alp.doLogin();
//		// Create object of LoginPage
//		LoginPage lp = new LoginPage();
//		// Filling up the login page details
//		lp.fillDetails();
//		// Sleep for 2 seconds
//		Thread.sleep(2000);
//		// Expected string
//		String Loginexpected = "Hi, Tensa Zangetsu";
//		// Actual string
//		String Loginactual = lp.Verify().getText();
//		// Compare the actual and expected values using assertion
//		Assert.assertEquals(Loginactual, Loginexpected);
//
//
//	}

	// The same test with manually passing values

	@Test
	public void ManualPassingValuesRegistrationTest() throws InterruptedException, IOException {
		// you are creating object of the first homepage
		HomePage hp = new HomePage();
		// Click on Account button
		hp.Account().click();
		// Click on sign up button
		hp.SignUp().click();
		// redirected to sec Reg Page and that is why you are creating object of that
		// page
		RegistrationPage reg = new RegistrationPage();
		// Enter first name
		reg.enterName("Santhosh");
		// Enter last name
		reg.enterLast("Gabriellito");
		// Enter contact
		reg.enterContactNumber("999667");
		// Enter email
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		String ema = "username" + randomInt + "@gmail.com";
		reg.enterEmail(ema);
		// Enter password
		String ps = RandomStringUtils.randomAlphanumeric(8);
		reg.enterPassword(ps);
		// Confirm Password
		reg.enterConfirmPassword(ps);
		// Click Sign up button
		((JavascriptExecutor) DriverManager.getWebDriver()).executeScript("arguments[0].scrollIntoView(true);",
				reg.signUpButton());
		reg.signUpButton().click();
		// customer get navigated to account page - new object needs to be created
		AfterLoginPage alp = new AfterLoginPage();
		Thread.sleep(2000);
		// Expected message
		String expected = "Hi, Santhosh Gabriellito";
		// Actual message
		String actual = alp.Verify().getText();
		// Compare the values using assertion
		Assert.assertEquals(actual, expected);
		// Click on current user
		alp.CurrentUser().click();
		// Click on logout
		alp.Logout().click();
		// Create a new object of Login scenario
		LoginScenario ls = new LoginScenario();
		// Click on Account
		ls.Account().click();
		// Click on login
		ls.LogIn().click();
		// Create a object of login page
		LoginPage lp = new LoginPage();
		// Enter email
		lp.enterEmail(ema);
		// Enter password
		lp.enterPassword(ps);
		// Click on Login
		lp.Login().click();
		// Sleep for 2 seconds
		Thread.sleep(2000);
		// Expected string
		String Loginexpected = "Hi, Santhosh Gabriellito";
		// Actual string
		String Loginactual = lp.Verify().getText();
		// Comparing expected and actual values using assertion
		Assert.assertEquals(Loginactual, Loginexpected);

	}

}
