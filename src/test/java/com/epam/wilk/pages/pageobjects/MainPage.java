package com.epam.wilk.pages.pageobjects;

import com.epam.wilk.pages.locators.MainPageLocators;
import com.epam.wilk.pages.objecthandlers.ElementSupplier;
import com.epam.wilk.pages.objecthandlers.ExecuteCommand;
import com.epam.wilk.pages.objecthandlers.SetValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPage extends BasePage {

    public ElementSupplier<WebElement> MAIN_HEADER_PAGE = () -> driver.findElement(MainPageLocators.MAIN_PAGE_HEADER_LOCATOR);
    public ElementSupplier<WebElement> SIGN_IN_BUTTON = () -> driver.findElement(MainPageLocators.SIGN_IN_BUTTON_LOCATOR);
    public ElementSupplier<WebElement> MY_ACCOUNT_DROPDOWN = () -> driver.findElement(MainPageLocators.MY_ACCOUNT_DROPDOWN_LOCATOR);
    public ElementSupplier<WebElement> SEARCH_INPUT = () -> driver.findElement(MainPageLocators.SEARCH_INPUT_LOCATOR);
    public ElementSupplier<WebElement> SEARCH_SUBMIT = () -> driver.findElement(MainPageLocators.SEARCH_SUBMIT_LOCATOR);

    public ExecuteCommand OPEN_SIGN_IN_MODAL = () -> SIGN_IN_BUTTON.get().click();
    public ExecuteCommand CLICK_SEARCH_INPUT = () -> SEARCH_INPUT.get().click();
    public ExecuteCommand SEARCH_PRODUCT = () -> SEARCH_SUBMIT.get().click();
    public SetValue<String> SET_SEARCH_VALUE = (search) -> SEARCH_INPUT.get().sendKeys(search);

    public void verifyMainPageHeaderIsVisible() {
        assertThat(waitUntilElementAppears(MAIN_HEADER_PAGE).isDisplayed());
    }

    public void verifyMyAccountIsVisible() {
        assertThat(waitUntilElementAppears(MY_ACCOUNT_DROPDOWN).isDisplayed());
    }

    public void selectProductFromDropdown(String product, int productIndex) {
        driver.navigate().refresh();
        CLICK_SEARCH_INPUT.execute();
        SET_SEARCH_VALUE.set(product);
        waitUntilElementIsVisible(By.xpath("(//div[@id='instant_search_menu']//dl)[1]/dt[1]/a")).click();
    }
}