package com.epam.wilk.pages.pageobjects;

import com.epam.wilk.pages.locators.MainPageLocators;
import com.epam.wilk.pages.locators.MyAccountPageLocators;
import com.epam.wilk.pages.objecthandlers.ElementSupplier;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class MyAccountPage extends BasePage {
    public ElementSupplier<WebElement> MY_ACCOUNT_HEADER = () -> chromeDriverContainer.getDriver().findElement(MyAccountPageLocators.MY_ACCOUNT_HEADER_LOCATOR);

    public void verifyMyAccountHeaderIsVisible() {
        assertThat(waitUntilElementAppears(MY_ACCOUNT_HEADER).isDisplayed());
    }
}
