package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import configuration.Base;

public class VerifyMassage extends Base {
	
	@Test
	public void verifyText() {
		openBrowser("ie","http://the-internet.herokuapp.com/login");
		sendValueInTextbox(By.xpath("//input[@id='username']"),"abc");
		sendValueInTextbox(By.xpath("//input[@id='password']"),"xyz");
		clickOnElement(By.xpath("//button[@type='submit']"));
		WaitForVisible(By.xpath("//div[@id='flash']"));
		String errorTextMassage = driver.findElement(By.xpath("//div[@id='flash']")).getText();
	System.out.println("Error massage = "+errorTextMassage);
	
	Assert.assertEquals(errorTextMassage, "Valid Message");
	
		
	}
	
/*	@Test
	public void VerifyTextOfLoginButton() {
		
		
	}*/

	
		
	}


