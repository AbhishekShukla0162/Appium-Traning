package testng.AppiumWithtestNgMaven;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Paytm  extends AppTest{
	

	@BeforeMethod
	public void B_Paytm() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver =  capabilities();
	}

	
	@Test()
	public void A_test1()
	{
		
		//driver.findElementById("net.one97.paytm:id/btn_language_continue_button").click();
		AndroidElement makeContinue =  driver.findElementByXPath("//android.widget.Button[@text = 'Continue / आगे बढ़े']");
           TouchAction touch = new TouchAction(driver);
           touch.tap(tapOptions().withElement(element(makeContinue))).perform();
           
        driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
   		driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
   		driver.findElementByXPath("//android.widget.Button[@text = 'ALLOW']").click();
		
   		driver.findElementById("net.one97.paytm:id/edit_username").sendKeys("8565009444");
		driver.findElementById("net.one97.paytm:id/edit_password").sendKeys("262961347");
		driver.findElementById("net.one97.paytm:id/lyt_sign_in_button").click();
		
		
	}
	
	
	/* *	start appium  server via code  
	 *  	@BeforeSuite
	    	public void browser() throws IOException, InterruptedException
	{
			Runtime.getRuntime().exec("cmd / c start c :\\ appiumstart.bat");
			Thread.sleep(7000l);
	}*/
	
	
		
	
	
}
