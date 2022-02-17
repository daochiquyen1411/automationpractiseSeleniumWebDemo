package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends AutomationPractiseBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement tabBestSeller = keyword.findElement(By.className("blockbestsellers"));
    //private WebElement ulBestSeller = keyword.findElement(By.id("blockbestsellers"));
    //private List<WebElement> productLst = ulBestSeller.findElements(By.className("product-image-container"));
    private WebElement tabDresses = keyword.findElement(By.xpath("//*[contains(@class, 'menu-content')]/li/a[@title= 'Dresses']"));
    private WebElement tabWomen= keyword.findElement(By.xpath("//*[contains(@class, 'menu-content')]/li/a[@title= 'Women']"));

    public int getBestSellerProductListCount(){
        keyword.click(tabBestSeller);
        WebElement ulBestSeller = keyword.findElement(By.id("blockbestsellers"));
        List<WebElement> productLst = ulBestSeller.findElements(By.className("product-image-container"));

        return productLst.size();
    }

    public DressCategoryPage navigateToDressCategory(){
        keyword.click(tabDresses);
        return new DressCategoryPage(this.driver);
    }

    public WomenCategoryPage navigateToWomenCategory(){
        keyword.click(tabWomen);
        return new WomenCategoryPage(this.driver);
    }

}
