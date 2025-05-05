package com.learning.interview;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ReverseStringWithRecursion {
  public static void main(String[] args) {
    assertThat(reverseString("123456"), is("654321"));
    assertThat(reverseString("fed cba"), is("abc def"));
  }

  private static String reverseString(String s) {
    if (s.length() == 1) {
      return s;
    }
    return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
  }
}
