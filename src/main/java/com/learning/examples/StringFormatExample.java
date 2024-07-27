package com.learning.examples;

import static java.lang.System.out;

import java.util.UUID;

public class StringFormatExample {
  public static void main(String[] args) {
    String value = UUID.randomUUID().toString().substring(0, 18);
    value = "5f361003-30d1";
    out.println(value);
    out.println(String.format("%-18s", value));
  }
}
