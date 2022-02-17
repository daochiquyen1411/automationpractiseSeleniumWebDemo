package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class AuthenticationPage extends AutomationPractiseBasePage {

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    private WebElement txtEmail = keyword.findElement(By.id("email_create"));
    private WebElement btnCreate = keyword.findElement(By.id("SubmitCreate"));

    public CreateAnAccount createNewEmail(){
        Random rand = new Random();
        int int_random = rand.nextInt(100);

        keyword.setText(txtEmail, String.format("quangtest%s@testing.com", String.valueOf(int_random)));
        keyword.click(btnCreate);
        return new CreateAnAccount(this.driver);
    }
}
