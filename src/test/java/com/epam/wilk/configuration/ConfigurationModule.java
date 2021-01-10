package com.epam.wilk.configuration;

import com.google.inject.AbstractModule;
import io.cucumber.guice.ScenarioScoped;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

public class ConfigurationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TestProperties.class).toInstance(ConfigFactory.create(TestProperties.class));
        bind(WebDriver.class).toProvider(ChromeDriverProvider.class).in(ScenarioScoped.class);
    }
}
