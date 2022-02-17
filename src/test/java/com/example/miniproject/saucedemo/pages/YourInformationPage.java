package com.example.miniproject.saucedemo.pages;

import com.example.miniproject.saucedemo.test.SauceDemoTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourInformationPage extends SauceDemoBasePage {
    public YourInformationPage(WebDriver driver) {
        super(driver);
    }

    private WebElement txtFirstName = keyword.findElement(By.id("first-name"));
    private WebElement txtLastName = keyword.findElement(By.id("last-name"));
    private WebElement txtZipcode = keyword.findElement(By.id("postal-code"));
    private WebElement btnContinue = keyword.findElement(By.id("continue"));


    public void continueOrder(){
        keyword.click(btnContinue);
    }

    public void inputCheckoutInformation(){
        keyword.setText(txtFirstName, "First Name");
        keyword.setText(txtLastName, "Last Name");
        keyword.setText(txtZipcode, "70000");

    }

    public OverViewPage inputInformationAndContinue(){
        inputCheckoutInformation();
        continueOrder();
        return new OverViewPage(this.driver);
    }

    public boolean isDisplayFullElements(){
        if(txtFirstName.isDisplayed() && txtLastName.isDisplayed() && txtZipcode.isDisplayed() && btnContinue.isDisplayed()){
            return true;
        }
        else return false;
    }
}
