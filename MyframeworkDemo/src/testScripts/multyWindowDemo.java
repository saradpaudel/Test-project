package testScripts;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import configuration.Base;

public class multyWindowDemo extends Base{
	
	@Test
	public void multipal() {
		openBrowser("chrome","http://www.naukri.com/");
		//This will return parent window name in string former
		String parentWin = driver.getWindowHandle();
		//This will return all the window opened by webdriver in set<string> formet.
		Set<String> set_allWin = driver.getWindowHandles();
		Iterator<String> itr = set_allWin.iterator();
		//System.out.println("*************Allwindow are listed below***********");
		while(itr.hasNext()) {
		
			String allWindows = itr.next();
			//System.out.println(allWinItr);
			String childWin = itr.next();
			//System.out.println("AllWindows -"+allWindows);
			
			if(parentWin.equals(allWindows)) {
				driver.switchTo().window(allWindows);
//			System.out.println("Title for other window = "+driver.switchTo().window(allWindows).getTitle());
//		    System.out.println("Closing this window");
//		    System.out.println("");
			    driver.close();
			 // Switching back to main window
			    driver.switchTo().window(parentWin);

			}
			
				
			}
			
		}
		

}
