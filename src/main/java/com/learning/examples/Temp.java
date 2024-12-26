package com.learning.examples;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Temp {
  @SneakyThrows
  public static void main(String[] args) {
    List list = new ArrayList<String>();
    list.add(1);
    list.add("11");
    System.out.println(list);
    System.out.println(list.get(0) instanceof Integer);
    System.out.println(list.get(0) instanceof String);
    System.out.println(list.get(1) instanceof Integer);
    System.out.println(list.get(1) instanceof String);
  }
}
