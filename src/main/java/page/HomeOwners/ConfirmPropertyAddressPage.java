package page.HomeOwners;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import static common.CommonActions.*;

public class ConfirmPropertyAddressPage {
	
	CommonWaits waits;
	
	public ConfirmPropertyAddressPage(WebDriver driver) {
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[@id='overlayHeading']")
	WebElement propertyAddressTitleElement;
	@FindBy(xpath ="//input[@name='AddressLine1'and @id='addressLine1Modal']")
	WebElement addressLinElement;
	@FindBy(id = "cityModal")
	WebElement cityElement;
	@FindBy(id = "paModalButton")
	WebElement continuElement;
	
	public void confirmAddressSteps(String expected, String address, String city) {
		assertGetText(propertyAddressTitleElement, expected);
		input(addressLinElement, address);
		waits.waitUntilVisible(cityElement);
		input(cityElement, city);
		sleep(2);
		click(continuElement);

}

}
