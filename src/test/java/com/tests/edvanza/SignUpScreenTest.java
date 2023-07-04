package com.tests.edvanza;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.edvanza.BasePage;

import com.pages.edvanza.SignUpScreen;
import com.pages.edvanza.SplashScreen;


public class SignUpScreenTest extends BasePage {
	
	
	
	@Test(priority=1)
	public void testsignUpScreen() throws Throwable
	{
		try {
			SignUpScreen sus = PageFactory.initElements(driver, SignUpScreen.class);
			
			sus.verifyMarketingPageTitle();
			sus.click_marketingSignUpCTA();
			sus.verifyRegisterPageTitle();
			sus.verify_Signup_via_EmailScreen();
			
			
			
		} catch(Exception e)
		{
			e.printStackTrace();
			System.out.print(e);
			
		}
			
}
	


}
