package com.example.miniproject.saucedemo.test;

import com.example.miniproject.saucedemo.pages.CartPage;
import com.example.miniproject.saucedemo.pages.HomePage;
import com.example.miniproject.saucedemo.pages.LoginPage;
import com.example.miniproject.saucedemo.pages.ProductDetailPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddToCartPageTest extends SauceDemoTestBase {

    @Test
    public void cannotAddToCartWithProblemUser() throws Exception {
        LoginPage loginPage = new LoginPage(this.driver);
        HomePage homePage = loginPage.loginToSystem(config.getProperty("problem_user"), config.getProperty("user_password"));
        ProductDetailPage productDetailPage = homePage.selectFirstProduct();
        productDetailPage.addProductToCart();
        CartPage cartPage = productDetailPage.navigateToCart();
        Assert.assertEquals(cartPage.getItemsCount(), 0);
    }
}
