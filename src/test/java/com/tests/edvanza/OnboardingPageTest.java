package com.tests.edvanza;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.edvanza.BasePage;

import com.pages.edvanza.MarketingPage;
import com.pages.edvanza.OnbaordingPage;
import com.pages.edvanza.RegisterPage;
import com.pages.edvanza.SplashScreen;


public class OnboardingPageTest extends BasePage {
	
	
	
	@Test(priority=1)
	public void testregisterScreenFlow() throws Throwable
	{
		try {
			
		
			OnbaordingPage op = PageFactory.initElements(driver, OnbaordingPage.class);
			op.verifyOnboardingFlow();
		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
	}
	


}
