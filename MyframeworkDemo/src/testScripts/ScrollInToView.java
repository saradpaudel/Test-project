package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import configuration.Base;

public class ScrollInToView extends Base {
	
	@Test
	

		 public void scrollDemo() {

		  openBrowser("chrome", "https://the-internet.herokuapp.com/");

		  

		 /* WaitForVisible(By.xpath("//a[@href='/status_codes']"));
		  
		  WebElement ele = driver.findElement(By.xpath("//a[@href='/status_codes']"));
		  
		  
		  JavascriptExecutor js = ((JavascriptExecutor) driver);
		  
		  js.executeScript("arguments[0].scrollIntoView(true);",ele);
		  
		  
		  System.out.println(ele.getText());
*/
	scrollIntoView(By.xpath("//a[@href='/status_codes']"));



	}

}
