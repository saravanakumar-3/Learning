package com.learning.examples.files;

import java.io.*;
import lombok.SneakyThrows;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

@Test
public class FileWritingExample {
  @SneakyThrows
  public void fileWriting() {
    String fileName =
        "../Learning/target/NewFile_" + RandomStringUtils.randomAlphabetic(4) + "_.txt";
    FileWriter fileWriter = new FileWriter(fileName);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    bufferedWriter.write("Something to be written");
    bufferedWriter.close();
  }
}
