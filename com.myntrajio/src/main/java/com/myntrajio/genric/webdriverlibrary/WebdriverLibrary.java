package com.myntrajio.genric.webdriverlibrary;


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverLibrary {
	

	public WebDriver driver;
	public static WebDriver static_driver = null;
	public Actions action;
	public Select select;
	
	
	/**
	 * This Method Launches Specified browser
	 * 
	 * @param browser
	 */
	
	public WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			//WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			static_driver=driver;
			break;
		case "firefox":
			//WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			static_driver=driver;
			break;
		case "edge":
			//WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			static_driver=driver;
			break;
		default:
			System.out.println("Invalid browser Info");
		}

		return driver;
	}

	//maximize the browser
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to navigate to the application
	 * 
	 * @param url
	 */
	public void navigateToApp(String url) {
		driver.get(url);
	}
	/**
	 * This method waits until element or elements is found
	 * 
	 * @param time
	 */
	public void waitUntilElementFound(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	/**
	 * This method waits until element is visible on the web page
	 * 
	 * @param time
	 * @param element
	 * @return
	 */
	
	
	
	public void explicitWait(long time ,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	/**
	 * This method is used to mouse hover on an element
	 * 
	 * @param element
	 */
	public void doubleClickonElement(WebElement element) {
		action=new Actions(driver);
		action.contextClick(element).perform();
	}
	/**
	 * This method is used to right click on an element
	 * 
	 * @param element
	 */
	public void rightClickElement(WebElement element) {
		action=new Actions(driver);
		action.contextClick(element).perform();
	}
	/**
	 * This method is used to drag and drop an element to target location
	 * 
	 * @param element
	 * @param target
	 */
	public void dragAndDroupElement(WebElement element,WebElement target) {
		action=new Actions(driver);
		action.dragAndDrop(element, target).perform();
	}
	/**
	 * This method is used to select an element from drop down based on index
	 * 
	 * @param element
	 * @param index
	 */
	public void selectFromDropdown(WebElement element,int index) {
		select=new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * This method is used to select an element from drop down based on value
	 * attribute
	 * 
	 * @param element
	 * @param value
	 */
	public void selectFromDropdown(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}
	/**
	 * This method is used to select an element from drop down based on visible text
	 * 
	 * @param text
	 * @param element
	 */
	public void selectFromDropdown(String text, WebElement element) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * This method is used to switch to frame based on index
	 * 
	 * @param index
	 */
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to switch to frame based on id or name attribute value
	 * 
	 * @param idOrName
	 */
	public void switchToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);
	}

	/**
	 * This method is used to switch to frame based on frame element
	 * 
	 * @param element
	 */
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * This method is used to switch back to default window
	 */
	public void switchToDefaultWindow() {
		driver.switchTo().defaultContent();
	}

	

	/**
	 * This method is used to scroll till the specified element on the web page
	 * 
	 * @param element
	 */
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	/**
	 * This method handles alert pop up
	 * 
	 * @param status
	 */
	public void handleAlert(String status){
		Alert al = driver.switchTo().alert();
		if (status.equalsIgnoreCase("ok"))
			al.accept();
		else
			al.dismiss();
	}

	/**
	 * This method is used to close current tab or window
	 */
	public void closeWindow() {
		driver.close();
	}

	/**
	 * This method is used to close all the opened tabs or windows
	 */
	public void quitAllWindows() {
		driver.quit();
	}

	/**
	 * This method converts dynamic xpath to WebElement
	 * 
	 * @param commonPath
	 * @param replaceData
	 * @return
	 */
	public WebElement convertDynamicXpathToWebElement(String commonPath, String replaceData) {
		String requiredPath = String.format(commonPath, replaceData);
		return driver.findElement(By.xpath(requiredPath));
	}

}

