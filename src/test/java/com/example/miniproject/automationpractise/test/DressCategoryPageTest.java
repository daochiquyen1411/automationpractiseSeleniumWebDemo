package com.example.miniproject.automationpractise.test;

import com.example.miniproject.automationpractise.pages.DressCategoryPage;
import com.example.miniproject.automationpractise.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DressCategoryPageTest extends AutomationPractiseTestBase {
    @Test
    public void shouldDisplaySubCategoriesCorrectly(){
        HomePage homePage = new HomePage(this.driver);
        DressCategoryPage dressCategoryPage = homePage.navigateToDressCategory();
        Assert.assertTrue(dressCategoryPage.isSubCategiesDiplayCorrectly());
    }
}
