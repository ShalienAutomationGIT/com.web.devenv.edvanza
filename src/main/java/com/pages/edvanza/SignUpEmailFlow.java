package com.pages.edvanza;

import java.io.FileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.edvanza.BasePage;
import com.opencsv.CSVReader;



public class SignUpEmailFlow extends BasePage {
	
	WebDriver driver;
	
	public SignUpEmailFlow(WebDriver driver)
	{
		this.driver = driver;
	}
	
	 
// Edvanza Platform	Locators
	
	// Tutorials
	
	
	
	@FindBy(id="IntroSlider_btn_navigate_next")
	WebElement tutorialsStarted;
	
	@FindBy(id="IntroSlider_btn_card_submit")
	WebElement tutorialsSubmitted;

// SignUp with Email Flow - Register Screen
	
	@FindBy(id="Dashboard_btn_navigate_register") 
	WebElement login_registerCTA;
	
	@FindBy(id="Register_btn_navigate_Signup") 
	WebElement signUpCTA;
	
	@FindBy(id="Register_btn_navigate_Signup_email")   // newly picked up as id
	 WebElement signupwithEmailCTA; 
	
// SignUp Email Flow - SignUp via Email
	
	@FindBy(id="Signup_input_email")
	public WebElement emailAddress;

	@FindBy(id="Signup_input_first_name")
	public WebElement firstName;
	
	@FindBy(id="Signup_input_last_name")
	public WebElement lastName;   
	
	@FindBy(id="Signup_btn_submit")   
	WebElement joinEdvanzaCTA;
	
	// Set PAssword
	@FindBy(id="SignUp_input_password")
	WebElement password;
	
	@FindBy(id="SignUp_input_confirmPassword")   
	WebElement confirmPassword;
	
	@FindBy(id="SetPassword_btn_submit")   
	WebElement setNewPasswordCTA;
	
	@FindBy(id="BasicDetails_btn_popup_close")   
	WebElement letsGetStartedPopup;
	
	
	// onboarding Screens
	@FindBy(id="BasicDetail_input_drawer_country")
	WebElement countryddn;
	
	@FindBy (id = "BasicDetail_btn_icon_select_1")
	WebElement selectedCountryINDIA;
	
	@FindBy (id="BasicDetails_btn_submit")
	WebElement saveAndcontinueCTA;
	
	@FindBy (id = "UpdateProfile_btn_secondarySubmit")
	//@FindBy (xpath = "//div[1]/div/div/div/div/div[2]/div[3]/div/div[5]/div/div/div[2]/div/div")
	WebElement sayCheeese_skipCTA;
	
	//@FindBy (xpath = "//div[@class='css-901oao r-ubezar'][contains(.,'All set')]")
	@FindBy(id="ThemeSelection_btn_submit")
	WebElement chooseTheme_allSetCTA;
	
	@FindBy (xpath = "//div[@class='css-901oao'][contains(.,'Onboarding complete!')]")
	WebElement onboardingCompleteHeader;
	
	//@FindBy (xpath = "//div[@class='css-901oao r-ubezar'][contains(.,'LET’S GO')]")
	@FindBy(id="ThemeSelection_btn_navigate_DashBoard")
	WebElement letsGOCTA_onboardingcompletepopup;
	
	
	
	public void verifyBuildVerificationURL()
	{
		
		String acturl = driver.getCurrentUrl();
		String expURL = CONFIG.getProperty("DEVURL");
		Assert.assertEquals(acturl, expURL);
		System.out.println("TC_1/TS1 : Dev Web URL appearing as  : " +acturl);
		
		
	}
	
	public void verifyTutorials() throws InterruptedException
	{
		
		System.out.println();
		Thread.sleep(3000);
				
		for(int i=0;i<6;i++)
		{
				Actions act2 = new Actions(driver);
				act2.moveToElement(tutorialsStarted).click().build().perform();
				Thread.sleep(1000);
			
			}
				tutorialsSubmitted.click();
				Thread.sleep(3000);
				wait(driver, CONFIG.getProperty("LoginRegisterCTAVisibility"));
				System.out.println("TC_2/TS1 : Tutorials Screens automated successfully based on ID");
			}
	
	
	
	public void verifyPreSignUpdashboardTitle()
	{
		
		String acttitle = driver.getTitle();
		String expectedTitle = CONFIG.getProperty("PreDashboardPageTitle");
		Assert.assertEquals(acttitle, expectedTitle);
		System.out.println("TC_2/TS2 : Title on Pre Dashboard Page : " +acttitle);
			
	}
	
	
	public void clickSignUpCTA() throws Throwable
	{
		genericClick(driver, login_registerCTA);
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		act1.moveToElement(signUpCTA).click().build().perform();
		Thread.sleep(2000);
		act1.moveToElement(signupwithEmailCTA).click().build().perform();
		System.out.println();
		System.out.println("TC_3/TS1 : SignUp screen automated successfully based on ID");
		
		
	}

	
	
