package com.epam.wilk.configuration;

import com.google.inject.Provider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverProvider implements Provider<WebDriver> {
    public WebDriver get() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
        var driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
