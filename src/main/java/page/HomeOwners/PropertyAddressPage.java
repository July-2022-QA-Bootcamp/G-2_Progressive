package page.HomeOwners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class PropertyAddressPage { 
	
	public PropertyAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "singleLineAddress")
	WebElement addressElement;
	@FindBy(xpath = "(//input[@id='paButtonSingleLine'])[1]")
	WebElement letsGoElement;
	
	public void addressSteps(String address) {
		input(addressElement, address);
		click(letsGoElement);
	}

}
