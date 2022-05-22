package com.epam.wilk.configuration;

import com.google.inject.Provider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverProvider implements Provider<WebDriver> {
    public WebDriver get() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
        var options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        var driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }
}
