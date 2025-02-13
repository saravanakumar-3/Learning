package com.learning.interview;

public class CapitalizedWordsCount {
  public static void main(String[] args) {
    System.out.println(getCapitalizedWordsCount("I am SaravanaKumar"));
  }

  private static int getCapitalizedWordsCount(String s) {
    int count = 0;
    for (Character c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        count++;
      }
    }
    return count;
  }
}
