package com.tests.edvanza;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.edvanza.BasePage;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import com.pages.edvanza.MarketingPage;
import com.pages.edvanza.RegisterPage;
import com.pages.edvanza.SignUpEmailFlow;


public class SignupEnd2EndTest extends BasePage {
	
	
	@Test
	public void testSignupEnd2End() throws Throwable {
		
		
		String csv_file = "C:\\Users\\skaushik\\Desktop\\CSVFiles\\SignEmailFlow.csv";
		
		CSVReader reader = new CSVReader(new FileReader(csv_file));
		String[] cell;
		
		while((cell=reader.readNext())!=null) {
			
			for(int i=0; i<1; i++)
			{
				String emailaddress1=cell[i];
				String fName = cell[i+1];
				String lName = cell[i+2];
				
				SignUpEmailFlow SEF = PageFactory.initElements(driver, SignUpEmailFlow.class);
				
				//SEF.enterSignupemaildetails(emailaddress1, fName, lName);
				
			}
			
		}
		
		
		
	}
	
	
//	@Test(description = "SignUpEmailFlow", priority = 1)
//	public void testSignupEnd2End() throws Throwable
//	{
//		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
//		DataReader dataReader = new DataReader();		
//				
//		String filepath = System.getProperty("user.dir")+ CONFIG.getProperty("Signup_EmailFlow_CSV");
//		System.out.println(filepath);
//		list = dataReader.mapread(filepath);		
//		
//		SignUpEndtoEndFlow SEF = PageFactory.initElements(driver, SignUpEndtoEndFlow.class);
//		
//		StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
//		StackTraceElement e1 = stacktrace[1];
//		String methodName = e1.getMethodName();
//		
//		for (Map<String, String> map : list) {
//			String testCase = map.get("test_case");
//
//			if (testCase.equals(methodName)) {
//
//				Thread.sleep(2000);
//					
//				String emailAddress1 = map.get("emailaddress");
//				String fName = map.get("firstName");				
//				String lName = map.get("lastName");
//				
//				try {
//			
//					SEF.verifyMarketingPages();
//					SEF.enterSignupemaildetails(emailAddress1, fName, lName);
//					
//		
//			
//		
//		
//					}catch(Exception e)
//							{
//							e.printStackTrace();
//							System.out.println(e);
//							}
//		
//					}
//					}
//	}
}
	
	



