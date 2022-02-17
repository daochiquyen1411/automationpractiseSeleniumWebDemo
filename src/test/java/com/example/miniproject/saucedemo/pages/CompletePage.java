package com.example.miniproject.saucedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage extends SauceDemoBasePage {
    public CompletePage(WebDriver driver) {
        super(driver);
    }

    public WebElement successHeader = keyword.findElement(By.className("complete-header"));

    public boolean isSuccessHeaderDisplay(){
        return successHeader.isDisplayed();
    }
}
