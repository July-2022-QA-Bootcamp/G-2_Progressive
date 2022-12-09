package homeOwnerTest;

import org.testng.annotations.Parameters; 
import org.testng.annotations.Test; 
import base.BaseClass;

public class HomeOwnerTest extends BaseClass {


	@Test
	public void homeOwnerTest() {
		homePage.homeSteps("11210"); 
		propertyAddressPage.addressSteps("1030 Ocean ave");
		confirnPropertyAddressPage.confirmAddressSteps("Confirm your property address", "1030 Ocean ave", "Brooklyn");
		startPropertyQoute.startPropertyQouteSteps("Ali","khan","01/20/1960" ,"Brooklyn", "NY");
		
 
	}
		@Parameters({"zipCode","address","firstName","lastName","dob" ,"city", "state"})
		@Test
		public void homeOwnerTestNoParameter(String zipCode, String address, String firstName, String lastName, String dob, String city, String state) {
			homePage.homeSteps(zipCode);
			propertyAddressPage.addressSteps(address);
			startPropertyQoute.startPropertyQouteSteps(firstName, lastName, dob, city, state);

	}
}