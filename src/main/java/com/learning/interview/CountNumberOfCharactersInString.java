package com.learning.interview;

import java.util.Map;
import java.util.TreeMap;

public class CountNumberOfCharactersInString {
  public static void main(String[] args) {
    System.out.println(getNumberOfCharacters("asdfsfsef2232sasdaa"));
    swapNumbers();
  }

  private static void swapNumbers() {
    int n1 = 35;
    int n2 = 40;
    System.out.println("*********************");
    System.out.println(n1);
    System.out.println(n2);
    n1 = n1 + n2;
    n2 = n1 - n2;
    n1 = n1 - n2;
    System.out.println("*********************");
    System.out.println(n1);
    System.out.println(n2);
    System.out.println("*********************");
  }

  private static Map<Character, Integer> getNumberOfCharacters(String s) {
    Map<Character, Integer> map = new TreeMap<>();
    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        Integer i = map.get(c);
        map.put(c, i + 1);
      } else {
        map.put(c, 1);
      }
    }
    return map;
  }
}
