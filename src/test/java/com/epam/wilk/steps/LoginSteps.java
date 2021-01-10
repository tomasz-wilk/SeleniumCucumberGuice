package com.epam.wilk.steps;

import com.epam.wilk.configuration.TestProperties;
import com.epam.wilk.stepsimplementation.LoginStepsImplementation;
import com.epam.wilk.utils.Constants;
import com.epam.wilk.utils.Utils;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Inject
    private TestProperties properties;

    @Inject
    private LoginStepsImplementation loginStepsImplementation;

    @Given("I am logged in to store")
    public void iAmLoggedInToStore() {
        loginStepsImplementation.userLogIn(properties.getDefaultEmail(), properties.getDefaultPassword());
    }

    @When("I fill credentials and submit")
    public void iFillLoginDataAndSubmit() {
        loginStepsImplementation.signIn(properties.getDefaultEmail(), properties.getDefaultPassword());
    }

    @When("I put invalid credentials and submit")
    public void iPutInvalidCredentialsAndSubmit() {
        loginStepsImplementation.signIn(Constants.INVALID_EMAIL, properties.getDefaultPassword());
    }

    @When("I open registration view")
    public void iOpenRegistrationView() {
        loginStepsImplementation.openRegistrationView();
    }

    @When("I fill new account credentials and submit")
    public void iPutNewAccountCredentialsAndSubmit() {
        loginStepsImplementation.register(Utils.getNewEmailAddress(), Constants.PASSWORD, Constants.PASSWORD);
    }

    @When("I open Login page")
    public void iOpenLoginPage() {
        loginStepsImplementation.openSignIn();
    }

    @Then("I am logged in")
    public void iAmLoggedIn() {
        loginStepsImplementation.loggedInSucceeded();
    }

    @Then("I am not logged in")
    public void iAmNotLoggedIn() {
        loginStepsImplementation.loggedInFailed();
    }

    @Then("I got wrong credentials message")
    public void iGotWrongCredentialsMessage() {
        loginStepsImplementation.wrongCredentialsMessageAppeared();
    }

    @Then("new account is created")
    public void newAccountIsCreated() {
        loginStepsImplementation.newAccountIsCreated();
    }
}
