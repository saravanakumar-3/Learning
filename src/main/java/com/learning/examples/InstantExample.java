package com.learning.examples;

import static java.time.format.DateTimeFormatter.ofPattern;

import java.io.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class InstantExample {
  public static void main(String[] args) {
    Instant time = Instant.now();
    System.out.println(time);
    System.out.println(
        ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZone(ZoneId.from(ZoneOffset.UTC)).format(time));
    System.out.println(ofPattern("yyyyMMddHHmmss").withZone(ZoneId.from(ZoneOffset.UTC)).format(time));
  }
}
