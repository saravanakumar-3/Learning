package com.learning.examples.model;

public class Child extends Parent {
  private String parentPrivate = "parentPrivate";
  protected String parentProtected = "parentProtected";
  public String parentPublic = "parentPublic";
  public Child() {
    super();
    System.out.println("Inside Child Constructor");
  }

  @Override
  public void test() {
    System.out.println("Inside Child test");
  }

  public void testChild() {
    System.out.println("Inside Child test");
  }
}
