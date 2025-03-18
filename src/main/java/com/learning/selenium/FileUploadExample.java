package com.learning.selenium;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.URL;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

// https://www.lambdatest.com/blog/how-to-download-upload-files-using-selenium-with-java/
public class FileUploadExample {
  WebDriver driver = new ChromeDriver();

  // If upload button is with input tag means below code will work
  // https://www.selenium.dev/documentation/webdriver/elements/file_upload/
  // https://www.youtube.com/watch?v=vmwc_TK07SU

  @Test
  public void solution1() {
    String filePath = "C:\\Users\\user\\Downloads\\file.txt";

    WebElement fileUploadBtn = driver.findElement(By.cssSelector("input[type=file]"));
    fileUploadBtn.sendKeys(filePath);
    driver.findElement(By.id("file-submit")).click();
  }

  // If upload button is not with input tag  or any other issue means below code will work
  // Step1 - Copy the file path to the Clipboard
  // Step2 - Paste the path in the file explorer popup and click enter button
  // https://www.youtube.com/watch?v=zOkO9HKB-wE
  @SneakyThrows
  @Test
  public void solution2() {
    // Step1
    String filePath = "C:\\Users\\user\\Downloads\\file.txt";
    StringSelection file = new StringSelection(filePath);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);

    WebElement fileUploadBtn = driver.findElement(By.cssSelector("input[type=file]"));
    fileUploadBtn.click();

    // Step2
    Robot robot = new Robot();
    // press CRTL+V to paste the content from clipboard
    robot.delay(2000);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    // press ENTER
    robot.delay(2000);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyPress(KeyEvent.VK_ENTER);

    driver.findElement(By.id("file-submit")).click();
  }

  // When executing the tests using grid, since file not present in local, it will create issue
  // we need to set the FileDetector
  // This will work when following the solution1, not sure about the solution2
  // https://www.youtube.com/watch?v=vmwc_TK07SU
  @SneakyThrows
  @Test
  public void solution3_ForGridFileUpload() {
    RemoteWebDriver driver1 = new RemoteWebDriver(new URL(""), new ChromeOptions());
    driver1.setFileDetector(new LocalFileDetector());

    // Rest of the step just follow the solution1
  }

  // Using AutoIt tool we can upload a file
  // Idea is to create a executable file with AutoIt command and execute it at runtime to upload file
  @Test
  public void solution4() {}
}
