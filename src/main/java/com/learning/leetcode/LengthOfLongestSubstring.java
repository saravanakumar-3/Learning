package com.learning.leetcode;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstringNew("abdedfgh"));
  }

  // Solution 1 - Simple
  public static int lengthOfLongestSubstring(String s) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      ArrayList<Character> list = new ArrayList<>();
      for (int j = i; j < s.length(); j++) {
        if (list.contains(s.charAt(j))) {
          break;
        }
        list.add(s.charAt(i));
      }
      result = Math.max(result, list.size());
    }
    return result;
  }

    // Solution 2 - Complex
  public static int lengthOfLongestSubstringNew(String s) {
    int n = s.length();
    int maxLength = 0;
    Set<Character> charSet = new HashSet<>();
    int left = 0;

    char charAtRight;
    char charAtLeft;
    for (int right = 0; right < n; right++) {
      charAtRight = s.charAt(right);
      if (!charSet.contains(charAtRight)) {
        charSet.add(charAtRight);
        maxLength = Math.max(maxLength, right - left + 1);
      } else {
        while (charSet.contains(charAtRight)) {
          charAtLeft = s.charAt(left);
          charSet.remove(charAtLeft);
          left++;
        }
        charSet.add(charAtRight);
      }
    }
    return maxLength;
  }
}
