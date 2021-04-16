package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
	
	
	WebDriver driver;
	String nodeurl;
	@Test
	public void testgrid() {
		
		try {
			nodeurl="http://192.168.0.20:20750/wd/hub";
			DesiredCapabilities capabilities=DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver= new RemoteWebDriver(new URL(nodeurl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			
			
			
		} 
		
		catch (MalformedURLException e) {
		
			e.printStackTrace();
		}
		

	}

		
		
	}

