package com.qa.test;

import java.net.MalformedURLException;

import com.qa.appbase.BaseClassFlipkart;

import org.testng.annotations.Test;
import com.qa.pages.HomePage;
import com.qa.pages.PDP;
import com.qa.pages.ProductListPage;
import com.qa.pages.SignInPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class HomeTest extends BaseClassFlipkart {

	SignInPage signup;
	HomePage home;
	ProductListPage productList;
	PDP productDetailPage;

	@Test
	public void test1() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities();

		System.out.println("Hello");

		signup = new SignInPage(driver);
		signup.sendMobileNo("8565009444");
		signup.clickSignUpButton();
		signup.sendMobilePassword("262961347");
		signup.clickOnSignInButton();
		System.out.println(driver.getContext());

		home = new HomePage(driver);
		Thread.sleep(3000);
		home.searchingPage.click();

		home.searchproduct.sendKeys("Mackbook air");
		Thread.sleep(5000);
		home.mackbook.click();
		home.notnow.click();

		productList = new ProductListPage(driver);

		String productName = productList.getProductTittle().substring(0, 68);
		System.out.println("product Name = " + productName);

		String productpriceAmount = productList.getProductPrice().replaceFirst("₹", "").trim();
		System.out.println("Product Price = " + productpriceAmount);

		String Assured = productList.getAsured();
		System.out.println("Assured = " + Assured);

		String productRating = productList.getRating();
		System.out.println("Product Rating = " + productRating);

		String offerOfproduct = productList.getOffer();
		System.out.println("offer = " + offerOfproduct);

		// 11,870 ratings
		// (11,873)

		productList.productTittle.click();
		productDetailPage = new PDP(driver);

		String PDPProductName = productDetailPage.getPDPproductTitle().substring(0, 68);
		System.out.println("PDP Product Name = " + PDPProductName);

		String productPriceOfPDP = productDetailPage.getPDPproductprice().replaceFirst("₹", "").trim();
		System.out.println("PDP Product Price = " + productPriceOfPDP);

		String PDPAssured = productDetailPage.getPDPAssured();
		System.out.println("PDPAssured = " + PDPAssured);

		String PDPProductrating = productDetailPage.getPDPproductRating();
		System.out.println("PDP Product Rating = " + PDPProductrating);

		String PDPProductoffer = productDetailPage.getPDPOffer();
		System.out.println("PDP Offer = " + PDPProductoffer);

		 Assert.assertEquals(PDPProductName, productName, "Product Title is Match");
		 Assert.assertEquals(productPriceOfPDP, productpriceAmount, "Product price isMatch");
		 Assert.assertEquals(PDPProductrating, productRating, "Product Rating isMatch");
		 Assert.assertEquals(PDPProductoffer, offerOfproduct, "Product Offer Is match ");
		Thread.sleep(4000);

		productDetailPage.addtokart.click();

		productDetailPage.increaseQuantity.click();
		Thread.sleep(2000);
		productDetailPage.increaseQuantityByTwo.click();
		productDetailPage.saveForLater.click();
		productDetailPage.remove.click();
		productDetailPage.continueRemove.click();
		productDetailPage.shopnow.click();
	}
	
	}

	