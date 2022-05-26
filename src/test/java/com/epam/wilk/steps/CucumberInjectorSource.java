package com.epam.wilk.steps;

import com.epam.wilk.configuration.ConfigurationModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.netflix.governator.guice.LifecycleInjector;
import com.netflix.governator.lifecycle.LifecycleManager;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberInjectorSource implements InjectorSource {

//    private LifecycleManager manager;

    @Override
    public Injector getInjector() {
//        var injector = LifecycleInjector.builder().withModules(CucumberModules.createScenarioModule(), new ConfigurationModule()).createInjector();
//        injector.injectMembers(this);
        var injector = Guice.createInjector(CucumberModules.createScenarioModule(), new ConfigurationModule());
//        manager = injector.getInstance(LifecycleManager.class);
//        try {
//            manager.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return injector;
    }

//    @AfterAll
//    void teardown() {
//        manager.close();
//    }
}
