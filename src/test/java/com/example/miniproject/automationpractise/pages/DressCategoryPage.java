package com.example.miniproject.automationpractise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class DressCategoryPage extends AutomationPractiseBasePage {
    public DressCategoryPage(WebDriver driver) {
        super(driver);
    }

    private WebElement subCategories = keyword.findElement(By.id("subcategories"));
    private List<WebElement> subcategoriesName = subCategories.findElements(By.className("subcategory-name"));

    public boolean isSubCategiesDiplayCorrectly(){
        List<String> categories = new ArrayList<>();
        categories.add("CASUAL DRESSES");
        categories.add("EVENING DRESSES");
        categories.add("SUMMER DRESSES");

        boolean result = false;
        for(int i = 0; i < subcategoriesName.size(); i++){
            String text = subcategoriesName.get(i).getText();
            if(categories.contains(subcategoriesName.get(i).getText())){
                result = true;
            }
            else result = false;
        }
        return result;
    }


}
