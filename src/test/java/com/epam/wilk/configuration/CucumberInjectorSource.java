package com.epam.wilk.configuration;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;

public class CucumberInjectorSource implements InjectorSource {

    @Override
    public Injector getInjector() {
        return Guice.createInjector(CucumberModules.createScenarioModule(), new ConfigurationModule());
    }
}
