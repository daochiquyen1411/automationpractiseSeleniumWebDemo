package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends AutomationPractiseBasePage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    private WebElement lnkBankWire = keyword.findElement(By.className("bankwire"));

    public OrderSummaryPage checkOut(){
        keyword.click(lnkBankWire);
        return new OrderSummaryPage(this.driver);
    }
}
