package com.tests.edvanza;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.base.edvanza.BasePage;
import com.pages.edvanza.MarketingPage;


public class MarketingPageTest extends BasePage {
	
	
	
	@Test(priority=1)
	public void testregisterScreenFlow() throws Throwable
	{
		try {
			
		
		MarketingPage mp = PageFactory.initElements(driver, MarketingPage.class);
		mp.verifyMarketingPages();
		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
	}
	


}
