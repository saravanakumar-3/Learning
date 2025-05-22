package com.learning.examples.streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
  public static void main(String[] args) {
    List<String> s1 = List.of("1", "2");
    List<String> s2 = List.of("3", "4");
    List<List<String>> s3 = List.of(s1, s2);

    List<String> collect = s3.stream().flatMap(Collection::stream).collect(Collectors.toList());
    System.out.println(s3);
    System.out.println(collect);
  }
}
