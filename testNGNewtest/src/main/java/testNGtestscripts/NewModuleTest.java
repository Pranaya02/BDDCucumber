package testNGtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewModuleTest {
  @Test
  public void Moduletest() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement schBox = driver.findElement(By.name("q"));
}
  
}
