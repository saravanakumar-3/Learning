package com.learning.examples.model;

public class Parent {
  private String parentPrivate = "parentPrivate";
  protected String parentProtected = "parentProtected";
  public String parentPublic = "parentPublic";

  public Parent() {
    System.out.println("Inside Parent Constructor");
  }

  public void test() {
    System.out.println("Inside Parent test");
  }

  public void testParent() {
    System.out.println("Inside Parent test");
  }
}
