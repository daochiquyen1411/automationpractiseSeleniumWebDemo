package com.example.miniproject.saucedemo.pages;

import com.example.miniproject.saucedemo.test.SauceDemoTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends SauceDemoBasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnAddToCart = keyword.findElement(By.xpath("//*[contains(@class,'btn_inventory')]"));

    public void addProductToCart(){
        keyword.click(btnAddToCart);
    }
}
