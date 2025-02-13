package com.learning.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.SneakyThrows;

public class LengthOfLongestSubstring {
  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abdedfgh"));
    System.out.println(lengthOfLongestSubstringNew("abdedfgh"));
    System.out.println(lengthOfLongestSubstringNewNew("a"));
  }

  // Solution 1 - Simple
  public static int lengthOfLongestSubstring(String s) {
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      ArrayList<Character> list = new ArrayList<>();
      for (int j = i; j < s.length(); j++) {
        if (list.contains(s.charAt(j))) {
          break;
        }
        list.add(s.charAt(j));
      }
      max = Math.max(max, list.size());
    }
    return max;
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
        maxLength = Math.max(maxLength, (right - left) + 1);
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

  public static int lengthOfLongestSubstringNewNew(String s) {
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j <= s.length(); j++) {
        String t = s.substring(i, j);
        if(max >= t.length()) {
          continue;
        }
        List<Character> list = new ArrayList<>();
        for (Character c : t.toCharArray()) {
          if (list.contains(c)) {
            break;
          } else {
            list.add(c);
          }
        }
        max = Math.max(max, list.size());
      }
    }
    return max;
  }
}
