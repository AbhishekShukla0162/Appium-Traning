package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContentPage {
	
	public ContentPage(AndroidDriver<AndroidElement> driver)
	{
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Assets']")
	 public WebElement assets;
	
	 
	 
	
}
