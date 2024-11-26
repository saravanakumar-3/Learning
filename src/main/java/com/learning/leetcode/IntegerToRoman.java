package com.learning.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.SneakyThrows;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class IntegerToRoman {
  @SneakyThrows
  public static void main(String[] args) {
    assertThat(intToRoman(3749), is("MMMDCCXLIX"));
    assertThat(intToRoman(58), is("LVIII"));
    assertThat(intToRoman(1994), is("MCMXCIV"));

    assertThat(intToRomanSolution(3749), is("MMMDCCXLIX"));
    assertThat(intToRomanSolution(58), is("LVIII"));
    assertThat(intToRomanSolution(1994), is("MCMXCIV"));
  }

  public static String intToRoman(int num) {
    char[] chars = String.valueOf(num).toCharArray();
    StringBuilder roman = new StringBuilder();
    for (int i = 0; i < chars.length; i++) {
      int n = Integer.parseInt(String.valueOf(chars[i]));
      double pow = Math.pow(10, chars.length - (i + 1));
      if (n != 4 && n != 9) {
        n = (int) (n * pow);
        while (n != 0) {
          if (n >= 1000) {
            roman.append("M");
            n = n - 1000;
          } else if (n >= 500) {
            roman.append("D");
            n = n - 500;
          } else if (n >= 100) {
            roman.append("C");
            n = n - 100;
          } else if (n >= 50) {
            roman.append("L");
            n = n - 50;
          } else if (n >= 10) {
            roman.append("X");
            n = n - 10;
          } else if (n >= 5) {
            roman.append("V");
            n = n - 5;
          } else if (n >= 1) {
            roman.append("I");
            n = n - 1;
          }
        }
      } else {
        n = (int) (n * pow);
        if (n == 400 || n == 900) {
          roman.append(n == 400 ? "CD" : "CM");
        } else if (n == 40 || n == 90) {
          roman.append(n == 40 ? "XL" : "XC");
        } else if (n == 4 || n == 9) {
          roman.append(n == 4 ? "IV" : "IX");
        }
      }
    }
    return roman.toString();
  }
  public static String intToRomanSolution(int num) {
    final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < values.length; ++i) {
      if (num == 0)
        break;
      while (num >= values[i]) {
        sb.append(symbols[i]);
        num -= values[i];
      }
    }

    return sb.toString();
  }
}
