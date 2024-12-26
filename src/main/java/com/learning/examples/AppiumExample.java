package com.learning.examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import lombok.SneakyThrows;

import java.net.URL;

public class AppiumExample {
    @SneakyThrows
    public static void main(String[] args) {
        UiAutomator2Options options = new UiAutomator2Options()
                .amend("udid", "emulator-5554")
                .amend("appPackage", "org.wikipedia.alpha")
                .amend("appActivity", "org.wikipedia.main.MainActivity")
                .amend("platformName", "Android")
                .amend("platformVersion", "10")
                .amend("automationName", "uiautomator2");
//    DesiredCapabilities options = new DesiredCapabilities();
//    options.setCapability("appium:udid", "emulator-5554");
//    options.setCapability("appium:appPackage", "org.wikipedia.alpha");
//    options.setCapability("appium:appActivity", "org.wikipedia.main.MainActivity");
//    options.setCapability("platformName", "Android");
//    options.setCapability("appium:platformVersion", "10");
//    options.setCapability("appium:automationName", "uiautomator2");
        URL result = new URL("http://127.0.0.1:4723");

        AppiumDriver driver = new AndroidDriver(result, options);
        System.out.println(driver.getStatus());
    }
}
