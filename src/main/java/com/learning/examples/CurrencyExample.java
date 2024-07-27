package com.learning.examples;

import java.io.*;
import java.util.Currency;

public class CurrencyExample {
  public static void main(String[] args) throws IOException {
    System.out.println(Currency.getInstance("GBP").getNumericCodeAsString());
  }
}
