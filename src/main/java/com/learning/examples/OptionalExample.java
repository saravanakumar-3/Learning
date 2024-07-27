package com.learning.examples;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

  static ArrayList<Map> l = new ArrayList<>();

  public static void main(String[] args) {
    Optional<ArrayList<String>> list = getList();
    String s = list.get().get(0);
  }

  private static <T> Optional<ArrayList<T>> getList() {
    return Optional.of(getMap());
  }

  private static <T> ArrayList<T> getMap() {
    l.add(Map.of("1", "2"));
    return (ArrayList<T>) l;
  }
}
