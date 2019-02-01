package configuration;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public WebDriver driver;
	public WebDriverWait wait;
	public Actions act;

	public void openBrowser(String browserName, String url) {

		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Browser Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\Browser Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Browser Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else {

			System.out.println("Please provide valid browser name");
		}

		driver.manage().window().maximize();
		driver.get(url);

	}

//public void clickOnElement(By object) {
	// driver.findElement(object);

	// public void sendKey(By object) {
	// driver.findElement(object);
	public void WaitForVisible(By object) {
		wait = new WebDriverWait(driver, 60);
		WebElement ele = driver.findElement(object);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void WaitForClick(By object) {
		wait = new WebDriverWait(driver, 60);
		WebElement ele = driver.findElement(object);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void clickOnElement(By object) {
		WaitForVisible(object);
		WaitForClick(object);
		driver.findElement(object).click();
	}
	
	public void sendValueInTextbox(By object, String Value) {
		WaitForVisible(object);
		driver.findElement(object).sendKeys(Value);
		
	}

	public void dropdownSelect1(By object, String value) {
		/*
		 * wait = new WebDriverWait(driver, 60); WebElement ele =
		 * driver.findElement(object);
		 * wait.until(ExpectedConditions.elementToBeClickable(ele));
		 */
		WaitForVisible(object);
		Select sel = new Select(driver.findElement(object));
		sel.selectByVisibleText(value);
	}

	public void dropdownSelect(By object, String text) {
		WaitForVisible(object);
		Select sel = new Select(driver.findElement(object));
		sel.selectByVisibleText(text);

	}

	public void mouseHoverAndClick(By object) {
		act = new Actions(driver);
		WaitForVisible(object);
		act.moveToElement(driver.findElement(object)).click().build().perform();
	}

	public void mouseHoverAndRightClick(By object) {
		act = new Actions(driver);
		WaitForVisible(object);
		act.moveToElement(driver.findElement(object)).contextClick().build().perform();
		  
	}

	public void actionClick(By object) {
		act = new Actions(driver);
		WaitForVisible(object);
		act.click(driver.findElement(object)).build().perform();
	}

	public void actionRightClick(By object) {
		act = new Actions(driver);
		WaitForVisible(object);
		act.contextClick(driver.findElement(object)).build().perform();

	}

	public void navigateBack() {
		System.out.println("performing back operation");
		driver.navigate().back();
	}

	public void navigateForward() {
		System.out.println("performing Forward operation");
		driver.navigate().forward();
	}

	public void waitforSeconds(int time) {

		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}

	public void CapturescreenShot(String screenshotName) {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\screenshot\\" + screenshotName +"-"+getDateTime()+".jpeg");

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public String getDateTime() {
	String mydt  = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss").format(new Date());
	return mydt.replaceAll("\\s","").trim();
	
	

		/*DateFormat dformat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");

		Date dt = new Date();

		String mySystemDate = dformat.format(dt);
		return mySystemDate;
*/
	}

	public void scrollPage(int horizontal, int vertical) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("scroll(" + horizontal + "," + vertical + ")");

	}
	
		public void scrollIntoView(By object) {

			  WaitForVisible(object);

			  WebElement ele = driver.findElement(object);

			  JavascriptExecutor js = ((JavascriptExecutor) driver);

			  js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
	}
		
	
	
}
