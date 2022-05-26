package com.epam.wilk.configuration;

import com.google.inject.AbstractModule;
import com.netflix.governator.lifecycle.LifecycleManager;
import io.cucumber.guice.ScenarioScoped;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;

public class ConfigurationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TestProperties.class).toInstance(ConfigFactory.create(TestProperties.class));
        bind(BrowserWebDriverContainer.class).toInstance(new BrowserWebDriverContainer<>().withCapabilities(new ChromeOptions()));
        bind(ChromeDriverContainer.class).toProvider(ChromeDriverProvider.class).in(ScenarioScoped.class);
//        bind(LifecycleManager.class).toInstance(new LifecycleManager());
    }
}
