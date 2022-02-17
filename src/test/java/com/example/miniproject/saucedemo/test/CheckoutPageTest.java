package com.example.miniproject.saucedemo.test;

import com.example.miniproject.saucedemo.pages.*;
import com.example.miniproject.saucedemo.testdata.AccountTestData;
import org.junit.Assert;
import org.testng.annotations.Test;

public class CheckoutPageTest extends SauceDemoTestBase {

    @Test(dataProvider = "AccountTestData", dataProviderClass = AccountTestData.class)
    public void CheckoutSuccessfullyTest(String username, String password) throws Exception {
        LoginPage loginPage = new LoginPage(this.driver);
        HomePage homePage = loginPage.loginToSystem(username, password);
        ProductDetailPage productDetailPage = homePage.selectFirstProduct();
        productDetailPage.addProductToCart();
        CartPage cartPage = productDetailPage.navigateToCart();
        YourInformationPage yourInformationPage = cartPage.startCheckout();
        OverViewPage overViewPage = yourInformationPage.inputInformationAndContinue();
        CompletePage completePage = overViewPage.finishCheckout();
        Assert.assertTrue(completePage.isSuccessHeaderDisplay());
    }
}
