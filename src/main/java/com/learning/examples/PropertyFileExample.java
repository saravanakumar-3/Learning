package com.learning.examples;

import java.util.Properties;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

@Test
public class PropertyFileExample {
  @SneakyThrows
  public void readPropertyFiles() {
    Properties properties = new Properties();
    properties.load(this.getClass().getResourceAsStream("/config.properties"));

    System.out.println(properties.get("name"));
    System.out.println(properties.get("name.new"));
    System.out.println(properties.get("country"));
  }
}
