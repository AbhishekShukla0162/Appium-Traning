package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PDP {
	public PDP(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra) MQD32HN/A A1...more')]")
	public WebElement PDPproductTitle;

	public String getPDPproductTitle() {
		return PDPproductTitle.getText();
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@index = '2']/android.widget.TextView[@index = '0']")
	public WebElement PDPproductprice;

	public String getPDPproductprice() {
		return PDPproductprice.getText();
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@index = '1']/android.widget.ImageView[@index = '2']")
	public WebElement PDPAssured;

	public String getPDPAssured() {
		return PDPAssured.getText();
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@index = '1']/android.view.ViewGroup[@index =  '0']")
	public WebElement PDPproductRating;

	public String getPDPproductRating() {
		return PDPproductRating.getText();
	}

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@index = '2']/android.widget.TextView[@index = '2']")
	public WebElement PDPoffer;

	public String getPDPOffer() {
		return PDPoffer.getText();
	}

	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.TextView[@text = 'GO TO CART')]"),
			@AndroidBy(xpath = "//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@text='GO TO CART']"),
			@AndroidBy(xpath = "//android.widget.TextView[@text = 'ADD TO CART')]") })

	public WebElement addtokart;

	@AndroidFindBy(xpath = "//android.view.View[@index = '0']/android.view.View[@index = '5']")
	public WebElement increaseQuantity;

	@AndroidFindBy(xpath = "//android.view.View[@index = '0']/android.view.View[@index = '5']/android.widget.ListView[@index = '3']/android.view.View[@index = '1']")
	public WebElement increaseQuantityByTwo;

	@AndroidFindBy(xpath = "//android.view.View[@index = '8']/android.view.View[@text = 'Save for later']")
	public WebElement saveForLater;

	@AndroidFindBy(xpath = "//android.view.View[@index = '8']/android.view.View[@text = 'Remove']")
	public WebElement remove;

	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'REMOVE']")
	public WebElement continueRemove;

	@AndroidFindBy(xpath = "//android.view.View[@text = 'SHOP NOW']")
	public WebElement shopnow;

	// agile
	// git
	// confluence

	// waterfallmodel
	// sdlc
	// srs
	// software testing type

	// version 1
	//

}