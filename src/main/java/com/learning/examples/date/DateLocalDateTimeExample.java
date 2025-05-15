package com.learning.examples.date;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class DateLocalDateTimeExample {
  public static void main(String[] args) {
    OffsetDateTime timeNow = OffsetDateTime.now(ZoneOffset.UTC);
    System.out.println(OffsetDateTime.parse(timeNow.toString()));
  }
}
