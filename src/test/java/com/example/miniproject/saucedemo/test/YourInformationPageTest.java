package com.example.miniproject.saucedemo.test;

import com.example.miniproject.saucedemo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YourInformationPageTest extends SauceDemoTestBase {

    @Test
    public void YourInformationPageDisplayTest() throws Exception {
        LoginPage loginPage = new LoginPage(this.driver);
        HomePage homePage = loginPage.loginToSystem(config.getProperty("user"), config.getProperty("user_password"));
        ProductDetailPage productDetailPage = homePage.selectFirstProduct();
        productDetailPage.addProductToCart();
        CartPage cartPage = productDetailPage.navigateToCart();
        YourInformationPage yourInformationPage = cartPage.startCheckout();
        Assert.assertTrue(yourInformationPage.isDisplayFullElements());
    }
}
