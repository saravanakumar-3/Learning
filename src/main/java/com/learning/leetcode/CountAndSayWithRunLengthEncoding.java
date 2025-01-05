package com.learning.leetcode;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class CountAndSayWithRunLengthEncoding {
  public static void main(String[] args) {
    for (int i = 0; i < 1; i++) {
      Instant start = Instant.now();
      System.out.println(countAndSay(30));
      System.out.println(ChronoUnit.MILLIS.between(start, Instant.now()));
    }
  }

  public static String countAndSay(int n) {
    String s = "1";
    for (int i = 1; i < n; i++) {
      s = rle(s);
    }
    return s;
  }

  public static String rle(String s) {
    StringBuilder r = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      int count = 1;
      while (true) {
        int t = i + 1;
        if (t < s.length() && s.charAt(i) == s.charAt(t)) {
          ++count;
          ++i;
        } else {
          break;
        }
      }
      r.append(count).append(s.charAt(i));
    }
    return r.toString();
  }
}
