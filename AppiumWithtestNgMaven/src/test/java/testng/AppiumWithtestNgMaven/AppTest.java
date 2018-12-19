package testng.AppiumWithtestNgMaven;


import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

 
public class AppTest {

	public static AndroidDriver<AndroidElement> driver; 
	
	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		File f = new File("src");
		File fs = new File(f,"net.one97.paytm_2018-11-02.apk");
		
		
		DesiredCapabilities RequiredCapabilities = new DesiredCapabilities();
		RequiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		RequiredCapabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath() );
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),RequiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	    
	    
	   	}
	
}
