package com.learning.interview.string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ReverseStringWithRecursion {
  public static void main(String[] args) {
    assertThat(reverse("123456"), is("654321"));
    assertThat(reverse("fed cba"), is("abc def"));
  }

  private static String reverse(String s) {
    if (s.length() == 1) {
      return s;
    }
    return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
  }
}
