package reporting;

import java.util.HashMap;
import java.util.Map;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
	
static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
	
	private static ExtentReports extent = ExtentManager.getInstance();
	
	public static synchronized ExtentTest startTest(String testName, String result) {
		ExtentTest test = extent.createTest(testName, result);
		extentTestMap.put((int)(long)Thread.currentThread().getId(), test);
		return test;
	}
	
	public static synchronized ExtentTest getTest() {
		return extentTestMap.get((int)(long)Thread.currentThread().getId());
	}
	
	public static synchronized ExtentTest startTest(String test) {
		return startTest(test, "");
	}

}
