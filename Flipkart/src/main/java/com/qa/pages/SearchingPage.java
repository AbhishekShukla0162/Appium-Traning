package com.qa.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchingPage {
    public SearchingPage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'What are you looking for?']")
    private WebElement clickForSearch;

    public SearchingPage getclickForSearch() {
        clickForSearch.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'What are you looking for?']")
    private WebElement searching;

    public SearchingPage getsearching() {
        searching.sendKeys("Men");
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'men jeans']")
    private WebElement cloth;
    public PdpPage AddclothOnPDP(){
        cloth.click();
        return new PdpPage(driver);
    }
}

