package com.qa.test;

import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import com.qa.appbase.BaseClassApiDemo;
import com.qa.pages.AccessibilityPage;
import com.qa.pages.AnimationPage;
import com.qa.pages.AppPage;
import com.qa.pages.ContentPage;
import com.qa.pages.ControlsPage;
import com.qa.pages.GraphicsPage;
import com.qa.pages.HomePage;
import com.qa.pages.ViewPage;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class HomeTest extends BaseClassApiDemo {

	HomePage Home;
	AccessibilityPage accessibility;
	AnimationPage animation;
	AppPage app;
	ViewPage views;
	ContentPage content;
	GraphicsPage graphic;
	ControlsPage control;

	@Test
	public void Test1() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();

		Home = new HomePage(driver);

		Home.accessibility.click();
		accessibility = new AccessibilityPage(driver);
		accessibility.accessibility_Node_Provider.click();
		driver.navigate().back();
		driver.navigate().back();

		Home.animation.click();
		animation = new AnimationPage(driver);

		animation.bouncing_Balls.click();
		driver.navigate().back();
		driver.navigate().back();

		Home.app.click();
		app = new AppPage(driver);
		app.voice_Recognition.click();
		driver.navigate().back();
		driver.navigate().back();

		Home.views.click();
		views = new ViewPage(driver);
		views.expandable_Lists.click();
		views.custom_Adapter.click();
		TouchAction touch = new TouchAction(driver);
		touch.longPress(longPressOptions().withElement(element(views.people_Names)).withDuration(ofSeconds(2)))
				.release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		Home.content.click();
		content = new ContentPage(driver);
		content.assets.click();
		driver.navigate().back();
		driver.navigate().back();

		Home.views.click();
		views.dragdrop.click();
		touch.longPress(longPressOptions().withElement(element(views.source))).moveTo(element(views.destination))
				.release().perform();
		driver.navigate().back();
		driver.navigate().back();

		Home.views.click();
		views.dateWidgets.click();
		views.inline.click();
		views.contentdesc.click();
		touch.longPress(longPressOptions().withElement(element(views.sourceforswap)))
				.moveTo(element(views.destinationforswap)).release().perform();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		Home.graphics.click();
		graphic = new GraphicsPage(driver);
		graphic.openGLES.click();
		graphic.sprite.click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		Home = new HomePage(driver);
		Home.views.click();
		views = new ViewPage(driver);
		views.controls.click();
		control = new ControlsPage(driver);
		control.oneLightTheme.click();
		driver.navigate().back();
		driver.navigate().back();
		control.twoDarkTheme.click();
		driver.navigate().back();
		driver.navigate().back();
		control.threeHoloLightTheme.click();
		driver.navigate().back();
		driver.navigate().back();
		control.fourthHoloDarkTheme.click();
		driver.navigate().back();
		driver.navigate().back();
		control.fiveCustomTheme.click();
		driver.navigate().back();
		driver.navigate().back();
		control.sixHoloorOldTheme.click();

	}
}
