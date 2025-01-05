package com.learning.interview;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ReverseString {
  public static void main(String[] args) {
    String reverse = reverse("12345");
    assertThat(reverse, is("54321"));
  }

  private static String reverse(String s) {
    StringBuilder r = new StringBuilder();
    char[] charArray = s.toCharArray();
    for (int i = charArray.length - 1; i >= 0; i--) {
      r.append(charArray[i]);
    }
    return r.toString();
  }
}
