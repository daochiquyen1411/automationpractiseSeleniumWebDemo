package com.example.miniproject.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends SauceDemoBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement inventory = keyword.findElement(By.className("inventory_list"));
    private List<WebElement> productList = inventory.findElements(By.className("inventory_item"));

    public ProductDetailPage selectFirstProduct(){
        keyword.click(productList.get(0).findElement(By.className("inventory_item_name")));
        return new ProductDetailPage(this.driver);
    }

}
