package com.learning.leetcode;

import lombok.SneakyThrows;

import java.util.HashSet;
import java.util.Set;

public class StringToInteger_Atoi {
  @SneakyThrows
  public static void main(String[] args) {
    Set<Character> set = new HashSet();
    set.iterator().next();
    System.out.println(myAtoi("9223372036854775808"));
  }

  public static int myAtoi(String s) {
    s = s.trim();
    boolean isPositive = true;
    if (!s.isEmpty()) {
      char firstChar = s.charAt(0);
      if (firstChar == '+' || firstChar == '-') {
        isPositive = firstChar != '-';
        s = s.substring(1);
      }
    } else {
      return 0;
    }
    double value = 0;
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        value = value * 10 + Character.getNumericValue(c);
      } else {
        break;
      }
    }
    if (!isPositive) {
      value = value * -1;
    }
    double lowerLimit = -2147483648;
    if (value < lowerLimit) {
      return (int) lowerLimit;
    }
    double upperLimit = 2147483647;
    if (value > upperLimit) {
      return (int) upperLimit;
    }
    return (int) value;
  }
}
