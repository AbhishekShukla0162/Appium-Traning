package com.qa.test;
import java.net.MalformedURLException;
import com.qa.app.BaseClass;
import com.qa.pages.PDV_Page;
import com.qa.pages.PdpPage;
import com.qa.pages.SearchingPage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import com.qa.pages.HomePage;
import io.appium.java_client.android.AndroidElement;

public class FlipkartTest extends BaseClass {
    @Test
    public void test1() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        System.out.println("App launch");
        HomePage home = new HomePage(driver);
        SearchingPage search = new SearchingPage(driver);
        search.getclickForSearch()
                .getsearching()
                .AddclothOnPDP();

        PdpPage pdp = new PdpPage(driver);
        pdp.gettitle()
                .getprice()
                .getadd();
        PDV_Page pdv = new PDV_Page(driver);
        pdv.getaddItemtoBag()
                .getSelectSize()
                .getgoToBagPage();
    }
}
