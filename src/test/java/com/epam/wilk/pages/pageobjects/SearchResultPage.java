package com.epam.wilk.pages.pageobjects;

import com.epam.wilk.pages.locators.SearchResultPageLocators;
import com.epam.wilk.pages.objecthandlers.ElementSupplier;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPage extends BasePage {

    public ElementSupplier<List<WebElement>> FOUND_PRODUCTS_LIST = () -> driver.findElements(SearchResultPageLocators.FOUND_PRODUCTS_LIST_LOCATORS);

    public void verifyFoundProductListCount(Integer expectedProductsCount) {
        assertThat(FOUND_PRODUCTS_LIST.get().size()).isEqualTo(expectedProductsCount);
    }

}
