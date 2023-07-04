package com.tests.edvanza;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.base.edvanza.BasePage;
import com.opencsv.CSVReader;
import com.pages.edvanza.MarketingPage;
import com.pages.edvanza.SignUpEmailFlow;




public class SignUPEmailFlowTest extends BasePage {
	
	
	 @Test(description="TC1: To Check build verification and stability",priority=1) 
	  public void testbuildverification() throws Throwable {
	 
	  try {
	  
	  SignUpEmailFlow sef = PageFactory.initElements(driver,SignUpEmailFlow.class); 
	 
	  sef.verifyBuildVerificationURL();
	  Reporter.log("Build passed and Verified successfully");
	  
	  
	  
	  }catch(Exception e) 
	  	{ 
		  e.printStackTrace(); 
		  System.out.println(e); 
		  Reporter.log("Build Failed", true);
	  	}
	 
	}

	
	
	
	  @Test(description="TC2: Pre SignUp Screen Test case",priority=2) 
	  public void testPreSignUpFlow() throws Throwable {
	 
	  try {
	  
	  SignUpEmailFlow sef = PageFactory.initElements(driver,SignUpEmailFlow.class); 
	 
	  sef.verifyTutorials();
	  sef.verifyPreSignUpdashboardTitle();
	  Reporter.log("User reached to pre login screen and able to see tutorials");
	  
	  
	  }catch(Exception e) 
	  	{ 
		  e.printStackTrace(); 
		  System.out.println(e); 
	  	}
	 
	}


	  @Test(description="TC3: Verify SignUp Email Screens", priority=3) 
	  public void testSignUpEmailScreens() throws Throwable {
	 
	  try {
	  
	  SignUpEmailFlow sef = PageFactory.initElements(driver,SignUpEmailFlow.class); 
	 
	  
	  sef.clickSignUpCTA();
	  sef.verifySignupemaildetails();
	  sef.verifysetPasswordScreen();
	  Reporter.log("User succesfully reaching to onboarding screens");
	  
	  
	  }catch(Exception e) 
	  	{ 
		  e.printStackTrace(); 
		  System.out.println(e); 
	  
	  	}
	 }


	  @Test(description="TC4: Verify Onboarding Screens", priority=4) 
	  public void testOnboardingFlow() throws Throwable {
	 
	  try {
	  
	  SignUpEmailFlow sef = PageFactory.initElements(driver,SignUpEmailFlow.class); 
	 
	  sef.verifyOnboardingScreens();
	  Reporter.log("User completes the onboarding and reaching to dashboard as Post SignUp user");
	  
	  
	  
	  }catch(Exception e) 
	  	{ 
		  e.printStackTrace(); 
		  System.out.println(e); 
	  
	  	}
	 }

}
	 
	
	
	
	
	
			  

