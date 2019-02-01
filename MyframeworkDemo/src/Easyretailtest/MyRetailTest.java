package Easyretailtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import configuration.Base;

public class MyRetailTest extends Base {
	
	@Test
	public void MyRetailTest() {
		
		openBrowser("chrome","http://qa.easyretailers.com/");
		clickOnElement(By.xpath("//a[@id='loginLink']"));
		sendValueInTextbox(By.xpath("//input[@id='Email']"),"user@rest.com");
		sendValueInTextbox(By.xpath("//input[@id='Password']"),"User@214");
		clickOnElement(By.xpath("//input[@value='Log in']"));
	}
	
@Test
public void MyRetailTest1() {
	
	openBrowser("chrome","http://qa.easyretailers.com/");
	clickOnElement(By.xpath("//a[@id='loginLink']"));
	sendValueInTextbox(By.xpath("//input[@id='Email']"),"user@rest.com");
	sendValueInTextbox(By.xpath("//input[@id='Password']"),"User@444");
	clickOnElement(By.xpath("//input[@value='Log in']"));

}
@Test
public void MyRetailTest2() {
	
	openBrowser("chrome","http://qa.easyretailers.com/");
	clickOnElement(By.xpath("//a[@id='loginLink']"));
	sendValueInTextbox(By.xpath("//input[@id='Email']"),"user@test.com");
	sendValueInTextbox(By.xpath("//input[@id='Password']"),"User@444");
	clickOnElement(By.xpath("//input[@value='Log in']"));
}
@Test
public void MyRetailTest3() {
	
	openBrowser("chrome","http://qa.easyretailers.com/");
	clickOnElement(By.xpath("//a[@id='loginLink']"));
	sendValueInTextbox(By.xpath("//input[@id='Email']"),"user@test.com");
	sendValueInTextbox(By.xpath("//input[@id='Password']"),"User@214");
	clickOnElement(By.xpath("//input[@value='Log in']"));
}
@Test
public void MyRetailTest4(){
	
	openBrowser("chrome","http://qa.easyretailers.com/");
	clickOnElement(By.xpath("//a[@id='loginLink']"));
	sendValueInTextbox(By.xpath("//input[@id='Email']"),"user@test.com");
	sendValueInTextbox(By.xpath("//input[@id='Password']"),"User@214");
	clickOnElement(By.xpath("//input[@value='Log in']"));
	clickOnElement(By.xpath("//i[@class='glyphicon glyphicon-menu-hamburger white']"));
	
}
}