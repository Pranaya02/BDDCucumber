package testNGtestscripts;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import org.testng.AssertJUnit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


@Test
public class GooglePageTest {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	@BeforeTest
	public void setupExtent() {
		extentReports = new ExtentReports();
		spark = new ExtentSparkReporter("test-output/SparkReport.html");
		extentReports.attachReporter(spark);
		
	}	
	
	//@Parameters("browser")
	@BeforeMethod
	public void setup(String strBrowser) {
		if (strBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (strBrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		
	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	

	
  public void javaSearchTest() {
	  
	  extentTest = extentReports.createTest("Java Search Test");
	  
	  //WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Java Tutorial");
		schBox.submit();
		AssertJUnit.assertEquals(driver.getTitle() , "Java Tutorial - Google search");
		
  }
  
  @Test
  public void SeleniumSearchTtest() {
  
	  extentTest = extentReports.createTest("Selenium Search Test");
  //WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement schBox = driver.findElement(By.name("q"));
	schBox.sendKeys("Selenium Tutorial");
	schBox.submit();
	AssertJUnit.assertEquals(driver.getTitle() , "Selenium Tutorial - Google search");
	
  }
  
  @Test
  public void appiumSearchTtest() {
	  
	  extentTest = extentReports.createTest("Appium Search Test");
	 // WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
		schBox.sendKeys("Appium Tutorial");
		schBox.submit();
		AssertJUnit.assertEquals(driver.getTitle() , "Appium Tutorial - Google search");
		
	  }
  @AfterTest
  public void finishExtent() {
	  extentReports.flush();
	  
  }
  
  
  public void  generateReport(ITestResult result) {
	  if(result.getStatus()== ITestResult.FAILURE) {
		Assert.fail(result.getThrowable().getMessage());
		
	  }
  
  
  
//  @AfterMethod
//  public void teardown() {
	  driver.close();
  }
}
  
  

  

