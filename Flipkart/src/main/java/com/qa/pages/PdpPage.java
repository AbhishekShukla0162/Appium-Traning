package com.qa.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PdpPage {

    public PdpPage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Pack Of 3 Jeans For Men By Stylox')]")
    private WebElement title;

    public PdpPage gettitle() {
        title.getText();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '₹1199')]")
    private WebElement price;

    public PdpPage getprice() {
        price.getText();
        return this;
    }



    @AndroidFindAll({

            @AndroidBy(id = "com.shopclues:id/img_product_image")

    })
    private  WebElement add;
    public PDV_Page getadd(){
        add.click();
        return new PDV_Page(driver);
    }




}