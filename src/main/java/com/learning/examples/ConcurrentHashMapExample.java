package com.learning.examples;

import java.util.concurrent.ConcurrentHashMap;

import static java.lang.System.out;

public class ConcurrentHashMapExample {
  public static void main(String[] args) {
    ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
    map.put("1", "test");
    out.println(map);
    map.put("1", "x");
    out.println(map);
  }
}
