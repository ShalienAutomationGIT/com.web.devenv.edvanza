package com.pages.edvanza;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.edvanza.BasePage;

public class WelcomeToEdvanzaScreen extends BasePage {
	
	WebDriver driver;
	
	
	public WelcomeToEdvanzaScreen(WebDriver driver)
	{
		this.driver = driver;
	}
	
		
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div")
	WebElement clickStartLink;
	
	@FindBy(xpath="//div[@class='css-901oao r-xd6kpl'][contains(.,'Welcome to Edvanza,')]")
	WebElement welcome_To_edvanzaheaderText;
	
	
	
	@FindBy(xpath="//div[@class='css-901oao r-18u37iz']//span[contains(.,'Shalien')]")
	WebElement firstnamematchtext;
	
	@FindBy(xpath="//div[@class='css-901oao r-18u37iz']//span[contains(.,'Kaushik')]")
	WebElement lastnamematchtext;
	
	@FindBy(xpath="//div[@class='css-901oao r-ubezar'][contains(.,'Lets get started')]")
	WebElement letsgetStartedCTA;  
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18c69zk r-1loqt21 r-18u37iz r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'][contains(.,'Register')]")   
	WebElement registerCTA;
	
	
	
	public void verifyHeader() throws Throwable
	{
		try{
			//String actHeader = welcome_To_edvanzaheaderText.getText();
			//System.out.println("1. Header Text on Welcome to Edvanza Screen: " +actHeader);	
			
		//	Assert.assertEquals(actHeader, "Welcome to Edvanza,");
			}catch(Exception e)
			{
				e.printStackTrace();
				
			}
				
		
	}
	
	
//	public void matchfirstandlastName()
//	{
//		try {
//			
//			WebElement firstnameSignup = driver.findElement(By.xpath("//div[@class='css-901oao r-18u37iz']//[contains(.,'"+(CONFIG.getProperty("firstName")+"']")));
//			
//			WebElement lastnameSignup = driver.findElement(By.xpath("//div[@class='css-901oao r-18u37iz']//[contains(.,'"+(CONFIG.getProperty("lastName")+"']")));
//			
//			if(firstnameSignup.isDisplayed() && lastnameSignup.isDisplayed())==tru
//			
//			
//			
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
////		
//		
//	
//	}
	
	
	
	public void clickLetsgetStartedCTA()
	{
		Actions act = new Actions(driver);
		act.moveToElement(letsgetStartedCTA).click().build().perform();
		
		
	}	
	
	

}
