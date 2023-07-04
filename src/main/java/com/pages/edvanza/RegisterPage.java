package com.pages.edvanza;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.base.edvanza.BasePage;

public class RegisterPage extends BasePage {
	
	WebDriver driver;
	
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
 // Locators 
	
	
	
	//@FindBy(xpath="//div[@class='css-901oao'][contains(.,'Sign up')]") older one
	
	@FindBy(id="Register_btn_navigate_Signup") // newly picked up as id
	 WebElement register_SignUpCTA;
	
	
	//@FindBy(xpath="//div[@id='Register_btn_navigate_Signup_email']")
	@FindBy(id="Register_btn_navigate_Signup_email")   // newly picked up as id
	 WebElement r_SignupwithEmailCTA; 
	
	
	
	
	// Functional Methods
	
	
	public void verifyRegisterPageTitle()
	{
		String title = driver.getTitle();
		
		System.out.println();
		System.out.println("************************************  REGISTER SCREEN ENDS*****************************************");
		System.out.println();
		System.out.println("2 -->  Title on Register Page : " +title);
		Assert.assertTrue(title.contains("Edvanza"));
		
		
	}
	
	
	 public void clickRegisterSignUpCTA() throws InterruptedException
	 {
		 Actions act1 = new Actions(driver);
		 if(register_SignUpCTA.isDisplayed()==true)
		 {
			 act1.moveToElement(register_SignUpCTA).click().build().perform();
			 wait(driver, "//div[@class='css-901oao'][contains(.,'Sign up with Email')]");
			 
		 }else {
				Assert.assertTrue(register_SignUpCTA.isDisplayed());
			}
			Thread.sleep(2000);
			
			if(r_SignupwithEmailCTA.isDisplayed()==true)
			{
				act1.moveToElement(r_SignupwithEmailCTA).click().build().perform();
				Thread.sleep(4000);
				
			} else {
					Assert.assertTrue(register_SignUpCTA.isDisplayed());
			}
			
			
			

	 }
	
	 
	 public void verifyRegisterPages() throws Throwable{
		 
		 verifyRegisterPageTitle();
		 clickRegisterSignUpCTA();
		 
	 }
	
	
	
	
	
	
	
	
	
	
	

		
		

	
	
	

}
