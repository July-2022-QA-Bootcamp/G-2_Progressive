package pages.renters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.data.RentersData;

import static common.CommonActions.*;

public class AboutYouRenters {
	
	public AboutYouRenters(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='txtLocAddress']")
	WebElement addressElement;
	@FindBy(id = "txtLocApartmentNumber")
	WebElement aptElement;
	@FindBy(id = "txtLocCity")
	WebElement cityElement;
	@FindBy(xpath = "//select[@id='ddlStates']")
	WebElement stateElement;
	@FindBy(id = "ddlTypeResidence")
	WebElement residentTypElement;
	@FindBy(xpath = "(//label[text()='Yes'])[1]")
	WebElement selectMaillingAddress;
	@FindBy(xpath = "(//label[text()='No'])[2]")
	WebElement hasAnimalElement;
	@FindBy(id = "txtFirstName")
	WebElement firstNamElement;
	@FindBy(id = "txtMiddleName")
	WebElement middleNamElement;
	@FindBy(id = "txtLastName")
	WebElement lastNamElement;
	@FindBy(css = "input.form-control.date")
	WebElement dobElement;
	@FindBy(id = "ddlMaritalStatus")
	WebElement maritalStatusElement;
	@FindBy(id = "txtEmail")
	WebElement emailElement;
	@FindBy(id = "txtSocialSec")
	WebElement socialSecElement;
	@FindBy(id = "btnNext")
	WebElement continuElement;
	
	public void AboutYouSteps(String address, String apt, String city, String state,String residentType, String firstN, String middleIn, String lastN, String dob, String maritalSta, String email, String socialS) {
		input(addressElement, address);
		input(aptElement, apt);
		input(cityElement, city);
		selectDropDown(stateElement, state);
		selectDropDown(residentTypElement, residentType);
		click(selectMaillingAddress);
		click(hasAnimalElement);
		input(firstNamElement, firstN);
		input(middleNamElement, middleIn);
		input(lastNamElement, lastN);
		input(dobElement, dob);
		selectDropDown(maritalStatusElement, maritalSta);
		input(emailElement, email);
		input(socialSecElement, socialS);
		click(continuElement);
		
	}
	
	public void AboutYouSteps(RentersData rentersData) {
		input(addressElement, rentersData.getAddres());
		input(aptElement, rentersData.getApt());
		input(cityElement, rentersData.getCity());
		selectDropDown(stateElement, rentersData.getState());
		selectDropDown(residentTypElement, rentersData.getResidentType());
		click(selectMaillingAddress);
		click(hasAnimalElement);
		input(firstNamElement, rentersData.getFirstNmae());
		input(middleNamElement, rentersData.getMiddleIn());
		input(lastNamElement, rentersData.getLastname());
		input(dobElement, rentersData.getDob());
		selectDropDown(maritalStatusElement, rentersData.getMaritalStatus());
		input(emailElement, rentersData.getEmail());
		input(socialSecElement, rentersData.getSocialSec());
		click(continuElement);
		
	}
	
}

