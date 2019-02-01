package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import configuration.Base;

public class ActDemo extends Base {
	
	/*@Test
	public void actionDemo() throws InterruptedException {
		
		openBrowser("chrome","http://the-internet.herokuapp.com");
		
		clickOnElement(By.xpath("//a[@href='/drag_and_drop']"));
		Actions act = new Actions(driver);
		Thread.sleep(30000);
		
		
		WebElement src =driver.findElement(By.xpath("(//div[@class='column']),[1]"));
		WebElement dest=driver.findElement(By.xpath("(//div[@class='column']),[2]"));
		
		act.dragAndDrop(src,dest).build().perform();*/
	@Test
	 public void actionDemo() {
	  
	  openBrowser("CHROME", "http://jqueryui.com/resources/demos/droppable/default.html");
	  
	  //clickOnElement(By.xpath("//a[@href='/drag_and_drop']"));
	  
	  try {
	   Actions act = new Actions(driver);
	   
	   WaitForVisible(By.xpath("/html[1]/body[1]/div[1]"));
	   WebElement src = driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
	   
	   WaitForVisible(By.xpath("/html[1]/body[1]/div[2]"));
	   WebElement dest = driver.findElement(By.xpath("/html[1]/body[1]/div[2]"));
	   
	   act.dragAndDrop(src, dest).build().perform();
	   
	   
	   
	  } catch (Exception e) {
	   
	   e.printStackTrace();
	}
	}
	}
