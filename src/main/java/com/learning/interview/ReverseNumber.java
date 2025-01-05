package com.learning.interview;

public class ReverseNumber {
  public static void main(String[] args) {
    System.out.println(reverseNumber(1234));
    System.out.println(reverseNumber(1));
    System.out.println(reverseNumber(0));
    System.out.println(reverseNumber(1002));
  }

  private static int reverseNumber(int num) {
    int result = 0;
    while (num > 0) {
      result = result * 10 + num % 10;
      num = num / 10;
    }
    return result;
  }
}
