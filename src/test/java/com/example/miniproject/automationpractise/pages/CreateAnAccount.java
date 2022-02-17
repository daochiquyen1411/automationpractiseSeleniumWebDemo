package com.example.miniproject.automationpractise.pages;

import com.example.miniproject.automationpractise.keyword.SelectType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccount extends AutomationPractiseBasePage {

    public CreateAnAccount(WebDriver driver) {
        super(driver);
    }

    private WebElement radMr = keyword.findElement(By.id("id_gender1"));
    private WebElement txtFirstName = keyword.findElement(By.id("customer_firstname"));
    private WebElement txtLastName = keyword.findElement(By.id("customer_lastname"));
    private WebElement txtPassword = keyword.findElement(By.id("passwd"));

    private WebElement txtAddressFirstName = keyword.findElement(By.id("firstname"));
    private WebElement txtAddressLastName = keyword.findElement(By.id("lastname"));
    private WebElement txtAddress = keyword.findElement(By.id("address1"));
    private WebElement txtCity = keyword.findElement(By.id("city"));
    private WebElement selState = driver.findElement(By.id("id_state"));
    private WebElement txtZipcode = keyword.findElement(By.id("postcode"));
    private WebElement txtMobilePhone = keyword.findElement(By.id("phone_mobile"));

    private WebElement btnRegister = keyword.findElement(By.id("submitAccount"));

    public void inputInformation() throws Exception {
        keyword.click(radMr);
        keyword.setText(txtFirstName, "FirstTest");
        keyword.setText(txtLastName, "LastTest");
        keyword.setText(txtPassword, "thisistestpassword");

        keyword.setText(txtAddressFirstName, "AddressFirstTest");
        keyword.setText(txtAddressLastName, "AddressLastTest");
        keyword.setText(txtAddress, "153 testing address");
        keyword.setText(txtCity, "California");
        keyword.select(selState, SelectType.SELECT_BY_VALUE, "5");
        keyword.setText(txtZipcode, "93504");
        keyword.setText(txtMobilePhone, "232111256");
    }

    public AddressesPage registerNewEmail() throws Exception {
        inputInformation();
        keyword.click(btnRegister);
        return new AddressesPage(this.driver);
    }
}
