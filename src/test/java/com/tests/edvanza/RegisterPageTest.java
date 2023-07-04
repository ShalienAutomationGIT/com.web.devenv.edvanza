package com.tests.edvanza;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.edvanza.BasePage;

import com.pages.edvanza.RegisterPage;
import com.pages.edvanza.SplashScreen;


public class RegisterPageTest extends BasePage {
	
	
	
	@Test(priority=1)
	public void testregisterScreenFlow() throws Throwable
	{
		try {
			
		
		RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		rp.verifyRegisterPages();
		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
	}
	


}
