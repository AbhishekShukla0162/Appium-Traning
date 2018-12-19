package com.qa.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePage {
    public HomePage(AppiumDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    AndroidDriver<AndroidElement> driver;



    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index = '0']/android.widget.TextView[@index = '5']")
    private WebElement login;
    public HomePage getLogin() {
        login.click();
        return this;
    }
    @AndroidFindBy(xpath = "//TextInputLayout[@text ='Email']")
    private WebElement email;
    public HomePage getEmail() {
        email.sendKeys("erabhishek262@gmail.com");
        return this;
    }
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index = '1']/android.widget.LinearLayout[@index = '0']/android.widget.RelativeLayout[@index = '3']/TextInputLayout[@index = '0']")
    private WebElement Password;
    public HomePage getPassword() {
        Password.sendKeys("262961347");
        return this;
    }
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index = '1']/android.widget.LinearLayout[@index = '0']/android.widget.TextView[@index = '5']")
    private WebElement loginTwo;
    public SearchingPage getLoginTwo() {
        loginTwo.click();
        return new SearchingPage(driver);
    }


    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'ALLOW']")
    private WebElement allowOne;
    public HomePage getallowOne(){
        allowOne.click();
        return this;
    }

   // @AndroidFindBy(id = "com.flipkart.android:id/btn_skip")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index = '0']/android.widget.RelativeLayout[@index = '0']/android.widget.ImageButton[@index = '1']")
    private WebElement cancle;
    public HomePage getcancle(){
        cancle.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'Existing User? SIGN IN']")

    private  WebElement already;
    public HomePage getalready(){
        already.click();
        return this ;
    }


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText[@text = 'Mobile No.']"),
            @AndroidBy(id = "com.flipkart.android:id/mobileNo"),
            @AndroidBy(xpath = "//android.widget.LinearLayout[@index = '0']/android.widget.FrameLayout[@index = '0']" +
                    "/android.widget.LinearLayout[@index = '0']/android.widget.LinearLayout[@index = '2']")


    })
    private WebElement mobileno;
    public HomePage sendMobileNo() {
        mobileno.sendKeys("8565009444");
        return this;

    }
    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'SIGN UP']")
    public WebElement signup;

    public HomePage clickSignUpButton() {
        signup.click();
        return this;
    }


    @AndroidFindBy(id = "com.flipkart.android:id/et_password")
    private WebElement password;
    public HomePage sendMobilePassword() {
        password.sendKeys("262961347");
        return this;
    }



    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'SIGN IN']")
    public WebElement signin;
    public void clickOnSignInButton()
    {
        signin.click();
    }
}







