package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;


public class Utils {
	
	public static AppiumDriver<WebElement> driver;
	
	public static void acessarApp()throws MalformedURLException,InterruptedException{
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName","Android");
		desiredCapabilities.setCapability("deviceName","SM J700M");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");	
	    desiredCapabilities.setCapability("appPackage", "com.google.android.youtube");
	    desiredCapabilities.setCapability("appActivity", "com.google.android.youtube.HomeActivity");
	
	    driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS );
	}
	    	
}
