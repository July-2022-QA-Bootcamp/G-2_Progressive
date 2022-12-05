package pages.common;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
import common.CommonWaits;
import utils.data.AutoData;

public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Auto'])[1]")
	WebElement autoProductElement1;
	@FindBy(xpath = "//p[text()='Auto ']")
	WebElement autoProductElement2;
	@FindBy(xpath = "//a[@data-tracking-label='homeowners_section']")
	WebElement homeProductElement;
	@FindBy(xpath = "//input[@id='zipCode_overlay']")
	WebElement zipCodElement;
	@FindBy(xpath = "//input[@id='qsButton_overlay']")
	WebElement getQuotElement;

	public void autoSteps(String zipCode) {
		if (isPresent(autoProductElement1) && isDisplayed(autoProductElement1)) {
			click(autoProductElement1);
		}
		if (isPresent(autoProductElement2) && isDisplayed(autoProductElement2)) {
			click(autoProductElement2);
		}
		input(zipCodElement, zipCode);
		click(getQuotElement);
	}

	public void homeSteps(String zipCode) {
		click(homeProductElement);
		input(zipCodElement, zipCode); 
		click(getQuotElement); 
	}

	public void autoSteps(AutoData autoData) {
		if (isPresent(autoProductElement1) && isDisplayed(autoProductElement1)) {
			click(autoProductElement1);
		}
		if (isPresent(autoProductElement2) && isDisplayed(autoProductElement2)) {
			click(autoProductElement2);
		}
		input(zipCodElement, autoData.getZip());
		click(getQuotElement);
	}

}
