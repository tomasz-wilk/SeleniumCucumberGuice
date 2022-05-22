package com.epam.wilk.steps;

import com.epam.wilk.stepsimplementation.OrderProductStepsImplementation;
import com.google.inject.Inject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderProductSteps {

    @Inject
    private OrderProductStepsImplementation orderProductStepsImplementation;

    @When("I add product to the cart")
    public void iAddProductToTheCart() {
        orderProductStepsImplementation.addToCart();
    }

    @When("I checkout the product")
    public void iCheckoutTheProduct() {
        orderProductStepsImplementation.checkoutProduct();
    }

    @Then("product is successfully added to the cart")
    public void productIsAddedToCart() {
        orderProductStepsImplementation.verifyAddProductConfirmationIsVisible();
    }

    @Then("I am navigated to payment page")
    public void iAmNavigatedToPaymentPage() {
        orderProductStepsImplementation.verifyCheckoutHeaderIsVisible();
    }
}
