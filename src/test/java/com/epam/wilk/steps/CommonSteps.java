package com.epam.wilk.steps;

import com.epam.wilk.configuration.TestProperties;
import com.epam.wilk.stepsimplementation.LoginStepsImplementation;
import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonSteps {

    @Inject
    private TestProperties properties;

    @Inject
    private WebDriver webDriver;

    @Inject
    private LoginStepsImplementation loginStepsImplementation;

    @Before
    public void setup() {
        webDriver.get(properties.getBaseUrl());
    }

    @After
    public void teardown() {
        webDriver.quit();
    }

    @Given("I am on main page")
    public void iAmOnMainPage() {
        loginStepsImplementation.mainPageIsOpened();
    }
}
