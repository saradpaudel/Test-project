package testScripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import configuration.Base;

public class MultipleElements extends Base{

	@Test
	
	public void findElementsDemo() {
	
//	openBrowser("chrome","http://google.com");
//List<WebElement> Is_links =driver.findElements(By.xpath("//a"));
//int sizeofList = Is_links.size();
//System.out.println("size ="+sizeofList);
//for(int i = 0; i < sizeofList; i++ ) {
//	String text = Is_links.get(i).getText();
//	//System.out.println(i+""+text);
//	System.out.println(Is_links.get (i));
	
	openBrowser("Chrome", "http://in.yahoo.com");
	  
	  List<WebElement> ls_links= driver.findElements(By.xpath("//span[@class='C($searchBlue):h Fw(b) Mstart(2px)']"));
	  int sizeOfList = ls_links.size();
	  
	  System.out.println("Size = "+sizeOfList);
	  
	 // for (int i = 0; i < sizeOfList; i++) {
	   
	  // String text =ls_links.get(i).getText();
	   
	   //System.out.println(i+" "+text);
	   for ( WebElement WebElements : ls_links) {
		    System.out.println(WebElements.getText() );
	  }
	  }

}
