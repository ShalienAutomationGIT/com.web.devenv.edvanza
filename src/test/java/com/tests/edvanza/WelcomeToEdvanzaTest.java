package com.tests.edvanza;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.edvanza.BasePage;

import com.pages.edvanza.SplashScreen;
import com.pages.edvanza.WelcomeToEdvanzaScreen;


public class WelcomeToEdvanzaTest extends BasePage {
	
	
	
	@Test(priority=1)
	public void testspalshScreenFlow() throws Throwable
	{
		try {
			WelcomeToEdvanzaScreen wes = PageFactory.initElements(driver, WelcomeToEdvanzaScreen.class);
			
			wes.verifyHeader();
			wes.clickLetsgetStartedCTA();
			
	
			
		} catch(Exception e)
		{
			e.printStackTrace();
			System.out.print(e);
			
		}
			
		
		
		
		
		
	}
	


}
