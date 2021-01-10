package com.epam.wilk.pages.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
    // Login view
    public static By EMAIL_INPUT_LOCATOR = By.id("login-email");
    public static By PASSWORD_INPUT_LOCATOR = By.id("login-password");
    public static By SIGN_IN_BUTTON_LOCATOR = By.xpath("//button/span[text()='Sign in']");
    public static By LOGIN_ERROR_MESSAGE_LOCATOR = By.xpath("//table[@class='login-form']//div[text()='Invalid login or password. ']");

    // Registration view
    public static By CREATE_NEW_ACCOUNT_LOCATOR = By.xpath("//table[@class='login-form']//a[text()[contains(.,'Create new account')]]");
    public static By NEW_EMAIL_INPUT_LOCATOR = By.id("login");
    public static By NEW_PASSWORD_INPUT_LOCATOR = By.id("password");
    public static By CONFIRM_PASSWORD_INPUT_LOCATOR = By.id("password-conf");
    public static By CREATE_BUTTON_LOCATOR = By.xpath("//button/span[text()='Create']");

}
