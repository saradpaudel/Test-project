package testScripts;

import org.testng.annotations.Test;

import configuration.Base;

public class ScrollDemo extends Base {
	@Test
	public void scrollTest() {
openBrowser("chrome","http://www.yahoo.com");
waitforSeconds(5);
//JavascriptExecutor js = ((JavascriptExecutor)driver);
//js.executeScript("scroll(800)");
scrollPage(0, 800);

}
}