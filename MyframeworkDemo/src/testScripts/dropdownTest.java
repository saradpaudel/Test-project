package testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import configuration.Base;

	
	public class dropdownTest extends Base{
		
		@Test
		public void selectDropdown() throws InterruptedException {
			
			openBrowser("chrome","http://the-internet.herokuapp.com/dropdown");
			
			//clickOnElement(By.xpath("//a[contains(text(),'dropdown')]"));
			
			clickOnElement(By.xpath("//select[@id='dropdown']"));
			Thread.sleep(5000);
			
			//dropdownSelect(By.xpath("//select[@id='dropdown']"),"option 2");
			
			//dropdownSelect(By.xpath("//a[contains(text(),'dropdown')]"),"option 2");
			
			dropdownSelect(By.xpath("//select[@id='dropdown']"), "Option 2");
		}
	}