	public void verifySignupemaildetails() throws Throwable
	{
		
		
		if (emailAddress.isDisplayed() == true) {
			//emailAddress.click();
			genericClick(driver, emailAddress);  // created generic click method in base class
			emailAddress.sendKeys(CONFIG.getProperty("emailaddress1"));
			Thread.sleep(1000);
			
		} else 
			{
				Assert.assertTrue(emailAddress.isDisplayed());
			}
		
		if (firstName.isDisplayed() == true) {
			genericClick(driver, firstName); 
			firstName.sendKeys(CONFIG.getProperty("firstName"));
			Thread.sleep(1000);
			
			
		} else
			{
				Assert.assertTrue(firstName.isDisplayed());
			}
		
		if (lastName.isDisplayed() == true) {
			genericClick(driver, lastName); 
			lastName.sendKeys(CONFIG.getProperty("lastName"));
			Thread.sleep(1000);
			
		} else 
			{
				Assert.assertTrue(lastName.isDisplayed());
			}
		
		if(joinEdvanzaCTA.isDisplayed()==true)
		{
			genericClick(driver, joinEdvanzaCTA);
			Thread.sleep(3000);
		}else 
		{
			Assert.assertTrue(joinEdvanzaCTA.isDisplayed());
		}
		 	System.out.println("TC_3/TS2 : Sign up via Email screen automated successfully based on ID");
	}
	
	
	public void verifysetPasswordScreen() throws Throwable
	{
		
		
		if (password.isDisplayed() == true) {
			genericClick(driver, password);  // created generic click method in base class
			password.sendKeys(CONFIG.getProperty("Password"));
			Thread.sleep(1000);
			
		} else 
			{
				Assert.assertTrue(password.isDisplayed());
			}
		
		if (confirmPassword.isDisplayed() == true) {
			genericClick(driver, confirmPassword); 
			confirmPassword.sendKeys(CONFIG.getProperty("ConfirmPassword"));
			Thread.sleep(1000);
			
			
		} else
			{
				Assert.assertTrue(confirmPassword.isDisplayed());
			}
		
		if(setNewPasswordCTA.isDisplayed()==true)
		{
			genericClick(driver, setNewPasswordCTA);
			Thread.sleep(5000);
			//wait(driver, CONFIG.getProperty("PasswordFieldVisibility"));
			//wait(driver, "//div[@id='BasicDetails_btn_popup_close']");
		}else 
		{
			Assert.assertTrue(setNewPasswordCTA.isDisplayed());
		}
		 System.out.println("TC_3/TS3 : Set Password screen automated successfully based on ID");
		 
		 
			
		}
	

	public void verifyOnboardingScreens() throws Throwable
	{
		
		if(letsGetStartedPopup.isDisplayed()==true)
		{
			genericClick(driver, letsGetStartedPopup);
			//wait(driver, CONFIG.getProperty("PasswordFieldVisibility"));
			Thread.sleep(3000);
		}else 
		{
			Assert.assertTrue(letsGetStartedPopup.isDisplayed());
		}
		
			System.out.println();
			System.out.println("TC_4/TS1 : Lets Get Started popup automated successfully based on ID");
		
		if (countryddn.isDisplayed() == true) {
			genericClick(driver, countryddn);  // created generic click method in base class
			Thread.sleep(1000);
			
		} else 
			{
				Assert.assertTrue(countryddn.isDisplayed());
			}
		
		if (selectedCountryINDIA.isDisplayed() == true) {
			genericClick(driver, selectedCountryINDIA); 
			Thread.sleep(1000);
			
			
		} else
			{
				Assert.assertTrue(selectedCountryINDIA.isDisplayed());
			}
		
		if(saveAndcontinueCTA.isDisplayed()==true)
		{
			genericClick(driver, saveAndcontinueCTA);
			//wait(driver, CONFIG.getProperty("PasswordFieldVisibility"));
			Thread.sleep(3000);
		}else 
		{
			Assert.assertTrue(saveAndcontinueCTA.isDisplayed());
		}
		 
		System.out.println("TC_4/TS2 : Tell Us about Yourself screen automated successfully based on ID");
		 
		 if(sayCheeese_skipCTA.isDisplayed()==true)
			{
				genericClick(driver, sayCheeese_skipCTA);
				Thread.sleep(3000);
				//wait(driver, CONFIG.getProperty("PasswordFieldVisibility"));
			}else 
			{
				Assert.assertTrue(sayCheeese_skipCTA.isDisplayed());
			}
		 
		 	System.out.println("TC_4/TS3 : Say Cheeese pic upload screen automated successfully based on ID");
		 
		 if(chooseTheme_allSetCTA.isDisplayed()==true)
			{
				genericClick(driver, chooseTheme_allSetCTA);
				Thread.sleep(3000);
				//wait(driver, CONFIG.getProperty("PasswordFieldVisibility"));
			}else 
			{
				Assert.assertTrue(chooseTheme_allSetCTA.isDisplayed());
			}
		 
		 	System.out.println("TC_4/TS4 : Choose Your Theme screen automated successfully based on ID");
		 
		 if(letsGOCTA_onboardingcompletepopup.isDisplayed()==true)
			{
				genericClick(driver, letsGOCTA_onboardingcompletepopup);
				Thread.sleep(6000);
				//wait(driver, CONFIG.getProperty("PasswordFieldVisibility"));
			}else 
			{
				Assert.assertTrue(letsGOCTA_onboardingcompletepopup.isDisplayed());
			}

			 System.out.println("TC_4/TS5 : Lets Get Started Popup automated successfully based on ID");
			 System.out.println("TC_4/TS6 : User successfully reaching on Dashboard");
			
		}
		 
			
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	






	
	


	
	


