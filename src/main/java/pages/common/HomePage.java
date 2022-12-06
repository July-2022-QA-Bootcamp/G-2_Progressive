package pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
import common.CommonWaits;
import utils.data.AutoData;
import utils.data.RentersData;

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
	@FindBy(xpath = "//p[text()='Renters ']")
	WebElement rentersElement;
	@FindBy(xpath = "//label[text()='Renters']")
	WebElement rentersElement2;
	@FindBy(xpath = "//span[text()='Property']")
	WebElement propertyElement;
	@FindBy(xpath = "//input[@id='zipCode_overlay']")
	WebElement zipCodElement;
	@FindBy(id = "zipCode_overlay_subproducts")
	WebElement rentersZipcodeElement;
	@FindBy(xpath = "//input[@id='qsButton_overlay']")
	WebElement getQuotElement;
	@FindBy(id = "qsButton_overlay_subproducts")
	WebElement rentersGetQuoteElement;

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

	public void homeSteps() {
		click(homeProductElement);
	}

	public void rentersSteps(String zipCode) {
		if (isPresent(rentersElement) && isDisplayed(rentersElement)) {
			click(rentersElement);
			input(zipCodElement, zipCode);
			click(getQuotElement);
		}
		if (isPresent(propertyElement) && isDisplayed(propertyElement)) {
			click(propertyElement);
			click(rentersElement2);
			input(rentersZipcodeElement, zipCode);
			click(rentersGetQuoteElement);
		}
	}

	public void rentersSteps(RentersData rentersData) {
		if (isPresent(rentersElement) && isDisplayed(rentersElement)) {
			click(rentersElement);
			input(zipCodElement, rentersData.getZipCode());
			click(getQuotElement);
		}
		if (isPresent(propertyElement) && isDisplayed(propertyElement)) {
			click(propertyElement);
			click(rentersElement2);
			input(rentersZipcodeElement, rentersData.getZipCode());
			click(rentersGetQuoteElement);
		}

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
