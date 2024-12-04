package com.learning.leetcode;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

class GenerateAllCombinationsRetry {
  public static void main(String[] args) {
    Instant started = Instant.now();
    int n = 8;
    int num = n * 2;
    String[] arr = new String[num];
    for (int i = 0; i < num; i++) {
      arr[i] = "(";
      arr[i + 1] = ")";
      i++;
    }
    Set<String> set = getAllCombinations(arr);
    System.out.println("Total Combinations - " + set.size());
    set =
        set.parallelStream()
            .filter(s -> !(s.startsWith(")") || s.startsWith("())")))
            .collect(Collectors.toSet());
    System.out.println("Total Combinations - " + set.size());
    set.forEach(System.out::println);
    set =
        set.parallelStream()
            .filter(GenerateAllCombinationsRetry::isValid)
            .collect(Collectors.toSet());
    System.out.println("------------------------------------------------");
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
          set.add(arr[j] + dup[k]);
        }
      }
      set =
          set.parallelStream()
              .filter(GenerateAllCombinationsRetry::isPartiallyValid)
              .collect(Collectors.toSet());
      dup = set.toArray(new String[] {});
    }
    return set;
  }

  private static boolean isPartiallyValid(String s) {
    boolean result;
    int length = s.length();
    result = !s.endsWith("(");
    if (result) {
      if (length == 3) {
        result = !s.contains("((");
      }
    }
    if (result) {
      if (length == 5) {
        int count = 0;
        for (char c : s.toCharArray()) {
          if (c == '(') {
            ++count;
          }
        }
        result = !(count > 2);
      }
    }
    return result;
  }

  public static boolean isValid(String s) {
    final Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        if (top != '(') {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
