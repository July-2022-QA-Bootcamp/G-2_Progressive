package pages.renters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.data.RentersData;

import static common.CommonActions.*;

public class Coverage {
	
	public Coverage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//select[@id='Covg_47']")
	WebElement computerCoverage;
	@FindBy(name = "ctl00$ctl00$MiddleContent$RatingContent$Covg_06")
	WebElement lawSuitsElement;
	@FindBy(xpath = "//label[text()='Yes' and @for='rbCovg_22_0']")
	WebElement securedAptElement;
	@FindBy(xpath = "//label[text()='No' and @for='rbCovg_24I_1']")
	WebElement paidFullElement;
	@FindBy(xpath = "//label[text()='No' and @for='rdoAutoIns_1']")
	WebElement existingInsurance;
	@FindBy(xpath = "//label[text()='No' and @for='rdoHomeIns_1']")
	WebElement insuranceHistory;
	@FindBy(id = "Covg_47A")
	WebElement claimElement;
	@FindBy(id = "btnNext")
	WebElement continueBtnElement;
	
	public void coverageSteps(String computerCov, String lawSuits, String claims) {
		selectDropDown(computerCoverage, computerCov);
		selectDropDown(lawSuitsElement, lawSuits);
		click(securedAptElement);
		click(paidFullElement);
		click(existingInsurance);
		click(insuranceHistory);
		selectDropDown(claimElement, claims);
		click(continueBtnElement);
	}
	
	public void coverageSteps(RentersData rentersData) {
		selectDropDown(computerCoverage, rentersData.getComputerCoverage());
		selectDropDown(lawSuitsElement, rentersData.getLawSuits());
		click(securedAptElement);
		click(paidFullElement);
		click(existingInsurance);
		click(insuranceHistory);
		selectDropDown(claimElement, rentersData.getClaims());
		click(continueBtnElement);
	}
	
		

}
