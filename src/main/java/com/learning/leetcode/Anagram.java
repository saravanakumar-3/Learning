package com.learning.leetcode;

import com.learning.examples.model.A;
import lombok.SneakyThrows;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class Anagram {
  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(isAnagram("abc", "cab"));
    System.out.println(isAnagram("abc", "cbbcacccacaba"));
    System.out.println(isAnagram("abcx", "cbb"));
  }

  private static boolean isAnagram(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    Arrays.sort(c1);
    char[] c2 = s2.toCharArray();
    Arrays.sort(c2);
    return Arrays.equals(c1, c2);
  }
}
