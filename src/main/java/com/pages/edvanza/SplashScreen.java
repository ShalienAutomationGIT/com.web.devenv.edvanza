package com.pages.edvanza;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.base.edvanza.BasePage;

public class SplashScreen extends BasePage {
	
	WebDriver driver;
	
	
	public SplashScreen(WebDriver driver)
	{
		this.driver = driver;
	}
	
		
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div")
	WebElement clickStartLink;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div")
	WebElement clickNextLink;
	
	
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div")
	WebElement finishLink;
	
	@FindBy(xpath = "//a[@href='#'][contains(.,'Logout')]")
	WebElement logoutButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[3]/div")
	WebElement registerCTAdashboard;  
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18c69zk r-1loqt21 r-18u37iz r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'][contains(.,'Register')]")   
	WebElement registerCTA;
	
	
	
	public void ClickLoginCTA() throws Throwable
	{
		// Handle Multiple Window
		
				String currentHandle= driver.getWindowHandle();
				
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div[2]/a[1]/button")).click();
				
				//Get all the handles currently available
				Set<String> handles=driver.getWindowHandles();
				for(String actual: handles) {
				if(!actual.equalsIgnoreCase(currentHandle)) {
				//Switch to the opened tab
				driver.switchTo().window(actual);
				}
				
			}
				//System.out.println("3. Handled multiple window successfully");
				Thread.sleep(2000);
		
	}
	
	public void verifyLandingPageTitle()
	{
		String title = driver.getTitle();
		System.out.println("************************************  SPLASH/TUTORIAL SCREEN *****************************************");
		System.out.println();
		System.out.println("1 ->  Fav Icon Title on Spash Screen : " +title);
		Assert.assertTrue(title.contains("home"));
		
		
	}	
	
	
	
	
	 public void verifyTutorialScreens() throws InterruptedException
	 {
		 Actions act = new Actions(driver);
		 act.moveToElement(clickStartLink).click().build().perform();
		
		 Thread.sleep(1000);
		 act.moveToElement(clickNextLink).click().build().perform();
		 Thread.sleep(1000);
		 act.moveToElement(clickNextLink).click().build().perform();
		 Thread.sleep(1000);
		 act.moveToElement(clickNextLink).click().build().perform();
		 Thread.sleep(1000);
		 act.moveToElement(clickNextLink).click().build().perform();
		 Thread.sleep(1000);
		 act.moveToElement(clickNextLink).click().build().perform();
		 Thread.sleep(2000);
		 //act.moveToElement(registerCTAdashboard).click().build().perform();
		 
		 System.out.println("1.1 ---> Splash Screen is automated successfully");
		 
		 
	 }
	
	
	
	
	
	
	
	

}
