package com.epam.wilk.pages.pageobjects;

import com.epam.wilk.pages.locators.LoginPageLocators;
import com.epam.wilk.pages.objecthandlers.ElementSupplier;
import com.epam.wilk.pages.objecthandlers.ExecuteCommand;
import com.epam.wilk.pages.objecthandlers.SetValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends BasePage {
    private ElementSupplier<WebElement> EMAIL_INPUT = () -> driver.findElement(LoginPageLocators.EMAIL_INPUT_LOCATOR);
    private ElementSupplier<WebElement> PASSWORD_INPUT = () -> driver.findElement(LoginPageLocators.PASSWORD_INPUT_LOCATOR);
    private ElementSupplier<WebElement> SIGN_IN_BUTTON = () -> driver.findElement(LoginPageLocators.SIGN_IN_BUTTON_LOCATOR);
    private ElementSupplier<WebElement> LOGIN_ERROR_MESSAGE = () -> driver.findElement(LoginPageLocators.LOGIN_ERROR_MESSAGE_LOCATOR);

    public ElementSupplier<WebElement> CREATE_NEW_ACCOUNT_BUTTON = () -> driver.findElement(LoginPageLocators.CREATE_NEW_ACCOUNT_LOCATOR);
    public ElementSupplier<WebElement> NEW_EMAIL_INPUT = () -> driver.findElement(LoginPageLocators.NEW_EMAIL_INPUT_LOCATOR);
    public ElementSupplier<WebElement> NEW_PASSWORD_INPUT = () -> driver.findElement(LoginPageLocators.NEW_PASSWORD_INPUT_LOCATOR);
    public ElementSupplier<WebElement> CONFIRM_PASSWORD_INPUT = () -> driver.findElement(LoginPageLocators.CONFIRM_PASSWORD_INPUT_LOCATOR);
    public ElementSupplier<WebElement> CREATE_BUTTON = () -> driver.findElement(LoginPageLocators.CREATE_BUTTON_LOCATOR);

    public SetValue<String> EMAIL = (email) -> waitUntilElementAppears(EMAIL_INPUT).sendKeys(email);
    public SetValue<String> PASSWORD = (password) -> waitUntilElementAppears(PASSWORD_INPUT).sendKeys(password);
    public ExecuteCommand SIGN_IN = () -> SIGN_IN_BUTTON.get().click();

    public SetValue<String> NEW_EMAIL = (email) -> waitUntilElementAppears(NEW_EMAIL_INPUT).sendKeys(email);
    public SetValue<String> NEW_PASSWORD = (password) -> waitUntilElementAppears(NEW_PASSWORD_INPUT).sendKeys(password);
    public SetValue<String> CONF_PASSWORD = (password) -> waitUntilElementAppears(CONFIRM_PASSWORD_INPUT).sendKeys(password);
    public ExecuteCommand OPEN_REGISTRATION = () -> waitUntilElementAppears(CREATE_NEW_ACCOUNT_BUTTON).click();
    public ExecuteCommand CREATE_ACCOUNT = () -> CREATE_BUTTON.get().click();

    public void verifyLoginErrorIsDisplayed() {
        assertThat(waitUntilElementAppears(LOGIN_ERROR_MESSAGE).isDisplayed());
    }

    public void verifySignInButtonIsVisible() {
        assertThat(SIGN_IN_BUTTON.get().isEnabled());
    }

    public void checkSignInHeaderVisible() {
//        var action = new Actions(driver).moveToElement(LOGIN_ERROR_MESSAGE.get()).build();
//        action.perform();
        waitUntilElementIsVisible(LoginPageLocators.LOGIN_HEADER_LOCATOR);
    }

    public void checkSignUpHeaderVisible() {
        waitUntilElementIsVisible(LoginPageLocators.MY_ACCOUNT_HEADER_LOCATOR);
    }
}
