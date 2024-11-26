package com.learning.leetcode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import lombok.SneakyThrows;

import java.util.Map;

public class RomanToInt {
  @SneakyThrows
  public static void main(String[] args) {
    assertThat(romanToInt("III"), is(3));
  }

  public static int romanToInt(String s) {
    Map<String, Integer> map =
        new java.util.HashMap<>(
            Map.of(
                "M", 1000, "CM", 900, "D", 500, "CD", 400, "C", 100, "XC", 90, "L", 50, "XL", 40,
                "X", 10, "IX", 9));
    map.put("V", 5);
    map.put("IV", 4);
    map.put("I", 1);
    int number = 0;
    for (int i = 0; i < s.length(); i++) {
      String c = String.valueOf(s.charAt(i));
      if (i + 1 < s.length()) {
        String subString = c + s.charAt(i + 1);
        if (map.containsKey(subString)) {
          number = number + map.get(subString);
          i++;
        } else {
          number = number + map.get(c);
        }
      } else {
        number = number + map.get(c);
      }
    }
    return number;
  }
}
