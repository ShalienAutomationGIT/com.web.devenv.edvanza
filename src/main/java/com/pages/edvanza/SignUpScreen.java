package com.pages.edvanza;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.base.edvanza.BasePage;

public class SignUpScreen extends BasePage {
	
	WebDriver driver;
	
	
	public SignUpScreen(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div/div[2]/div/button")
	WebElement marketing_SignupCTA;
	
	@FindBy(xpath="//div[@class='css-901oao'][contains(.,'Sign up')]")
	WebElement register_SignUpCTA;
	
	@FindBy(xpath="//div[@class='css-901oao'][contains(.,'Sign up with Email')]")
	WebElement register_SignupwithEmailLink;
		
	@FindBy(xpath="//input[@id='SignUp_input_email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='SignUp_input_firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='SignUp_input_lastName']")
	WebElement lastName;   
	
	@FindBy(xpath="//div[@class='css-901oao'][contains(., 'Join Edvanza')]")   
	WebElement joinEdvanzaCTA;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@text='Confirm Password']")   
	WebElement confirmPassword;
	
	
	@FindBy(xpath="//div[@class='css-901oao r-ubezar'][contains(.,'Set new password')]")   
	WebElement setNewPasswordCTA;
	
	
	
	
	
	
	
	public void verifyMarketingPageTitle()
	{
		String title = driver.getTitle();
		System.out.println("1. Title on Landing Page : " +title);
		Assert.assertTrue(title.contains("Edvanza | Unlock your potential with AI-powered Smart Career tools"));
		
		
	}
	
	public void click_marketingSignUpCTA() throws Throwable
	{
		
		
		wait(driver, "/html/body/div/div[1]/div[2]/div/div[2]/button");
		Thread.sleep(2000);
		Actions msignup = new Actions(driver);
		msignup.moveToElement(marketing_SignupCTA).click().build().perform();
		Thread.sleep(3000);
		msignup.moveToElement(register_SignUpCTA).click().build().perform();
		Thread.sleep(2000);
		
	}
	
	public void verifyRegisterPageTitle()
	{
		String title = driver.getTitle();
		System.out.println("");
		System.out.println("************************************  REGISTER SCREEN WITH ALL OPTIONS *****************************************");
		System.out.println();
		System.out.println("2. Fav Icon Title on Signup Screen  : " +title);
		Assert.assertTrue(title.contains("Edvanza"));
		
		
	}
	

	public void verify_Signup_via_EmailScreen() throws Throwable
	{
		wait(driver, "//div[@class='css-901oao'][contains(.,'Sign up with Email')]");  // explicit wait for Signup with email link to appear
		
		Thread.sleep(2000);
		
		Actions msignup = new Actions(driver);
		msignup.moveToElement(register_SignupwithEmailLink).click().build().perform();
		
		System.out.println("");
		System.out.println("************************************  SIGN UP VIA EMAIL SCREEN *****************************************");
		
		// Explicit wait for SignUp via Email Header
		wait(driver, "//div[@class='css-901oao'][contains(.,'Sign up via Email')]"); 
		
		
		
		  emailAddress.click();
		  emailAddress.sendKeys(CONFIG.getProperty("emailaddress"));
		  Thread.sleep(1000); 
		  
		  firstName.click();
		  firstName.sendKeys(CONFIG.getProperty("firstName"));
		  Thread.sleep(1000);
		  
		  lastName.click(); 
		  lastName.sendKeys(CONFIG.getProperty("lastName"));
		  Thread.sleep(2000);
		  
//		  Actions act = new Actions(driver);
//		  act.moveToElement(joinEdvanzaCTA).click().build().perform();
//		  Thread.sleep(1000);
//		  
//		  wait(driver, "//input[@placeholder='Password']"); password.click();
//		  password.sendKeys(CONFIG.getProperty("password")); Thread.sleep(1000);
//		  confirmPassword.click();
//		  confirmPassword.sendKeys(CONFIG.getProperty("confirmPassword"));
//		  
//		  Thread.sleep(3000);
//		  //act.moveToElement(setNewPasswordCTA).click().build().perform();
//		  //Thread.sleep(4000);
		  System.out.println("3 ---> SignUp via Email Screen is automated successfully");
		 
		
	}
	
	
	
	
	
	
	

}
