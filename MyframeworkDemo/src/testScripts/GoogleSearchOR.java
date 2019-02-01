package testScripts;

import org.testng.annotations.Test;

import configuration.Base;
import objectRepository.GoogleHomepageOR;

public class GoogleSearchOR extends Base {
	
	@Test
	public void googleTest() {
	
	openBrowser("chrome","http://google.com");
	
	sendValueInTextbox(GoogleHomepageOR.textbox_googleSearch, "abcd");
	clickOnElement(GoogleHomepageOR.button_googleSearch);
	
	

}
}