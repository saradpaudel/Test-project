package AlertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertDemo {
	


		public static void main(String[] args) throws InterruptedException {
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarad\\Downloads\\ECLIPS\\BROWSER_DRIVER\\chromedriver.exe");
		// Initialize browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// open url
		driver.get("https://the-internet.herokuapp.com/");

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		   //click on JavaScript Alerts Link
		wait.until(ExpectedConditions.visibilityOf(
		    driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")))).click();

		   //Click on Click for JS alert
		   wait.until(ExpectedConditions.visibilityOf(
		    driver.findElement(By.xpath("//button[@onclick='jsAlert()']")))).click();
		 
		   Thread.sleep(5000);
		   driver.switchTo().alert().accept();
		   
		   
		   //Click on Click for JS confirm
		   wait.until(ExpectedConditions.visibilityOf(
		    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")))).click();
		 
		   Thread.sleep(5000);
		  String alertText = driver.switchTo().alert().getText();
		  
		  System.out.println("Alert Text = "+alertText);
		   driver.switchTo().alert().dismiss();
		   
		   
		 //Click on Click for JS Prompt
		   wait.until(ExpectedConditions.visibilityOf(
		    driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")))).click();
		 
		   Thread.sleep(1000);
		   
		  
		driver.switchTo().alert().sendKeys("ABCD");
		driver.switchTo().alert().dismiss();


		   

		}

		}


