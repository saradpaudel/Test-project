package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import configuration.Base;

public class actDemo2 extends Base {
	
@Test

public void actionDemo() {
	
	openBrowser("chrome","https://the-internet.herokuapp.com/hovers");
			
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@id='uh-signin']"))).click().perform();
	
	//act.click(driver.findElement(By.xpath("//a[@id='uh-signin']"))).build().perform();
	//act.contextClick(driver.findElement(By.xpath("//a[@id='uh-signin']"))).build().perform();

	//mouseHoverAndClick(By.xpath("//a[@id='uh-signin']"));	
	
	//mouseHoverAndRightClick(By.xpath("//a[@id='uh-signin']"));
	
	//mouseHoverAndRightClick(By.xpath("//div[@class='example']//div[2]//img[1]"));
	
	mouseHoverAndClick(By.xpath("//div[@class='example']//div[2]//img[1]"));
	waitforSeconds(5);
	mouseHoverAndClick(By.xpath("//a[@href = '/users/2']"));
	navigateBack();
	navigateForward();
	
	
	
}


	
}
