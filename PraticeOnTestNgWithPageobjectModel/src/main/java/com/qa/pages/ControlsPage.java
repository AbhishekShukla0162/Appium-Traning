package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ControlsPage {
	
	public ControlsPage(AndroidDriver<AndroidElement>driver)
	
	
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

	@AndroidFindBy(xpath =  "//android.widget.TextView[@text = '1. Light Theme']")
	public WebElement oneLightTheme;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = '2. Dark Theme']")
	public WebElement twoDarkTheme;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = '3. Holo Light Theme']")
	public WebElement threeHoloLightTheme;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = '4. Holo Dark Theme']")
	public WebElement fourthHoloDarkTheme;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = '5. Custom Theme']")
	public WebElement fiveCustomTheme;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = '6. Holo or Old Theme']")
	public WebElement sixHoloorOldTheme;
	
	
}
