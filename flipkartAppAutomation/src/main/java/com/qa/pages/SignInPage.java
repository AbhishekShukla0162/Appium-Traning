package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInPage
{
	public SignInPage(AndroidDriver<AndroidElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Mobile No.']")
	public WebElement mobileno;
	
	public void sendMobileNo(String phoneNumber) {
		mobileno.sendKeys(phoneNumber);
     }

		
	@AndroidFindBy(id = "com.flipkart.android:id/et_password")
	public WebElement password;
	
	public void sendMobilePassword(String passwordsignup) {
		password.sendKeys(passwordsignup);
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'SIGN UP']")
	public WebElement signup;
	
	public void clickSignUpButton() {
		signup.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'SIGN IN']")
	public WebElement signin;
	
	
	public void clickOnSignInButton() 
	{	
			signin.click();		
	}	
}

