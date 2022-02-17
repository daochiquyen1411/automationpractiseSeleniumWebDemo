package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderSummaryPage extends AutomationPractiseBasePage {
    public OrderSummaryPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnConfirmOrder = keyword.findElement(By.xpath("//*[@id = 'cart_navigation']//button[@type = 'submit']"));

    public OrderConfirmationPage confirmOrder(){
        keyword.click(btnConfirmOrder);
        return new OrderConfirmationPage(this.driver);
    }
}
