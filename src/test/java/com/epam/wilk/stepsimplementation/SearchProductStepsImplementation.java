package com.epam.wilk.stepsimplementation;

public class SearchProductStepsImplementation extends CommonStepsImplementation {

    public void selectProductFromDropdown(String searchProduct, int productIndex) {
        mainPage.selectProductFromDropdown(searchProduct, productIndex);
        productDetailsPage.verifyProductHeaderIsVisible();
    }

    public void searchFor(String searchPhrase) {
        mainPage.SET_SEARCH_VALUE.set(searchPhrase);
        mainPage.SEARCH_PRODUCT.execute();
    }

    public void availableProducts(Integer availableProducts) {
        searchResultPage.verifyFoundProductListCount(availableProducts);
    }
}
