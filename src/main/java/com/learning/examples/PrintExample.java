package com.learning.examples;

import static java.lang.System.out;

public class PrintExample {
  public static void main(String[] args) {
    //    System.getProperties()
    //        .forEach(
    //            (o, o2) -> {
    //              out.println(o.toString() + "  ----  " + o2.toString());
    //            });
    out.println(System.getenv());
  }
}
