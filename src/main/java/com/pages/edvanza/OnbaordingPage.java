package com.pages.edvanza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.base.edvanza.BasePage;

public class OnbaordingPage extends BasePage{

WebDriver driver;
	
	public OnbaordingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy (xpath = "//div[@id='BasicDetails_btn_popup_close']/div")
	//@FindBy(id="BasicDetails_btn_popup_close")
	WebElement o_lets_get_StartedCTA ;
	
	@FindBy (xpath = "//div[@class='css-901oao'][contains(.,'Welcome to Edvanza,')]")
	WebElement welcomeToedvanzaHeader ;
	
	//div[@class='css-901oao r-18u37iz']//span[1][contains(.,'Test')]
	
	@FindBy (xpath = "//div[@class='css-901oao r-18u37iz']//span[1][contains(.,'Test')]")
	WebElement firstNameMatch ;
	
	@FindBy (xpath = "//div[@class='css-901oao r-18u37iz']//span[2][contains(.,'Test')]")
	WebElement lastNameMatch ;
	
	//@FindBy (xpath = "//div[@class='css-901oao r-1m72y5m r-ubezar r-16dba41'][contains(.,'Select Country')]")
	@FindBy(id="BasicDetail_input_drawer_country")
	WebElement countryddn;
	
	@FindBy (id = "BasicDetail_btn_icon_select_1")
	WebElement selectedCountryINDIA;
	
	@FindBy (id="BasicDetails_btn_submit")
	WebElement saveAndcontinueCTA;
	
	@FindBy (id = "UpdateProfile_btn_secondarySubmit")
	//@FindBy (xpath = "//div[1]/div/div/div/div/div[2]/div[3]/div/div[5]/div/div/div[2]/div/div")
	WebElement skipthisStepCTA;
	
	//@FindBy (xpath = "//div[@class='css-901oao r-ubezar'][contains(.,'All set')]")
	@FindBy(id="ThemeSelection_btn_submit")
	WebElement allSetCTA;
	
	@FindBy (xpath = "//div[@class='css-901oao'][contains(.,'Onboarding complete!')]")
	WebElement onboardingCompleteHeader;
	
	//@FindBy (xpath = "//div[@class='css-901oao r-ubezar'][contains(.,'LET’S GO')]")
	@FindBy(id="ThemeSelection_btn_navigate_DashBoard")
	WebElement letsGOCTA_onboardingcompletepopup;
	
	@FindBy(id="IntroSlider_btn_navigate_next")
	WebElement tutorialsStarted;
	
	@FindBy(id="IntroSlider_btn_card_submit")
	WebElement tutorialsSubmitted;

	public void clickLetsGetStartedCTA() throws Throwable
	{
		Thread.sleep(2000);
		//Actions act1 = new Actions(driver);
		//act1.moveToElement(o_lets_get_StartedCTA).click().build().perform();
		driver.findElement(By.xpath("//div[@id='BasicDetails_btn_popup_close']/div")).click();
		wait(driver, "//div[@class='css-901oao r-1ifxtd0'][contains(.,'Tell us About Yourself')]");
		System.out.println();
		System.out.println("************************************  LETS GET STARTED SCREEN ENDS *****************************************");
	}
	
	
	
	public void verifyTellUsAboutYourselfDetails() throws InterruptedException
	{
		
		// To automate dropdown field
		Thread.sleep(3000);
		countryddn.click();
		Thread.sleep(2000);
		//Here tag should be select but it is showing as div  -- for country dropdown, So select syntax won't fit here.
		selectedCountryINDIA.click();
	
		//Select drpcountry = new Select(driver.findElement(By.xpath("//div[@class='css-901oao r-1m72y5m r-ubezar r-16dba41'][contains(.,'Select Country')]")));
		//drpcountry.selectByVisibleText("India");
		System.out.println("India Country Selected");
		Thread.sleep(2000);
		Actions act2 = new Actions(driver);
		act2.moveToElement(saveAndcontinueCTA).click().build().perform();
		Thread.sleep(2000);
		act2.moveToElement(skipthisStepCTA).click().build().perform();
		Thread.sleep(2000);
		act2.moveToElement(allSetCTA).click().build().perform();
		Thread.sleep(2000);
		act2.moveToElement(letsGOCTA_onboardingcompletepopup).click().build().perform();
		Thread.sleep(6000);
		System.out.println();
		System.out.println("*********LETS GET STARTED SCREEN ENDS -> Say Cheeeese -> Choose Your Theme --> Onboarding Complete ENDS*****************");
	}
	
	public void verifyTutorialScreens() throws InterruptedException
	{
		Actions act2 = new Actions(driver);
		act2.moveToElement(tutorialsStarted).click().build().perform();
		Thread.sleep(1000);
		act2.moveToElement(tutorialsStarted).click().build().perform();
		Thread.sleep(1000);
		act2.moveToElement(tutorialsStarted).click().build().perform();
		Thread.sleep(1000);
		act2.moveToElement(tutorialsStarted).click().build().perform();
		Thread.sleep(1000);
		act2.moveToElement(tutorialsStarted).click().build().perform();
		Thread.sleep(1000);
		act2.moveToElement(tutorialsStarted).click().build().perform();
		Thread.sleep(1000);
		act2.moveToElement(tutorialsStarted).click().build().perform();
		Thread.sleep(1000);
		act2.moveToElement(tutorialsSubmitted).click().build().perform();
		Thread.sleep(3000);
		
		
		
		
//		clickButton("/html/body/div[9]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]"); // 1st
//		Thread.sleep(1000);
//		clickButton("/html/body/div[9]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]"); // 2nd
//		Thread.sleep(1000);
//		clickButton("/html/body/div[9]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]"); // 3rd
//		Thread.sleep(1000);
//		clickButton("/html/body/div[9]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]"); // 4th
//		Thread.sleep(1000);
//		clickButton("/html/body/div[9]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]"); // 5th
//		Thread.sleep(1000);
//		clickButton("/html/body/div[9]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]"); // 6th
//		Thread.sleep(1000);
//		clickButton("/html/body/div[9]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]"); // 7th
//		Thread.sleep(2000);
//		clickButton("/html/body/div[9]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]/div"); // Finish  == unable to locate this element
		//Thread.sleep(3000);
		System.out.println();
		System.out.println("*********TUTORIAL ENDS*****************");
		
	}
	
	
	public void verifyOnboardingFlow() throws Throwable
	{
		clickLetsGetStartedCTA();
		verifyTellUsAboutYourselfDetails();
		verifyTutorialScreens();
		
	}
	
	
	
	
	
}
