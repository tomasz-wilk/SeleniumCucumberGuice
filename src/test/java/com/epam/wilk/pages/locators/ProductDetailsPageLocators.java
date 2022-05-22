package com.epam.wilk.pages.locators;

import org.openqa.selenium.By;

public class ProductDetailsPageLocators {
    public static By PRODUCT_DETAILS_HEADER_LOCATOR = By.xpath("//div[@class='product-details-info']//h2");
    public static By ADD_TO_CART_LOCATOR = By.xpath("(//button/span[text()='Add to cart'])[1]");
}
