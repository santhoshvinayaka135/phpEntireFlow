package Training.BenchTrainingEbay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static WebDriver driver;

	private DriverManager() {

	}

	public static WebDriver getWebDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\santvina\\Desktop\\new\\chromedriver.exe");
			// Initiate chrome driver
			driver = new ChromeDriver();

		}
		return driver;

	}

	public static void killDriver() {
		driver.close();
		driver.quit();
		driver = null;

	}

}
