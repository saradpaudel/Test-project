package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import configuration.Base;

public class actDemo3 extends Base {
	
	@Test
	public void actionDemo() {
		openBrowser("chrome","http://youtube.com");
		Actions act = new Actions(driver);
		//actionRightClick(By.xpath("//a[@id='uh-signin']"));
		//actionClick(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-blue-text size-default']//yt-formatted-string[@id='text']"));
//actionClick(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-blue-text size-default']"));
	actionRightClick(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-blue-text size-default']"));	
		
	}

}
