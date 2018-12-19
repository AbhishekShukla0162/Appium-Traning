package com.qa.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PDV_Page {
    public PDV_Page(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index = '0']/android.widget.LinearLayout[@index = '1']" +
            "/android.widget.RelativeLayout[@index = '0']/android.widget.ImageView[@index = '0']")
    private WebElement addtoBag;
    public PDV_Page getaddItemtoBag(){
        addtoBag.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = '32']")
    private  WebElement addBySize;
    public PDV_Page getSelectSize(){
        addBySize.click();
        return this;
    }
    @AndroidFindBy(id = "com.shopclues:id/action_cart")
    private WebElement goToBagPage;
    public BagPage getgoToBagPage(){
        goToBagPage.click();
        return new BagPage(driver);
    }



}
