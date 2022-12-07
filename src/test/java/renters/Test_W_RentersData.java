package renters;

import org.testng.annotations.Test;
import base.BaseClass;
import utils.data.RentersData;

public class Test_W_RentersData extends BaseClass{
	
	RentersData rentersData = new RentersData("11368", "9610 57th Ave", "17F", "Corona", "NY", "6", "Rachel", "H", "Green", "08/22/1977", "Married", "chan123@gmail.com", "008-95-7789", "D", "C", "0");
	
	@Test
	public void rentersQuoteWithData() {
		homePage.rentersSteps(rentersData);
		aboutYouRenters.AboutYouSteps(rentersData);
		coverage.coverageSteps(rentersData);
		rates.rateSteps();
	}

}
