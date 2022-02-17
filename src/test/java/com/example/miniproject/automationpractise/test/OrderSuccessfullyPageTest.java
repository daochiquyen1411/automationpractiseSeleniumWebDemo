package com.example.miniproject.automationpractise.test;

import com.example.miniproject.automationpractise.pages.*;
import com.example.miniproject.automationpractise.testdata.ProductData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderSuccessfullyPageTest extends AutomationPractiseTestBase {

    @Test(dataProvider = "products", dataProviderClass = ProductData.class)
    public void shouldOrderSuccessfully(String productName) throws Exception {
        HomePage homePage = new HomePage(this.driver);
        // Normal
//        WomenCategoryPage womenCategoryPage = homePage.navigateToWomenCategory();
//        ProductDetailPage productDetailPage = womenCategoryPage.selectProduct(productName);
//        CartSummaryPage cartSummaryPage = productDetailPage.addProductToCart().proceedToCheckout();
//        AuthenticationPage authenticationPage = cartSummaryPage.proceedToCheckout();
//        CreateAnAccount createAnAccountPage = authenticationPage.createNewEmail();
//        AddressesPage addressesPage = createAnAccountPage.registerNewEmail();
//        ShippingPage shippingPage = addressesPage.proceedToCheckout();
//        PaymentPage paymentPage = shippingPage.proceedToCheckout();
//        OrderSummaryPage orderSummaryPage = paymentPage.checkOut();
//        OrderConfirmationPage orderConfirmationPage = orderSummaryPage.confirmOrder();
        
        String expectedSuccessMessage = "Your order on My Store is complete.";

        // Fluent
        String actualSuccessMessage = homePage.navigateToWomenCategory()
                                                .selectProduct(productName)
                                                .addProductToCart()
                                                .proceedToCheckout()
                                                .proceedToCheckout()
                                                .createNewEmail()
                                                .registerNewEmail()
                                                .proceedToCheckout()
                                                .proceedToCheckout()
                                                .checkOut()
                                                .confirmOrder()
                                                .getSuccessMessage();
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);

    }

}
