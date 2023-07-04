package com.tests.edvanza;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.edvanza.BasePage;

import com.pages.edvanza.MarketingPage;
import com.pages.edvanza.RegisterPage;
import com.pages.edvanza.SignupviaEmailPage;
import com.pages.edvanza.SplashScreen;


public class SignupviaEmailPageTest extends BasePage {
	
	
	
	@Test(priority=1)
	public void testsignupviaEmailFlow() throws Throwable
	{
		try {
			
		
			SignupviaEmailPage sep = PageFactory.initElements(driver, SignupviaEmailPage.class);
			
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
	}
	


}
