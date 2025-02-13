package com.learning.examples;

import com.learning.examples.model.A;
import com.learning.examples.model.B;
import com.learning.examples.model.Child;
import com.learning.examples.model.Parent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inheritance1Example {
  public static void main(String[] args) {
    Parent parent = new Child();
    parent.test();
    parent.testParent();
    Child child = new Child();
    child.test();
    child.testParent();
    child.testChild();
    Integer n1 = 4;
    Integer n2 = 6;
    System.out.println(n1.compareTo(n2));
    List list = new ArrayList<>();
    new HashMap<>();
  }
}
