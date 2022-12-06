package homeOwnerTest;

import org.testng.annotations.Test;
import base.BaseClass;

public class HomeOwnerTest extends BaseClass {
	
	@Test
	public void homeOwnerTest() {
	homePage.homeSteps("11210");
	propertyAddressPage.addressSteps("1030 Ocean ave");
	startPropertyQoutePage.startPropertyQouteSteps("Ali","khan","01/20/1960" ,"Brooklyn", "NY");
	}

}
