package com.learning.leetcode;

import lombok.SneakyThrows;

public class ReverseNumber {
  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(reverse(1534236469));
  }

  public static int reverse(int x) {
    int reversed = 0;
    while (x != 0) {
      reversed = reversed * 10 + x % 10;
      if (reversed < Math.pow(-2, 31) || reversed > (Math.pow(2, 31) - 1)) {
        return 0;
      }
      x = x / 10;
    }
    return reversed;
  }
}
