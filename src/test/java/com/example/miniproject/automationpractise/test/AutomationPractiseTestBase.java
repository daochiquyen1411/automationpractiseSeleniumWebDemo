package com.example.miniproject.automationpractise.test;

import com.example.miniproject.automationpractise.configuration.Configuration;
import com.example.miniproject.automationpractise.driver.DriverFactory;
import com.example.miniproject.automationpractise.keyword.WebKeyword;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AutomationPractiseTestBase {
    public WebDriver driver;
    public WebKeyword keyword;
    public Configuration config;

    @BeforeMethod
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        this.config = new Configuration("src/test/resources/automationpractise/config.properties");
        this.driver = DriverFactory.getDriver(config.getProperty("browser"));
        this.keyword = new WebKeyword(driver);
        keyword.openUrl(config.getProperty("url"));
    }

    @AfterMethod
    public void tearDown(){
        this.driver.quit();
    }
}
