package com.learning.examples.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

@Test
public class FileReadingExample {
  @SneakyThrows
  public void fileReading() {
    URL resource = this.getClass().getResource("/templates/PaymentMessage.txt");
    File file = new File(resource.getPath());

    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    StringBuilder contents = new StringBuilder();
    String line;
    while ((line = bufferedReader.readLine()) != null) {
      contents.append(line);
    }
    bufferedReader.close();

    System.out.println("------------------Below are the file contents------------------");
    System.out.println(contents);
    System.out.println("---------------------------------------------------------------");
  }
}
