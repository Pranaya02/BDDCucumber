package testNGtestscripts;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class LoginTest {
  
  WebDriver driver;
  public void setup() {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  
  public void validLogin(String strUser, String strPassword)
  
  {
	
	//driver.get(prop.getProperty("url"));
	driver.get("http://the-internet.herokuapp.com/login");
	driver.findElement(By.id("username")).sendKeys(strUser);
	driver.findElement(By.id("password")).sendKeys(strPassword);
	driver.findElement(By.className("radius")).click();
	boolean isValidUser = driver.findElement(By.cssSelector("div.flash success")).isDisplayed();
	AssertJUnit.assertTrue(isValidUser);
  }
	
	@DataProvider (name="loginData")

			public Object[][] getData() throws CsvValidationException, IOException{

			String path =System.getProperty("user.dir") +
                 "//src//test//resources//datafiles//userData.csv";

			CSVReader reader = new CSVReader (new FileReader (path));
			String cols[];
			ArrayList<Object> dataList = new ArrayList<Object> ();
			while((cols=reader.readNext ()) != null) {
			Object record[] = {cols [0], cols [1]};
			dataList.add(record);
			}
			return dataList.toArray(new Object [dataList.size()][1]) ;
  }

  
	
	 public void teardown() {
		  driver.close();
	  }
	  
  }

