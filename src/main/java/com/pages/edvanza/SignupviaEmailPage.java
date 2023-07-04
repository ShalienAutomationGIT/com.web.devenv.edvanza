package com.pages.edvanza;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.base.edvanza.BasePage;

public class SignupviaEmailPage extends BasePage{

	
	
WebDriver driver;

public SignupviaEmailPage(WebDriver driver)
{
	this.driver = driver;
}

	@FindBy(xpath="//input[@id='Signup_input_email']")
	WebElement emailAddress;

	@FindBy(xpath="//input[@id='Signup_input_first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='Signup_input_last_name']")
	WebElement lastName;   
	
	@FindBy(xpath="//div[@id='Signup_btn_submit']")   
	WebElement joinEdvanzaCTA;
	
	@FindBy(xpath="//input[@id='SignUp_input_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='SignUp_input_confirmPassword']")   
	WebElement confirmPassword;
	
	@FindBy(id="SetPassword_btn_submit")   
	WebElement setNewPasswordCTA;



public void verifySignUpViaEmailPageTitle()
{
	String title = driver.getTitle();
	
	System.out.println();
	System.out.println("************************************  SIGN UP VIA EMAIL SCREEN ENDS*****************************************");
	System.out.println();
	System.out.println("3 -->  Title on Sign up via Email Page : " +title);
	Assert.assertTrue(title.contains("Edvanza"));
	
	
}

public void enter_Signup_via_Email_details(String emailAddress1, String fName, String lname, String Password, String ConfirmPassword) throws Throwable
{
	
	// Explicit wait for SignUp via Email Header
	wait(driver, "//div[@class='css-901oao'][contains(.,'Sign up via Email')]");  // explicit wait for Signup with email link to appear 
	
	Thread.sleep(1000);
	
	if (emailAddress.isDisplayed()==true)
	{
			emailAddress.click();
			emailAddress.sendKeys(CONFIG.getProperty(emailAddress1));
			Thread.sleep(1000);
	} else {
		Assert.assertTrue(emailAddress.isDisplayed());
	}
	
	if (firstName.isDisplayed()==true)
	{
		firstName.click();
		firstName.sendKeys(CONFIG.getProperty(fName));
			Thread.sleep(1000);
	} else {
		Assert.assertTrue(firstName.isDisplayed());
	}
	
	if (lastName.isDisplayed()==true)
	{
		lastName.click();
		lastName.sendKeys(CONFIG.getProperty(lname));
			Thread.sleep(2000);
	} else {
		Assert.assertTrue(lastName.isDisplayed());
	}
	if (joinEdvanzaCTA.isDisplayed()==true)
	{
		joinEdvanzaCTA.click();
			
	} else {
		Assert.assertTrue(joinEdvanzaCTA.isDisplayed());
	}
	
	wait(driver, "//input[@placeholder='Password']"); 
	
	
	if (password.isDisplayed()==true)
	{
		password.click();
		password.sendKeys(CONFIG.getProperty(Password));
			Thread.sleep(1000);
	} else {
		Assert.assertTrue(password.isDisplayed());
	}
	if (confirmPassword.isDisplayed()==true)
	{
		confirmPassword.click();
		confirmPassword.sendKeys(CONFIG.getProperty(ConfirmPassword));
			Thread.sleep(2000);
	} else {
		Assert.assertTrue(confirmPassword.isDisplayed());
	}
	if (setNewPasswordCTA.isDisplayed()==true)
	{
		Actions act = new Actions(driver);
		act.moveToElement(setNewPasswordCTA).click().build().perform();
			
		Thread.sleep(1000);
	} else {
		Assert.assertTrue(setNewPasswordCTA.isDisplayed());
	}
	
	System.out.println("3a ---> SignUp via Email Screen is automated successfully");
	 
	  
//	  firstName.click();
//	  firstName.sendKeys(CONFIG.getProperty("firstName"));
//	  Thread.sleep(1000);
//	  
//	  lastName.click(); 
//	  lastName.sendKeys(CONFIG.getProperty("lastName"));
//	  Thread.sleep(2000);
//	  
//	  Actions act = new Actions(driver);
//	  act.moveToElement(joinEdvanzaCTA).click().build().perform();
//	  Thread.sleep(2000);
//	  
//	  wait(driver, "//input[@placeholder='Password']"); 
//	  password.click();
//	  password.sendKeys(CONFIG.getProperty("password"));
//	  Thread.sleep(1000);
//	  confirmPassword.click();
//	  confirmPassword.sendKeys(CONFIG.getProperty("confirmPassword"));
//	  
//	  Thread.sleep(2000);
//	  act.moveToElement(setNewPasswordCTA).click().build().perform();
//	  Thread.sleep(3000);
	  //System.out.println("3a ---> SignUp via Email Screen is automated successfully");
	 
	
}

//public void verifySignUpEmailFlow() throws Throwable
//{
//	verifySignUpViaEmailPageTitle();
//	enter_Signup_via_Email_details(null, null, null, null, null);
//	
//	
//}

}
