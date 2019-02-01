package testScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import configuration.Base;

public class multyWindowDemo2 extends Base {
	@Test
	 public void multiple() {
	  openBrowser("CHROME", "https://www.naukri.com/");

	  //This will return parent window name in string format
	  String parentWin = driver.getWindowHandle();
	  /*System.out.println("Parent Window - "+parentWin);
	  System.out.println("");*/
	  
	  
	  
	  //This will return all the windows opened by webdriver in set<String> format.
	  Set<String> set_allWin=   driver.getWindowHandles();
	  //iterate value using iterator
	  Iterator<String> itr = set_allWin.iterator();
	  //System.out.println("*******************All Windows are listed below************************");
	  while(itr.hasNext()) {
	   
	   String allWindows= itr.next();
	   //System.out.println("AllWindows - "+allWindows);
	   
	   if(!parentWin.equals(allWindows)) {
	    
	    driver.switchTo().window(allWindows);
	    /*System.out.println("Title for other window = "+driver.switchTo().window(allWindows).getTitle());
	    System.out.println("Closing this window");
	    System.out.println("");*/
	    driver.close();
	  //Switching back to main window
	    driver.switchTo().window(parentWin);
clickOnElement(By.xpath("//span[@class='searchjob']"));
	    
	   }
	  }
	 
	  

	}
}
