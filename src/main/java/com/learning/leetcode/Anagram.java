package com.learning.leetcode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.*;
import lombok.SneakyThrows;

public class Anagram {
  @SneakyThrows
  public static void main(String[] args) {
    assertThat(isAnagramSolution1("anagram", "nagaram"), is(true));
    assertThat(isAnagramSolution1("eat", "tea"), is(true));
    assertThat(isAnagramSolution1("eat", "teaa"), is(false));
    assertThat(isAnagramSolution1("eat", "te"), is(false));

    assertThat(isAnagramSolution2("anagram", "nagaram"), is(true));
    assertThat(isAnagramSolution2("eat", "tea"), is(true));
    assertThat(isAnagramSolution2("eat", "teaa"), is(false));
    assertThat(isAnagramSolution2("eat", "te"), is(false));
  }

  static boolean isAnagramSolution1(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    Arrays.sort(c1);
    char[] c2 = s2.toCharArray();
    Arrays.sort(c2);
    return Arrays.equals(c1, c2);
  }

  static boolean isAnagramSolution2(String s1, String s2) {
    List<Character> l = new ArrayList<>();
    for (Character c : s1.toCharArray()) {
      l.add(c);
    }
    for (Character c : s2.toCharArray()) {
      if (!l.remove(c)) {
        return false;
      }
    }
    return l.isEmpty();
  }
}
