package testScripts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import configuration.Base;

public class screenShotDemo extends Base {
	
	@Test

	public void actionDemo() {
		
		openBrowser("chrome","https://the-internet.herokuapp.com/hovers");
				
		Actions act = new Actions(driver);
		
		mouseHoverAndClick(By.xpath("//div[@class='example']//div[2]//img[1]"));
		waitforSeconds(5);
		mouseHoverAndClick(By.xpath("//a[@href = '/users/2']"));
		navigateBack();
		//navigateForward();
		
/*		TakesScreenshot ts = ((TakesScreenshot)driver);
		 File source = ts.getScreenshotAs(OutputType.FILE);
		  
		  File destination = new File(".\\screenshot\\test.png");
		  
		  try {
		   FileUtils.copyFile(source, destination);
		  } catch (IOException e) {
		   e.printStackTrace();

}*/
		CapturescreenShot("test5");
//		DateFormat dformat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
//		  
//		  Date dt = new Date();
//		  
//		  String mySystemDate = dformat.format(dt);
//		  
//		  System.out.println("My current date is = "+mySystemDate);
		  
		  String dateTime = getDateTime();
		  System.out.println("current date and time="+dateTime);
}
}