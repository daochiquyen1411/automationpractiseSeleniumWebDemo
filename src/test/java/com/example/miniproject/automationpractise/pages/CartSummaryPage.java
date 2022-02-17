package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartSummaryPage extends AutomationPractiseBasePage {
    public CartSummaryPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnProcceedToCheckout = keyword.findElement(By.cssSelector(".standard-checkout"));

    public AuthenticationPage proceedToCheckout(){
        keyword.click(btnProcceedToCheckout);
        return new AuthenticationPage(this.driver);
    }
}
