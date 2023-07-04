package com.tests.edvanza;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.edvanza.BasePage;

import com.pages.edvanza.SplashScreen;


public class SpashScreenTest extends BasePage {
	
	
	
	@Test(priority=1)
	public void testspalshScreenFlow() throws Throwable
	{
		try {
			SplashScreen ss = PageFactory.initElements(driver, SplashScreen.class);
			
			Thread.sleep(3000);
			
			
			ss.ClickLoginCTA();
			ss.verifyLandingPageTitle();
			ss.verifyTutorialScreens();
			//ss.clickRegisterCTA();
			
			
			
		} catch(Exception e)
		{
			e.printStackTrace();
			System.out.print(e);
			
		}
			
		
		
		
		
		
	}
	


}
