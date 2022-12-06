package page.HomeOwners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class StartPropertyQoutePage {

	public StartPropertyQoutePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id = "PolicyData_FirstName")
		WebElement firstNameElement;
		@FindBy(id = "PolicyData_LastName")
		WebElement lastNamElement;
		@FindBy(id = "PolicyData_DateOfBirth")
		WebElement dobElement;
		@FindBy(xpath = "//input[@id='PolicyData_PropertyAddress_City']")
		WebElement cityElement;
		@FindBy(xpath = "//label[@for='PolicyData_PropertyAddress_State']")
		WebElement stateElement;
		@FindBy(id ="next-button")
		WebElement nextButtonElement;
		
		public void StartPropertyQouteSteps(String firstName, String lastName, String dob, String city, String state) {
			input(firstNameElement, firstName);
			input(lastNamElement, lastName);
			input(cityElement, city);
			input(stateElement, state);
			click(nextButtonElement); 
		}
}
