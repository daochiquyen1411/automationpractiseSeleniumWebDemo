package com.example.miniproject.saucedemo.pages;

import com.example.miniproject.automationpractise.keyword.WebKeyword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends SauceDemoBasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement txtUsername = keyword.findElement(By.id("user-name"));
    private WebElement txtPassword = keyword.findElement(By.id("password"));
    private WebElement btnLogin = keyword.findElement(By.id("login-button"));

    public HomePage loginToSystem(String username, String password){
        keyword.setText(txtUsername, username);
        keyword.setText(txtPassword, password);
        keyword.click(btnLogin);
        return new HomePage(this.driver);
    }

    public LoginPage login(String username, String password){
        keyword.setText(txtUsername, username);
        keyword.setText(txtPassword, password);
        keyword.click(btnLogin);
        return this;
    }

    public String getErrorMessageText(){
        return keyword.findElement(By.xpath("//*[@data-test = 'error']")).getText();
    }

}
