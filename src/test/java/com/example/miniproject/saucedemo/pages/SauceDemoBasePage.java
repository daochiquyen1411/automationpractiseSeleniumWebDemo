package com.example.miniproject.saucedemo.pages;

import com.example.miniproject.automationpractise.keyword.WebKeyword;
import org.openqa.selenium.WebDriver;

public class SauceDemoBasePage {
    public WebDriver driver;
    public WebKeyword keyword;

    public SauceDemoBasePage(WebDriver driver){
        this.driver = driver;
        this.keyword = new WebKeyword(driver);
    }

    public CartPage navigateToCart() throws Exception {
        keyword.navigate("https://www.saucedemo.com/cart.html");
        return new CartPage(this.driver);
    }
}
