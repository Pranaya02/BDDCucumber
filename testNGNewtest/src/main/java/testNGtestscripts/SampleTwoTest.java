package testNGtestscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testNGtestscripts.Retrytest.RetryTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTwoTest {
@Test(retryAnalyzer = RetryTest.class)
  
  public void cypressSearchTest () {

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");

	 SoftAssert softAssert = new SoftAssert () ;
      softAssert.assertEquals (driver. getTitle(),"Google");
     WebElement schBox = driver.findElement (By. name ("g" ));
      schBox.sendKeys ("Cypress Tutorial");
      schBox.submit () ;
      softAssert.assertEquals(driver.getTitle(),"Cypress Tutorial - GO");
     softAssert.assertAll();
     driver.close();
     }
	  
}	  
  

