package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenCategoryPage extends AutomationPractiseBasePage {

    public WomenCategoryPage(WebDriver driver) {
        super(driver);
    }

    public ProductDetailPage selectProduct(String productName){
        String xpath = String.format("//a[@title = '%s' and @class = 'product-name']", productName);
        keyword.click(keyword.findElement(By.xpath(xpath)));
        return new ProductDetailPage(this.driver);
    }
}
