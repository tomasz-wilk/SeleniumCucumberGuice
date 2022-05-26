package com.epam.wilk.configuration;

import com.google.inject.Provider;

public class ChromeDriverProvider implements Provider<ChromeDriverContainer> {

    public ChromeDriverContainer get() {
        var container = new ChromeDriverContainer();
        container.initContainer();
        return container;
    }
}
