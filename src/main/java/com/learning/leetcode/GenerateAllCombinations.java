package com.learning.leetcode;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class GenerateAllCombinations {
  public static void main(String[] args) {
    Instant started = Instant.now();
    int n = 5;
    int num = n * 2;
    String[] arr = new String[num];
    for (int i = 0; i < num; i++) {
      char c = (char) (97 + i);
      arr[i] = String.valueOf(c);
    }
    Set<String> set = getAllCombinations(arr);
    System.out.println("Total Combinations - " + set.size());
    Function<String, String> function =
        s -> {
          s = convertToParentheses(arr, s);
          return s;
        };
    set = set.stream().map(function).collect(Collectors.toSet());
    set.forEach(System.out::println);
    System.out.println("------------------------------------------------");
    set = set.stream().filter(ValidParentheses::isValid).collect(Collectors.toSet());
    System.out.println(set.size());
    set.forEach(System.out::println);
    System.out.println(ChronoUnit.MILLIS.between(started, Instant.now()));
  }

  private static Set<String> getAllCombinations(String[] arr) {
    String[] dup = arr;
    Set<String> set = null;
    for (int i = 0; i < arr.length - 1; i++) {
      set = new HashSet<>();

      for (int j = 0; j < arr.length; j++) {
        for (int k = 0; k < dup.length; k++) {
          if (arr[j] != dup[k] && !dup[k].contains(arr[j])) {
            set.add(arr[j] + dup[k]);
          }
        }
      }
      set =
          set.stream()
              .filter(
                  s -> {
                    s = convertToParentheses(arr, s);
                    return isPartiallyValid(s);
                  })
              .collect(Collectors.toSet());
      dup = set.toArray(new String[] {});
    }
    set =
        set.stream()
            .filter(
                s -> {
                  s = convertToParentheses(arr, s);
                  boolean result = !s.startsWith(")");
                  int length = s.length();
                  if (length > 2) {
                    int count = 0;
                    for (char c : s.substring(0, 3).toCharArray()) {
                      if (c == ')') {
                        ++count;
                      }
                    }
                    result = !(!result || (count > 1));
                  }
                  return result;
                })
            .collect(Collectors.toSet());
    return set;
  }

  private static boolean isPartiallyValid(String s) {
    boolean result;
    int length = s.length();
    result = !String.valueOf(s.charAt(length - 1)).contains("(");
    if (length > 2) {
      result = !(!result || (s.substring(length - 3).contains("((")));
    }
    if (length == 5) {
      int count = 0;
      for (char c : s.toCharArray()) {
        if (c == '(') {
          ++count;
        }
      }
      result = !(!result || (count > 2));
    }
    return result;
  }

  private static String convertToParentheses(String[] arr, String s) {
    for (int j = 0; j < arr.length; j++) {
      char c = (char) (97 + j);
      if (j % 2 != 0) {
        s = s.replaceAll(String.valueOf(c), "(");
      } else {
        s = s.replaceAll(String.valueOf(c), ")");
      }
    }
    return s;
  }
}
