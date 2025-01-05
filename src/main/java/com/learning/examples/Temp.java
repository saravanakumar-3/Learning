package com.learning.examples;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp {
  @SneakyThrows
  public static void main(String[] args) {
    char x = '2';
    int xx = x;
    System.out.println(x);
    System.out.println(xx);
    List<List<String>> result = new ArrayList<>();
    List<char[]> list = List.of("sddd".toCharArray());
  }

  private static void removeElement(int[] nums) {
    nums[2] = 1111;
  }
}
