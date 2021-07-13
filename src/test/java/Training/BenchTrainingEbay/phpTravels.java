package Training.BenchTrainingEbay;

import java.io.IOException;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.RegistrationPage;
import pageObjects.afterLoginPage;

public class phpTravels extends TestBase {

	@Test
	public void One() throws InterruptedException, IOException {

		homePage hp = new homePage();
		RegistrationPage rp = hp.SignUpProcess();
		afterLoginPage alp = rp.LoginProcess();
		alp.VerifyProcess();

	}

}
