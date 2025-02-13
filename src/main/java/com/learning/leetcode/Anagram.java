package com.learning.leetcode;

import java.util.*;
import lombok.SneakyThrows;

public class Anagram {
  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(isAnagram("abc", "cabb"));
    System.out.println(isAnagram("abc", "cbbcacccacaba"));
    System.out.println(isAnagram("abcx", "cbb"));
    System.out.println(isAnagram1("abc", "cabb"));
    System.out.println(isAnagram1("abc", "cbbcacccacaba"));
    System.out.println(isAnagram1("abcx", "cbb"));
  }

  static boolean isAnagram(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    Arrays.sort(c1);
    char[] c2 = s2.toCharArray();
    Arrays.sort(c2);
    return Arrays.equals(c1, c2);
  }

  static boolean isAnagram1(String s1, String s2) {
    List<Character> l = new ArrayList<>();
    for(Character c : s1.toCharArray()) {
      l.add(c);
    }
    for(Character c : s2.toCharArray()) {
      if (!l.remove(c)) {
        return false;
      }
    }
    Character[] array = l.toArray(new Character[0]);
    return l.isEmpty();
  }
}
