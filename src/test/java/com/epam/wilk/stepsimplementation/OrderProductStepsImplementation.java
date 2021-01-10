package com.epam.wilk.stepsimplementation;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderProductStepsImplementation extends CommonStepsImplementation {
    public void verifyAddProductConfirmationIsVisible() {
        assertThat(addProductPage.waitUntilElementAppears(addProductPage.ADD_TO_CART_CONFIRMATION).isDisplayed());
    }

    public void verifyCheckoutHeaderIsVisible() {
        assertThat(checkoutPage.waitUntilElementAppears(checkoutPage.CHECKOUT_HEADER).isDisplayed());
    }

    public void checkoutProduct() {
        addProductPage.CHECKOUT_PRODUCT.execute();
    }

    public void addToCart() {
        productDetailsPage.ADD_PRODUCT_TO_CART.execute(