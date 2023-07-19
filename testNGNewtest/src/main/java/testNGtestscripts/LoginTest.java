package testNGtestscripts;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

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

  
	
	 public void teardown() {
		  driver.close();
	  }
	  
  }

