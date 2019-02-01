package testScripts;

import org.testng.annotations.Test;

import configuration.Base;
import objectRepository.HeroDashboardOR;
import objectRepository.HeroDropdownOR;

public class DropdownwithOR extends Base {
	
	@Test
	public void dropdownORTest() {
		openBrowser("chrome","http://the-internet.herokuapp.com/");
		clickOnElement(HeroDashboardOR.dropdownLink_xpath);
		dropdownSelect(HeroDropdownOR.dropdown_id, "Option 2");
		
		
	}

}
