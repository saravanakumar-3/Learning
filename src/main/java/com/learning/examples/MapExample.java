package com.learning.examples;

import java.util.HashMap;

public class MapExample {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("", "DSW");
    System.out.println(map.get(""));
    System.out.println(map.get("zcv"));
  }
}
