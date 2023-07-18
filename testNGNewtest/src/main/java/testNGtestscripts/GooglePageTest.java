package testNGtestscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GooglePageTest {
  @Test
  public void javaSearchTest() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");
		schBox.submit();
		AssertJUnit.assertEquals(driver.getTitle() , "Java Tutorial - Google search");
		
  }
  
  
  public void SeleniumSearchTtest() {
  
 
  WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement schBox = driver.findElement(By.name("q"));
	schBox.sendKeys("Selenium Tutorial");
	schBox.submit();
	AssertJUnit.assertEquals(driver.getTitle() , "Selenium Tutorial - Google search");
	
  }
  
  public void appiumSearchTtest() {
	  
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Appium Tutorial");
		schBox.submit();
		AssertJUnit.assertEquals(driver.getTitle() , "Appium Tutorial - Google search");
		
	  }
  
}
  

