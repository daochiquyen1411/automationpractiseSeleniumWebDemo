package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage extends AutomationPractiseBasePage {

    public AddressesPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnProceedToCheckout = keyword.findElement(By.xpath("//*[@name = 'processAddress']"));

    public ShippingPage proceedToCheckout(){
        keyword.click(btnProceedToCheckout);
        return new ShippingPage(this.driver);
    }
}
