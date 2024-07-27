package com.learning;

import com.learning.examples.LoggingExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

  public static void main(String[] args) {
    SpringApplication.run(LearningApplication.class, args);
    LoggingExample.logging();
  }
}
