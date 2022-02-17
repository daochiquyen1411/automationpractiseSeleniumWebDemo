package com.example.miniproject.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverViewPage extends SauceDemoBasePage {

    public OverViewPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnFinish = keyword.findElement(By.id("finish"));

    public CompletePage finishCheckout(){
        keyword.click(this.btnFinish);
        return new CompletePage(this.driver);
    }
}
