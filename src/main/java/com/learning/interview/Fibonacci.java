package com.learning.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
  public static void main(String[] args) {
    List<Integer> fibonacciList = getFibonacci(10);
    System.out.println(Arrays.toString(fibonacciList.toArray()));
  }

  private static List<Integer> getFibonacci(int count) {
    int num1 = 0;
    int num2 = 1;
    List<Integer> l = new ArrayList<>();
    l.add(num1);
    l.add(num2);
    for (int i = 0; i < count - 2; i++) {
      int temp = num1 + num2;
      num1 = num2;
      num2 = temp;
      l.add(temp);
    }
    return l;
  }
}
