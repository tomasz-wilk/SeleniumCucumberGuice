package com.epam.wilk.steps;

import com.epam.wilk.stepsimplementation.SearchProductStepsImplementation;
import com.google.inject.Inject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {

    public static final String SEARCH_PRODUCT = "watch";

    @Inject
    private SearchProductStepsImplementation searchProductStepsImplementation;

    @When("I select first product from Search dropdown")
    public void iSelectProductFromSearchDropdown() throws InterruptedException {
        searchProductStepsImplementation.selectProductFromDropdown(SEARCH_PRODUCT, 1);
    }

    @When("I search for {string}")
    public void iSearchForProduct(String searchPhrase) {
        searchProductStepsImplementation.searchFor(searchPhrase);
    }

    @Then("There are {int} available products")
    public void thereAreAvailableProducts(Integer availableProducts) {
        searchProductStepsImplementation.availableProducts(availableProducts);
    }

    @Then("there are no found products")
    public void thereAreNoFoundProducts() {
        searchProductStepsImplementation.availableProducts(0);
    }
}
