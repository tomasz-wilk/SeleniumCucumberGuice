package com.epam.wilk.pages.pageobjects;

import com.epam.wilk.pages.objecthandlers.ElementSupplier;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    @Inject
    protected RemoteWebDriver driver;

    public boolean isElementVisible(ElementSupplier<WebElement> elementSupplier) {
        return elementSupplier.get().isDisplayed();
    }

    public WebElement waitUntilElementAppears(ElementSupplier<WebElement> elementSupplier) {
        var wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        return wait.until(webDriver -> elementSupplier.get());
    }

    public WebElement waitUntilElementIsEnabled(ElementSupplier<WebElement> elementSupplier) {
        var wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(elementSupplier.get()));
    }

    public WebElement waitUntilElementIsVisible(By locator) {
        var wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
