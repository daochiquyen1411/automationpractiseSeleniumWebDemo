package com.example.miniproject.saucedemo.test;

import com.example.miniproject.saucedemo.pages.LoginPage;
import com.example.miniproject.saucedemo.testdata.AccountTestData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends SauceDemoTestBase {

    @Test
    public void loginUnsuccessfullyTest() throws IOException {
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.login(config.getProperty("login_unsucessfully_user"), config.getProperty("user_password"));
        String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
        String actualErrorMessage = loginPage.getErrorMessageText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
}
