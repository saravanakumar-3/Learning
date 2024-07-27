package com.learning.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterExample {
  public static void main(String[] args) {
    System.out.println(DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now()));
    System.out.println(LocalDate.now());
    System.out.println(DateTimeFormatter.ofPattern("yyMMdd").format(LocalDate.now()));
  }
}
