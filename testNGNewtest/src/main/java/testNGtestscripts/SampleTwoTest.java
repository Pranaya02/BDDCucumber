package testNGtestscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTwoTest {
  @Test
  public void cypressSearchTest() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//SoftAssert softassert = new SoftAssert
  }
}
