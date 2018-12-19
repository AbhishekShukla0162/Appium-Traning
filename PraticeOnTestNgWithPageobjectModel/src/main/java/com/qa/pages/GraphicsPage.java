package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GraphicsPage {
	
	public GraphicsPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(uiAutomator  = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"OpenGL ES\")); ")
	public WebElement openGLES;
	
	@AndroidFindBy(xpath =  "//android.widget.TextView[@text = 'Sprite Text']")
	public WebElement sprite;

}
