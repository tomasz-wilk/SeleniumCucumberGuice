package com.epam.wilk.stepsimplementation;

import com.epam.wilk.pages.pageobjects.AddProductPage;
import com.epam.wilk.pages.pageobjects.CheckoutPage;
import com.epam.wilk.pages.pageobjects.LoginPage;
import com.epam.wilk.pages.pageobjects.MainPage;
import com.epam.wilk.pages.pageobjects.MyAccountPage;
import com.epam.wilk.pages.pageobjects.ProductDetailsPage;
import com.epam.wilk.pages.pageobjects.SearchResultPage;
import com.google.inject.Inject;

public class CommonStepsImplementation {

    @Inject
    protected LoginPage loginPage;

    @Inject
    protected MainPage mainPage;

    @Inject
    protected MyAccountPage myAccountPage;

    @Inject
    protected ProductDetailsPage productDetailsPage;

    @Inject
    protected SearchResultPage searchResultPage;

    @Inject
    protected AddProductPage addProductPage;

    @Inject
    protected CheckoutPage checkoutPage;

    public void mainPageIsOpened() {
        mainPage.verifyMainPageHeaderIsVisible();
    }
}
