package homeOwnerTest;

import org.testng.annotations.Test;  
import base.BaseClass;
import utils.data.HomeOwnersData;

public class Test_With_HomeOwnerData extends BaseClass {

	HomeOwnersData homeOwnersData = new HomeOwnersData("1030 Ocean ave","11210","Ali","khan","01/20/1960" ,"Brooklyn", "NY"); 

	@Test
	public void homeOwnersWithData() {
		homePage.homeSteps(homeOwnersData.getZipCode());
		propertyAddressPage.addressSteps(homeOwnersData.getAddress());
		startPropertyQoute.startPropertyQouteSteps(homeOwnersData.getFirstName(), homeOwnersData.getLastName(), homeOwnersData.getDob(), homeOwnersData.getCity(), homeOwnersData.getState());

	}
	@Test
		public void homeOwnerDataTestWithNoParameter() {
		homePage.homeSteps(homeOwnersData.getZipCode());
		propertyAddressPage.addressSteps(homeOwnersData.getAddress());
		startPropertyQoute.startPropertyQouteSteps(homeOwnersData.getFirstName(), homeOwnersData.getLastName(), homeOwnersData.getDob(), homeOwnersData.getCity(), homeOwnersData.getState());
		
	}

}
