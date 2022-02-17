package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends AutomationPractiseBasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnAddToCart = keyword.findElement(By.cssSelector("#add_to_cart span"));

    public ProductDetailPage addProductToCart(){
        keyword.click(btnAddToCart);
        return this;
    }

    public CartSummaryPage proceedToCheckout(){
        keyword.click(keyword.findElement(By.xpath("//*[@title= 'Proceed to checkout']")));
        return new CartSummaryPage(this.driver);
    }

}
