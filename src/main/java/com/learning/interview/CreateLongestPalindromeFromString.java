package com.learning.interview;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class CreateLongestPalindromeFromString {
  public static void main(String[] args) {
    String input = "ARTYWOPWPTYSA";
    assertThat(getLongestPalindromeFromString(input), is("YWTAPOPATWY"));
  }

  private static String getLongestPalindromeFromString(String input) {
    Map<Character, Integer> map = new HashMap<>();
    // Count each character occurrence
    for (char c : input.toCharArray()) {
      if (map.containsKey(c)) {
        Integer i = map.get(c);
        map.put(c, ++i);
      } else {
        map.put(c, 1);
      }
    }

    System.out.println(map);
    String output = "";
    Character single = null;
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() >= 2) {
        Character key = entry.getKey();
        output = key + output + key;
      } else {
        single = entry.getKey();
      }
    }
    int length = output.length() / 2;
    output = output.substring(0, length) + single + output.substring(length);
    return output;
  }
}
