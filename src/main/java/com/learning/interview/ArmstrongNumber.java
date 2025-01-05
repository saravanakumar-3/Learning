package com.learning.interview;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
  public static void main(String[] args) {
    System.out.println(isArmstrongNumber(153));
    assertThat(isArmstrongNumber(153), is(true));
    assertThat(isArmstrongNumber(1531), is(false));
    assertThat(isArmstrongNumber(371), is(true));
  }

  private static boolean isArmstrongNumber(int num) {
    List<Integer> digits = getNumberAsDigits(num);
    int pow = digits.size();
    int total = 0;
    for (Integer digit : digits) {
      total = (int) (total + Math.pow(digit, pow));
    }
    return total == num;
  }

  private static List<Integer> getNumberAsDigits(int num) {
    List<Integer> list = new ArrayList<>();
    while (num > 0) {
      list.add(num % 10);
      num = num / 10;
    }
    return list;
  }
}
