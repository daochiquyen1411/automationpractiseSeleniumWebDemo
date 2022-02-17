package com.example.miniproject.automationpractise.test;

import com.example.miniproject.automationpractise.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends AutomationPractiseTestBase {

    @Test
    public void shouldDisplay7ProductsInBestSellerBlock(){
        HomePage homePage = new HomePage(this.driver);
        Assert.assertEquals(homePage.getBestSellerProductListCount(), 7);
    }

}
