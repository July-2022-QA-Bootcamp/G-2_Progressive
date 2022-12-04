package reporting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
private static ExtentReports extent;
	
	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public synchronized static ExtentReports getInstance() {
		if(extent == null) {
			try {
				Date date = new Date();
				DateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy_HH.mm");
				String dateString = dateFormat.format(date);
				
				extent = new ExtentReports();
				ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./test-output/ExtentReports/ExtentReport_"+dateString+".html");
				sparkReporter.config().setReportName("QA Automation for Geico");
				extent.attachReporter(sparkReporter);
				extent.setSystemInfo("QA Team", "Avengers_July2022");
				extent.setSystemInfo("Environment", "QA");
				extent.setSystemInfo("Assigned Tester", System.getProperty("user.name"));
				logger.log(Level.INFO,"Reporting is starting ...");
			}catch(Exception e) {
				e.printStackTrace();
				logger.log(Level.INFO,"Reporting cannot started. \n" + e.getLocalizedMessage());
			}
		}
		return extent;
	}

}
