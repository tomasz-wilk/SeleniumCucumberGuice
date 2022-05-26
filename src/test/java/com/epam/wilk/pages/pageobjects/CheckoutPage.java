package com.epam.wilk.pages.pageobjects;

import com.epam.wilk.pages.locators.CheckoutPageLocators;
import com.epam.wilk.pages.objecthandlers.ElementSupplier;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    public ElementSupplier<WebElement> CHECKOUT_HEADER = () -> chromeDriverContainer.getDriver().findElement(CheckoutPageLocators.CHECKOUT_HEADER_LOCATOR);
}
