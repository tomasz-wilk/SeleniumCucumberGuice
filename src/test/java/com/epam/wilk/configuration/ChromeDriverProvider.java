package com.epam.wilk.configuration;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ChromeDriverProvider implements Provider<RemoteWebDriver> {

    @Inject
    BrowserWebDriverContainer<?> chromeContainer;

    public RemoteWebDriver get() {
        chromeContainer.start();
        return chromeContainer.getWebDriver();
    }

    // how to do chromeContainer.stop();
}
