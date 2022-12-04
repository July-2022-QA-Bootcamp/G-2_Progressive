package common;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Configuration;
import static utils.IConstant.*;

public class CommonWaits {

	WebDriverWait wait;
	Configuration configuration = new Configuration();

	public CommonWaits(WebDriver driver) {
		long waitTime = Long.parseLong(configuration.getProperty(EXPLICIT_WAIT ));
		wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
	}

	public void waitUntilVisible(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException | NullPointerException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void waitUntilClickable(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException | NullPointerException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
