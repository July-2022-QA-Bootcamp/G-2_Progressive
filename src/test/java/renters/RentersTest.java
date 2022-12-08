package renters;

import org.testng.annotations.Test;
import org.testng.annotations.Test; 
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import base.BaseClass;

public class RentersTest extends BaseClass {
	
	@Test
	public void rentersQuote() {
		homePage.rentersSteps("11368");
		aboutYouRenters.AboutYouSteps("9610 57th Ave", "17F", "Corona", "NY", "6", "Chandler", "M", "Bing", "03/23/1975", "Married", "chan123@gmail.com", "005-24-3518");
		coverage.coverageSteps("D", "C", "0");
		rates.rateSteps();
	}
	
	@Parameters({"zip", "address", "apt", "city", "state", "residentType", "firstName", "middleName", "lastName", "dob", "maritalStatus", "email", "socialSec","computerCov", "lawSuits", "claims"})
	@Test
	public void rentersQuoteParameterized(String zipCode, String address, String apt, String city, String state,String residentType, String firstN, String middleIn, String lastN, String dob, String maritalSta, String email, String socialS,String computerCov, String lawSuits, String claims) {
		homePage.rentersSteps(zipCode);
		aboutYouRenters.AboutYouSteps(address, apt, city, state,residentType, firstN, middleIn, lastN, dob, maritalSta, email, socialS);
		coverage.coverageSteps(computerCov, lawSuits, claims);
		rates.rateSteps();
	} 
}
