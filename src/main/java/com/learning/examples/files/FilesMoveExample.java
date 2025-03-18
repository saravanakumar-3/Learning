package com.learning.examples.files;



import java.nio.file.Files;
import java.nio.file.Path;
import lombok.SneakyThrows;

public class FilesMoveExample {
  @SneakyThrows
  public static void main(String[] args) {
    //    System.out.println(
    //        new File("C:\\Users\\sardurai\\Documents\\Temp\\Rate Limitter.xlsx").isFile());
    Files.move(
        Path.of("C:\\Users\\sardurai\\Documents\\Temp\\Rate Limitter.xlsx"),
        Path.of("C:\\Users\\sardurai\\Documents\\Temp\\New folder\\Rate Limitter.xlsx"));
  }
}
