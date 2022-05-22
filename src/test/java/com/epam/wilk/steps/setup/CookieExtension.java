package com.epam.wilk.steps.setup;

import com.epam.wilk.configuration.ChromeDriverProvider;
import com.epam.wilk.configuration.TestProperties;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

// not used in full framework
// sandbox
public class CookieExtension implements BeforeEachCallback, AfterEachCallback {

    private WebDriver webDriver;
//
//    @Inject
//    private TestProperties properties;

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
        System.out.println("before each");
        webDriver = new ChromeDriverProvider().get();
        var properties = ConfigFactory.create(TestProperties.class);
        webDriver.get(properties.getBaseUrl());
        webDriver.manage().addCookie(new Cookie("xid", "dNHwsI4Ue20kvPwveIWF8z4jiG0DDwie", ".demostore.x-cart.com", "/", null));
        webDriver.navigate().refresh();
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws InterruptedException {
        webDriver.quit();
        System.out.println("after each");
    }
}
