package com.epam.wilk.configuration;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:common.properties")
public interface TestProperties extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("email")
    String getDefaultEmail();

    @Key("password")
    String getDefaultPassword();
}
