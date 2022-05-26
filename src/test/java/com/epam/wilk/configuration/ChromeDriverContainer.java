package com.epam.wilk.configuration;

import com.google.inject.Inject;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ChromeDriverContainer {

    @Inject
    private BrowserWebDriverContainer<?> chromeContainer;

    public RemoteWebDriver getDriver() {
        return chromeContainer.getWebDriver();
    }

    public void initContainer() {
        chromeContainer = new BrowserWebDriverContainer<>().withCapabilities(new ChromeOptions());
        chromeContainer.start();
    }

    public void stopContainer() {
        chromeContainer.stop();
    }
}
