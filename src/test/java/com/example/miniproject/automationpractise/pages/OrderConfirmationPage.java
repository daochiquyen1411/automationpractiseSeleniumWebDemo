package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPage extends AutomationPractiseBasePage {

    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }

    private WebElement lblSuccessMessage = keyword.findElement(By.cssSelector(".cheque-indent strong"));

    public String getSuccessMessage(){
        return lblSuccessMessage.getText();
    }
}
