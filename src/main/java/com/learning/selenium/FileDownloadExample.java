package com.learning.selenium;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownloadExample {

  // https://www.youtube.com/watch?v=ZaOCQJdcuic
  // https://www.youtube.com/watch?v=vmwc_TK07SU
  // https://peter.sh/experiments/chromium-command-line-switches/
  // Step1 - Click download button
  // Step2 - Verify whether file present in downloads
  @Test
  public void solution1() {
    Map<String, Object> prefs = new HashMap<>();
    prefs.put("download.prompt_for_download", false);

    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setExperimentalOption("prefs", prefs);

    WebDriver driver = new ChromeDriver(chromeOptions);
    driver.findElement(By.xpath("download button"));

    File file = new File("C:\\Users\\sardurai\\Downloads\\DownloadedFileName.txt");
    Awaitility.await().atMost(Duration.ofSeconds(10)).until(file::exists);
  }
}
