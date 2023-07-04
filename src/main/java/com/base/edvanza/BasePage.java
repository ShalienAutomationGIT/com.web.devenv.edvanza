package com.base.edvanza;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.utils.edvanza.Constants;

public class BasePage {

	// Create Global Objects
	
	public static WebDriver driver = null;
	public static Properties CONFIG = null;
	
	// Initialise Properties file
	
	public void initConfig()
	{
		
		CONFIG = new Properties();
		
		try {
			
			FileInputStream fip = new FileInputStream(Constants.PROPERTIES_FILE_PATH);
			
			CONFIG.load(fip);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	// Initialise Browsers
	
	
	public void initBrowsers()
	{
		if(driver==null)
		{
			if(CONFIG.getProperty("browserName").equalsIgnoreCase("Chrome"))
			{
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--incognito");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//java//drivers//chromedriver");
				 driver = new ChromeDriver(option);
			}
			
			else if (CONFIG.getProperty("browserName").equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver");
				FirefoxDriver driver = new FirefoxDriver();
			}
			
			else if (CONFIG.getProperty("browser").equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//src//main//java//drivers//chromedriver");
				InternetExplorerDriver driver = new InternetExplorerDriver();
				
			}
		
				else {		
						ChromeOptions option = new ChromeOptions();
						option.addArguments("--incognito");
						System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//java//drivers//chromedriver");
						 driver = new ChromeDriver(option);
				
					}
		
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
						driver.manage().window().maximize();				
		
			}			
	
			
	}
		
		
	
		public void invokeApplication()
		{
		
			//driver.get("https://edvanza.com/");
			driver.get("https://dev.edvanza.com");
			//String getURL = CONFIG.getProperty("url");
			//System.out.println(getURL);
			//driver.get(getURL);
	
		}		
	
		// Generic functions/methods
		
//		public void clickButton(String xpath)
//		{
//			driver.findElement(By.xpath(xpath)).click();
//		}
		
		public boolean genericClick(WebDriver driver, WebElement elementToBeClicked)
		{
			try {
				elementToBeClicked.click();
				return true;
			
			}catch (Exception e) {
				// TODO: handle exception
				return false;
			}
			
		}
		
		
		
	
		public void closeBrowser()
		{
			driver.close();
		}
	
	

		public void quitBrowser()
		{
			driver.quit();
		}

	
	
		public WebElement wait(WebDriver driver, String xpath)
		{
		
		WebDriverWait wait = new WebDriverWait(driver, 60l);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		}
		
		
		
		
		public void scrollDown_byvisibilityofElement(String element) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//Find element by link text and store in variable "Element" 
			
			WebElement NextElement = driver.findElement(By.xpath(element));
			
			//This will scroll the page till the element is found
			
			js.executeScript("arguments[0].scrollIntoView();", NextElement);
			
		}
		
		
		
		
		@BeforeSuite
		public void setUp()
		{		
			initConfig();
			initBrowsers();
			invokeApplication();		
		
		}
		
	
		@AfterSuite
		public void tearDown() throws InterruptedException, IOException
		{			
			//closeBrowser();
			  quitBrowser();
			  Thread.sleep(2000);
			//seleniumReportGeneration();			  
			  
	
		}	






}
	
	
	
	
	
	
	
	
	

