package com.epam.wilk.pages.pageobjects;

import com.epam.wilk.pages.locators.AddProductPageLocators;
import com.epam.wilk.pages.objecthandlers.ElementSupplier;
import com.epam.wilk.pages.objecthandlers.ExecuteCommand;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class AddProductPage extends BasePage {
    public ElementSupplier<WebElement> ADD_TO_CART_CONFIRMATION = () -> driver.findElement(AddProductPageLocators.ADD_TO_CART_CONFIRMATION_LOCATOR);
    public ElementSupplier<WebElement> VIEW_CART_BUTTON = () -> driver.findElement(AddProductPageLocators.VIEW_CART_BUTTON_LOCATOR);
    public ElementSupplier<WebElement> CHECKOUT_BUTTON = () -> driver.findElement(AddProductPageLocators.CHECKOUT_BUTTON_LOCATOR);

    public ExecuteCommand VIEW_CART = () -> waitUntilElementAppears(VIEW_CART_BUTTON).click();
    public ExecuteCommand CHECKOUT_PRODUCT = () -> waitUntilElementAppears(CHECKOUT_BUTTON).click();
}
