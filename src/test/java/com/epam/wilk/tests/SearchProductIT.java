package com.epam.wilk.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.VncRecordingContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;
import static org.testcontainers.shaded.org.apache.commons.io.FileUtils.copyFile;

//@ExtendWith(CookieExtension.class)
@Testcontainers
public class SearchProductIT {

    @Container
    public BrowserWebDriverContainer<?> chromeContainer = (BrowserWebDriverContainer<?>) new BrowserWebDriverContainer()
            .withCapabilities(new ChromeOptions());

    @TempDir
    public File vncRecordingDirectory;

    @Test
    void test1() {
        chromeContainer.getVncAddress();
        chromeContainer.withRecordingMode(RECORD_ALL, new File("target/recordings"), VncRecordingContainer.VncRecordingFormat.MP4);
        RemoteWebDriver driver = chromeContainer.getWebDriver();
        driver.get("https://www.saucedemo.com/");
//        driver.manage().addCookie(new Cookie("xid", "dNHwsI4Ue20kvPwveIWF8z4jiG0DDwie", ".demostore.x-cart.com", "/", null));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    void test2() {
        chromeContainer.getVncAddress();
        chromeContainer.withRecordingMode(RECORD_ALL, new File("target"), VncRecordingContainer.VncRecordingFormat.MP4);
        RemoteWebDriver driver = chromeContainer.getWebDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

//    @AfterEach
//    public void temp() throws IOException {
//        copyDirectory(vncRecordingDirectory, new File("target"));
//        System.out.println(123123);
//    }

//    @AfterAll
//    public static void copyDir() throws IOException {
//        copyDirectory(new File("target/recordings"), new File("/Users/tomasz_wilk/Desktop/recordings"));
//    }
//
//    private static void copyDirectory(File sourceDirectory, File destinationDirectory) throws IOException {
//        if (!destinationDirectory.exists()) {
//            destinationDirectory.mkdir();
//        }
//        for (String f : Objects.requireNonNull(sourceDirectory.list())) {
//            copyDirectoryCompatibityMode(new File(sourceDirectory, f), new File(destinationDirectory, f));
//        }
//    }
//
//    public static void copyDirectoryCompatibityMode(File source, File destination) throws IOException {
//        if (source.isDirectory()) {
//            copyDirectory(source, destination);
//        } else {
//            copyFile(source, destination);
//        }
//    }
}
