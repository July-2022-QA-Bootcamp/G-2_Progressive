package pages.renters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class Rates {
	
	public Rates(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[text()='No' and @for='rdoAddInsured_1']")
	WebElement spouseOption;
	@FindBy(xpath = "//label[text()='No' and @for='rdoAddInterest_1']")
	WebElement proofOfInsuranc;
	@FindBy(id = "btnNext")
	WebElement continueBtn;
	
	public void rateSteps() {
		click(spouseOption);
		click(proofOfInsuranc);
		click(continueBtn);
	}
	
}
		
