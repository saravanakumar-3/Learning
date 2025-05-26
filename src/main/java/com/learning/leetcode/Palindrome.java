package com.learning.leetcode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import lombok.SneakyThrows;

public class Palindrome {
  // a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run
  @SneakyThrows
  public static void main(String[] args) {
    assertThat(isPalindrome1(121), is(true));
    assertThat(isPalindrome1(1221), is(true));
    assertThat(isPalindrome1(0), is(true));
    assertThat(isPalindrome1(1), is(true));
    assertThat(isPalindrome1(-121), is(false));
  }

  public static boolean isPalindrome1(int x) {
    boolean isPalindrome = true;
    char[] num = Integer.toString(x).toCharArray();
    int length = num.length;
    for (int i = 0, j = length - 1; i < length / 2 && j >= length / 2; i++, j--) {
      if (num[i] != num[j]) {
        isPalindrome = false;
        break;
      }
    }
    return isPalindrome;
  }

  public static boolean isPalindrome2(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) return false;

    int reversedHalf = 0;
    while (x > reversedHalf) {
      reversedHalf = reversedHalf * 10 + x % 10;
      x /= 10;
    }

    return x == reversedHalf || x == reversedHalf / 10;
  }
}
