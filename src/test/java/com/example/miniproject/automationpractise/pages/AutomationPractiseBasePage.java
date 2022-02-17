package com.example.miniproject.automationpractise.pages;

import com.example.miniproject.automationpractise.configuration.Configuration;
import com.example.miniproject.automationpractise.keyword.WebKeyword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPractiseBasePage {
    public WebDriver driver;
    public WebKeyword keyword;

    public AutomationPractiseBasePage(WebDriver driver){
        this.driver = driver;
        this.keyword = new WebKeyword(driver);
    }


}
