package com.learning.examples;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.URL;
import java.time.Instant;

import static io.appium.java_client.AppiumBy.androidUIAutomator;

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
        By by =
                androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)");

        String uiScrollables = "new UiScrollable(new UiSelector().scrollable(true))";
        String scrollIntoViews = uiScrollables + ".scrollIntoView(new UiSelector().text(\"DOWNLOAD\"))";
        String uiScrollable = "new UiScrollable(new UiSelector().scrollable(true).instance(0))";
        String scrollIntoView = uiScrollable + ".scrollIntoView(new UiSelector().text(\"DOWNLOAD\").instance(0))";
        System.out.println(Instant.now().getEpochSecond());
        try{
//            wait.until(ExpectedConditions.presenceOfElementLocated(androidUIAutomator(scrollIntoView)));
        } catch (Exception e) {

        }
        System.out.println(Instant.now().getEpochSecond());
        AppiumDriver driver = new AndroidDriver(result, options);
        System.out.println(driver.getStatus());
    }
}
