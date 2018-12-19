package testng.AppiumWIthTestNg;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("src");
		File fs = new File(f,"Hybrid App_v1.0_apkpure.com.apk");
		
		
		DesiredCapabilities RequiredCapabilities = new DesiredCapabilities();
		RequiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5 API 27");
		RequiredCapabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath() );
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),RequiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElementByXPath("//android.webkit.WebView[@index = '1']").sendKeys("Abhisek");
	}
	

}
