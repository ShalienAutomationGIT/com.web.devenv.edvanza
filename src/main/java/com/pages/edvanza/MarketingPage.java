package com.pages.edvanza;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.base.edvanza.BasePage;

public class MarketingPage extends BasePage {

	WebDriver driver;
	
	public MarketingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy (xpath = "/html/body/div/div[1]/div[1]/div/div[2]/div/button" )
	WebElement mkt_login_signupCTA ;
	

	
	
	public void verifyMarketingPageTitle()
	{
		System.out.println("************************************  MARKETING SCREEN ENDS *****************************************");
		System.out.println();
		String title = driver.getTitle();
		System.out.println("1. Title on Marketing Page : " +title);
		Assert.assertTrue(title.contains("Edvanza | Unlock your potential with AI-powered Smart Career tools"));
		
		
	}

	

	public void click_login_SignUpCTA() throws Throwable
	{
		
		
		wait(driver, "/html/body/div/div[1]/div[2]/div/div[2]/button");
		Thread.sleep(2000);
		
		if(mkt_login_signupCTA.isDisplayed()==true)
		{
		Actions act1 = new Actions(driver);
		act1.moveToElement(mkt_login_signupCTA).click().build().perform();
		wait(driver, "//div[@class='css-901oao'][contains(.,'Sign up')]");
		}
			else {
					Assert.assertTrue(mkt_login_signupCTA.isDisplayed());
				}

	}
	
	
	public void verifyMarketingPages() throws Throwable {
		
		verifyMarketingPageTitle();
		click_login_SignUpCTA();
		
	}
	
	
	
	
	
}
