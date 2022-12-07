package homeOwnerTest;

import org.testng.annotations.Test;

import base.BaseClass;
import utils.data.HomeOwners;

public class Test_With_HomeOwnerData extends BaseClass {
	
	HomeOwners homeOwners = new HomeOwners("11210","1030 Ocean ave","Ali","khan","01/20/1960" ,"Brooklyn", "NY");

	@Test
	public void HomeOwnerData () {
		
	}

}
