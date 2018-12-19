package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class ViewPage {
	AndroidDriver<AndroidElement> driver;
	
	
	public ViewPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Expandable Lists']")
	public WebElement expandable_Lists;
	
	@AndroidFindBy( xpath = "//android.widget.TextView[@text = '1. Custom Adapter']")
	public WebElement custom_Adapter;
	
	 @AndroidFindBy( xpath = "//android.widget.TextView[@text = 'People Names']")
	 public WebElement people_Names;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text = 'Drag and Drop']")
	public WebElement dragdrop;
	
	                      //DragAndDrop
	                      @AndroidFindBy(xpath = "//android.view.View[@index = '1']")
	                      public WebElement source;
	                      @AndroidFindBy (xpath = "//android.view.View[@index = '2']")
	                      public WebElement destination;
	                      ///////////
	                      
	                      
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Date Widgets']")
	public WebElement dateWidgets;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = '2. Inline']")
	public WebElement inline;
	
	
	@AndroidFindBy(xpath = "//*[@content-desc = '11']")
	public WebElement contentdesc;
	 
						   //Swap 
						   @AndroidFindBy(xpath = "//*[@content-desc = '15']")
						   public WebElement sourceforswap;
						   
						   @AndroidFindBy(xpath = "//*[@content-desc = '40']")
						   public WebElement destinationforswap;	
						   ////
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Controls']")
	public WebElement controls;
						   
						   
						 	
}
