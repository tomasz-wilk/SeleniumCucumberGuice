package com.epam.wilk.pages.locators;

import org.openqa.selenium.By;

public class MainPageLocators {
    public static By MAIN_PAGE_HEADER_LOCATOR = By.xpath("//h1[text()=\"Welcome to X-Cart Demo Store!\"]");
    public static By SIGN_IN_BUTTON_LOCATOR = By.xpath("//div[@id='header-bar']//span[text()='Sign in / sign up']");
    public static By MY_ACCOUNT_DROPDOWN_LOCATOR = By.xpath("//div[@id='header-area']//div[@class='dropdown header_bar-my_account']/a[text()='My account']");
    public static By SEARCH_INPUT_LOCATOR = By.xpath("//div[@id='search']//input[@name='substring']");
    public static By SEARCH_SUBMIT_LOCATOR = By.xpath("//div[@id='search']//button  ");
}