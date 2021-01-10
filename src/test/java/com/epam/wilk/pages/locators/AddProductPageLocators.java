package com.epam.wilk.pages.locators;

import org.openqa.selenium.By;

public class AddProductPageLocators {
    public static By ADD_TO_CART_CONFIRMATION_LOCATOR = By.xpath("(//span[text()='You have just added'])[1]");
    public static By CHECKOUT_BUTTON_LOCATOR = By.xpath("//div[@class='item-buttons']//span[text()='Checkout']");
    public static By VIEW_CART_BUTTON_LOCATOR = By.xpath("//div[@class='item-buttons']//span[text()='View cart']");
}
