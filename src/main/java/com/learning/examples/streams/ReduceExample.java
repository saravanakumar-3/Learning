package com.learning.examples.streams;

import java.util.stream.IntStream;

public class ReduceExample {
  public static void main(String[] args) {
    String stringMerged =
        IntStream.range(1, 4)
            .peek(System.out::println)
            .mapToObj(String::valueOf)
            .reduce("", (s, s2) -> s + s2);
    System.out.println("-------------------------------");
    System.out.println(stringMerged);
    System.out.println("-------------------------------");

    int sum = IntStream.range(1, 4).peek(System.out::println).reduce(0, Integer::sum);
    System.out.println("===============================");
    System.out.println(sum);
    System.out.println("===============================");
  }
}
