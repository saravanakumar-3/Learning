package com.learning.leetcode;

import java.util.*;
import lombok.SneakyThrows;

public class GroupAnagrams {
  @SneakyThrows
  public static void main(String[] args) {
    String[] strs = {"ddddddddddg", "dgggggggggg"};
    System.out.println(groupAnagrams(strs));
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
      char[] cArray = s.toCharArray();
      Arrays.sort(cArray);
      String sortedString = new String(cArray);

      if (!map.containsKey(sortedString)) {
        map.put(sortedString, new ArrayList<>());
      }

      map.get(sortedString).add(s);
    }
    return new ArrayList<>(map.values());
  }
}
