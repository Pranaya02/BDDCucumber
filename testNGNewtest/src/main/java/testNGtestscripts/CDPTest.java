package testNGtestscripts;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.google.common.graph.Network;

import io.netty.handler.codec.base64.Base64;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v112.emulation.Emulation;
import org.openqa.selenium.devtools.v112.network.model.Headers;


public class CDPTest {
	ChromeDriver driver;
	DevTools devtools;
	
  @Test
  public void setup() {
	  driver = new ChromeDriver();
	  devtools= driver.getDevTools();
	  devtools.createSession();
	  
  }
  public void deviceModeTest(){
	  Map deviceMetrics = new HashMap() {{
		  
		  put("Width" , 600);
		  put("height" , 1000);
		  put("deviceScaleFactor" , 50);
		  put("mobile" , true);
	  }};
	  driver.executeCdpCommand("Emulation.setDeviceMetricOverride",deviceMetrics);
      driver.get("https://www.selenium.dev/");
}
  
  /**
 * 
 */
  
  @Test
  
public void geoLocTest(){
	  
	  devtools.send(Emulation.setGeolocationOverride(
			  Optional.of(33.748997),
			  Optional.of(-119.417931),
			  Optional.of(100))
			  );
		driver.get("https://oldnavy.gap.com/stores") ;
       }
			
  public void basicAuthTest () {

	  devtools.send(Network.enable(Optional.empty (), Optional.empty (), Optional.empty()));

	  Map<String, Object> headers = new HashMap<> ();

	  String strUser ="admin";
      String strPwd = "admin";
	  
    String basicAuth = "Basic" +new String(new Base64().encode(

	  String.format ("%s:%s", strUser, strPwd).getBytes()));

	  System.out.println("Auth . ... + "+basicAuth) ;

	  //Set Header - Auth Token 
	  headers.put ("Authorization", basicAuth);
	  
     devtools.send(Network.setExtraHTTPHeaders(new Headers (headers) ));
   
	  driver.get("http://the-internet.herokuapp.com/basic_auth");

	  String strMsg = driver.findElement(By.cssSelector ("div.example p")).getText();

	  Assert.assertEquaLs(strMsg ,"Congratulations! You must have the proper Credential.");
			  
			  
			  
	  }
	  }

