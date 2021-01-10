package com.epam.wilk.pages.pageobjects;

import com.epam.wilk.pages.locators.ProductDetailsPageLocators;
import com.epam.wilk.pages.objecthandlers.ElementSupplier;
import com.epam.wilk.pages.objecthandlers.ExecuteCommand;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductDetailsPage extends BasePage {

    public ElementSupplier<WebElement> PRODUCT_HEADER = () -> driver.findElement(ProductDetailsPageLocators.PRODUCT_DETAILS_HEADER_LOCATOR);
    public ElementSupplier<WebElement> ADD_TO_CART_BUTTON = () -> driver.findElement(ProductDetailsPageLocators.ADD_TO_CART_LOCATOR);

    public ExecuteCommand ADD_PRODUCT_TO_CART = () -> ADD_TO_CART_BUTTON.get().click();

    public void verifyProductHeaderIsVisible() {
        assertThat(waitUntilElementAppears(PRODUCT_HEADER).isDisplayed());
    }
}
