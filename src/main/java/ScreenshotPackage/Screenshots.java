package ScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

	WebDriver driver;

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "./reports/screenshots/ "+ getDateAndTimeReport() + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}

	private static String getDateAndTimeReport() {

		String str = null;
		try {
			Date date = new Date();
			//String timeStamp = new SimpleDateFormat("dd.MMMM.yyyy/HH.mm.ss").format(new Date());
			//str = timeStamp.formatted(date);
			SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy/HH.mm.ss");
			str = formatter.format(date);
			

		} catch (Exception e) {
		}
		return str;
	}

}
