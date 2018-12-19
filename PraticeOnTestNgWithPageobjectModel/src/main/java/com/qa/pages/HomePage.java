package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public HomePage(AndroidDriver<AndroidElement> driver)

	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Accessibility']")
	public WebElement accessibility;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Animation']")
	public WebElement animation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'App']")
	public WebElement app;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Views']")
	public WebElement views;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Content']")
	public WebElement content;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Graphics']")
	public WebElement graphics;
}
