package com.learning.interview;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
  public static void main(String[] args) {
    System.out.println(isPrimeNumber(122));
    System.out.println(isPrimeNumber(7));
    List<Integer> list = getPrimeNumbersUpto(100);
    System.out.println(list);
  }

  private static List<Integer> getPrimeNumbersUpto(int count) {
    List<Integer> list = new ArrayList<>();
    for (int i = 2; i <= count; i++) {
      if (isPrimeNumber(i)) {
        list.add(i);
      }
    }
    return list;
  }

  private static boolean isPrimeNumber(int num) {
    if (num == 1) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
