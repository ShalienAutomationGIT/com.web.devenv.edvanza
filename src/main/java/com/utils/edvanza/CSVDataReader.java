package com.utils.edvanza;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base.edvanza.BasePage;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVDataReader extends BasePage {

	
	public void readData()
	{
	//Read CSv File
	
	CSVReader reader = null;
	try {
		
		reader = new CSVReader(new FileReader(CONFIG.getProperty("Signup_EmailFlow_CSV")));
		
		String[] Celldata = reader.readNext();  // Saving cell data into string
		
		while ((Celldata = reader.readNext())!=null) {
			
			String Keyword = Celldata[0];
			
			
		}
		
		
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
	
	
	public void readcsvdata() throws CsvValidationException, IOException
	{
		//Provide CSV file path. It Is In D: Drive.
		 String CSV_PATH="C:\\Users\\skaushik\\Desktop\\CSVFiles\\SignEmailFlow.csv";
	

		  CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
		  String [] csvCell;
		  //while loop will be executed till the last line In CSV.
		  while ((csvCell = reader.readNext()) != null) {   
		   String FName = csvCell[0];
		   String LName = csvCell[1];
		   String Email = csvCell[2];
		   String Mob = csvCell[3];
		   String company = csvCell[4];
		  
		   driver.switchTo().alert().accept();
		  }  
		 }
	}
	
	

