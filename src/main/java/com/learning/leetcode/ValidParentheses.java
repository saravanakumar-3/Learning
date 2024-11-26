package com.learning.leetcode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.SneakyThrows;

public class ValidParentheses {
  @SneakyThrows
  public static void main(String[] args) {
    assertThat(isValid("()"), is(true));
    assertThat(isValid("()[]{}"), is(true));
    assertThat(isValid("(]"), is(false));
    assertThat(isValid("([])"), is(true));
    assertThat(isValid("([)]"), is(false));
  }

  public static boolean isValid(String s) {
    final Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (c == ')' || c == '}' || c == ']') {
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
