package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import configuration.Base;

public class Click extends Base{
	
	@Test
	
	public void click() throws InterruptedException {
		
		openBrowser("chrome","http://google.com");
		
		//clickOnElement(By.xpath("//input[@value='Google Search']"));
		
		//clickOnElement(By.xpath("//input[value=\"I'm Feeling Lucky\"]"));
		
	  driver.findElement(By.xpath("//input[@value='I'm Feeling Lucky']")).click();
		Thread.sleep(60000);

		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
		//Explicit Wait/Conditional wait
		
		//WebDriverWait wt = new WebDriverWait (driver,60);
		
		
		
		
	}

}
