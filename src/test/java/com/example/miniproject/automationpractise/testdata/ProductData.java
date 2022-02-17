package com.example.miniproject.automationpractise.testdata;

import com.example.miniproject.automationpractise.helper.JsonHelper;
import org.testng.annotations.DataProvider;

public class ProductData {

    @DataProvider(name = "products")
    public static Object[][] productList(){
        return JsonHelper.ReadJsonFromFile("src/test/resources/automationpractise/products.json");
    }
}
