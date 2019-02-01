package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import configuration.Base;

public class ScrollInToView2 extends Base {
	
	
		
		@Test
		

			 public void scrollDemo() {

			  openBrowser("chrome", "https://www.gaubesikhabar.blogspot.com");
			  
			 /*  WaitForVisible(By.xpath("//a[@type='application/atom+xml']"));
			  
			  WebElement ele = driver.findElement(By.xpath("//a[@type='application/atom+xml']"));
			  
			  
			  JavascriptExecutor js = ((JavascriptExecutor) driver);
			  
			  js.executeScript("arguments[0].scrollIntoView(true);",ele);
			  
			  
			  System.out.println(ele.getText());
*/
			  scrollIntoView(By.xpath("//a[@type='application/atom+xml']"));
}
}