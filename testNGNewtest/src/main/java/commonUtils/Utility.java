package commonUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Utility {
	public static String getScreenshotPath(WebDriver driver) {
		TakesScreenshot screen = (TakesScreenshot)driver;
		File scr = screen.getScreenshotAs(OutputType.FILE);
		String srcFile = System.getProperty("user.dir")
				+"/screenshots"
				+System.currentTimeMillis()
				+ ".png";
		File dest = new  File(srcFile);
		try {
			FileUtils.copyFile(scr , dest);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return srcFile;
		}
		
  }

