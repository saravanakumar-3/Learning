package com.learning.examples;

import java.io.*;
import java.util.stream.IntStream;

public class IntStreamExample {
  public static void main(String[] args) throws IOException {
    System.out.println(IntStream.range(0, 10).count());
  }
}
