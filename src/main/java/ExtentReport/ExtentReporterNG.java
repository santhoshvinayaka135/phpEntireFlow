package ExtentReport;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	static ExtentReports extent;
	public static ExtentReports getReport()
	{
		Date date = new Date();
		 
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy/HH.mm.ss");
		String str = formatter.format(date);
		
		String path = System.getProperty("user.dir")+"/reports" +str+ "index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");;
		reporter.config().setDocumentTitle("Test results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Santhosh");
		return extent;
	}

}
