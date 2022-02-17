package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPage extends AutomationPractiseBasePage {

    public ShippingPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnProceedToCheckout = keyword.findElement(By.xpath("//*[@name = 'processCarrier']"));
    private WebElement chkAgree = driver.findElement(By.id("cgv"));

    public PaymentPage proceedToCheckout(){
        keyword.click(chkAgree);
        keyword.click(btnProceedToCheckout);
        return new PaymentPage(this.driver);
    }
}
