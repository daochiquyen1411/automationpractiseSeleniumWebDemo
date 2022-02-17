package com.example.miniproject.saucedemo.testdata;

import com.example.miniproject.automationpractise.helper.JsonHelper;
import org.testng.annotations.DataProvider;

public class AccountTestData {

    @DataProvider(name = "AccountTestData")
    public static Object[][] dataTest(){
        return JsonHelper.ReadJsonFromFile("src/test/resources/saucedemo/testdata/account.json");
    }
}
