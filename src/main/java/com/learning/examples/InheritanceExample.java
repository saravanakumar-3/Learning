package com.learning.examples;

import com.learning.examples.model.A;
import com.learning.examples.model.B;

public class InheritanceExample {
  public static void main(String[] args) {
    A a = new B();
    a.testA();
    a.test();
    System.out.println(a instanceof A);
    System.out.println(a instanceof B);
    System.out.println();
    B b = new B();
    b.testA();
    b.testB();
    b.test();
    System.out.println(b instanceof A);
    System.out.println(b instanceof B);
    B bb = (B) a;
    bb.test();
  }
}
