package com.learning.leetcode;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
  static final String[] KEYS = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(letterCombinations("234"));
    System.out.println(letterCombinations("234"));
  }

  public static List<String> letterCombinations(String digits) {
    String[] strs = new String[digits.length()];
    for (int i = 0; i < digits.length(); i++) {
      strs[i] = KEYS[Integer.parseInt(String.valueOf(digits.charAt(i))) - 2];
    }
    List<String> r = new ArrayList<>();
    if (strs.length > 0) {
      for (int i = 0; i < strs[0].length(); i++) {
        StringBuilder s = new StringBuilder();
        s.append(strs[0].charAt(i));
        if (strs.length > 1) {
          for (int j = 0; j < strs[1].length(); j++) {
            s = new StringBuilder();
            s.append(strs[0].charAt(i));
            s.append(strs[1].charAt(j));
            if (strs.length > 2) {
              for (int k = 0; k < strs[2].length(); k++) {
                s = new StringBuilder();
                s.append(strs[0].charAt(i));
                s.append(strs[1].charAt(j));
                s.append(strs[2].charAt(k));
                if (strs.length > 3) {
                  for (int l = 0; l < strs[3].length(); l++) {
                    s = new StringBuilder();
                    s.append(strs[0].charAt(i));
                    s.append(strs[1].charAt(j));
                    s.append(strs[2].charAt(k));
                    s.append(strs[3].charAt(l));
                    r.add(s.toString());
                  }
                } else {
                  r.add(s.toString());
                }
              }
            } else {
              r.add(s.toString());
            }
          }
        } else {
          r.add(s.toString());
        }
      }
    }
    return r;
  }

}
