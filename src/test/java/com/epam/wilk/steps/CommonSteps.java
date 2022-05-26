package com.epam.wilk.steps;

import com.epam.wilk.configuration.ChromeDriverContainer;
import com.epam.wilk.configuration.TestProperties;
import com.epam.wilk.stepsimplementation.LoginStepsImplementation;
import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Cookie;

public class CommonSteps {

    @Inject
    private TestProperties properties;

    @Inject
    private ChromeDriverContainer chromeDriverContainer;

    @Inject
    private LoginStepsImplementation loginStepsImplementation;

    @Before(order = 0)
    public void setup() {
        chromeDriverContainer.getDriver().get(properties.getBaseUrl());
    }

    @Before(value = "@predefinedCookie", order = 1)
    public void setCookie() {
        chromeDriverContainer.getDriver().manage().addCookie(new Cookie("xid", "dNHwsI4Ue20kvPwveIWF8z4jiG0DDwie", ".demostore.x-cart.com", "/", null));
    }

    @After
    public void teardown() {
        chromeDriverContainer.getDriver().quit();
        chromeDriverContainer.stopContainer();
    }

    @Given("I am on main page")
    public void iAmOnMainPage() {
        loginStepsImplementation.mainPageIsOpened();
    }
}
