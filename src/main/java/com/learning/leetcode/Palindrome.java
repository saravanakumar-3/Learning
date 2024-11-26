package com.learning.leetcode;

import lombok.SneakyThrows;

public class Palindrome {
  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(isPalindrome2(121));
    System.out.println(isPalindrome2(1221));
    System.out.println(isPalindrome2(0));
    System.out.println(isPalindrome2(1));
    System.out.println(isPalindrome2(-121));
  }

  public static boolean isPalindrome1(int x) {
    boolean isPalindrome = true;
    char[] num = Integer.toString(x).toCharArray();
    int l = num.length;
    for (int i = 0, j = l - 1; i < l / 2 && j >= l / 2; i++, j--) {
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
