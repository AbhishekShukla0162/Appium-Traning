package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductListPage {
	
	
		public ProductListPage(AndroidDriver<AndroidElement> driver) 
		{
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	    
		
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@text, 'Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra) MQD32HN/A A1466')]")
		public WebElement productTittle;
		
		public String getProductTittle() {
			
			return productTittle.getText();
		}
		
		
		@AndroidFindBy(xpath = "//android.view.ViewGroup[@index =  '0']/android.widget.TextView[@index = '6']")
		public WebElement productPrice;
		
		public String getProductPrice()
		{
			return productPrice.getText();
		}
		
		@AndroidFindBy(xpath  = "//android.view.ViewGroup[@index = '0']/android.widget.ImageView[@index = '5']")
		public WebElement assured;
		public String getAsured()
		{
			return assured.getText();
		}
		
	   @AndroidFindBy(xpath = "//android.view.ViewGroup[@index =  '3']/android.widget.TextView[@index = '0']")
		public WebElement rating;
		
		public String getRating()
		{
			return rating.getText();
		}
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@index = '8']")
		public WebElement offer;
		public String getOffer()
		{
			return offer.getText();
		}
	    
}
