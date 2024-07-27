package com.learning.examples;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.hamcrest.Matchers;

public class AssertExample {
  public static void main(String[] args) {
    //    PaymentMessage1 paymentMessage1 = new PaymentMessage1(1, "Name 1");
    //    PaymentMessage1 paymentMessage2 = new PaymentMessage1(2, "Name 2");
    //    PaymentMessage1 paymentMessage3 = new PaymentMessage1(3, "Name 3");
    //    List<PaymentMessage1> list1 = List.of(paymentMessage1, paymentMessage2);
    //    List<PaymentMessage1> list2 = List.of(paymentMessage1);
    //    System.out.println(list1);
    //    System.out.println(list2);
    //    assertThat(list2, Matchers.containsInAnyOrder(list1.toArray()));
    List<String> str1 = List.of("2", "1");
    List<String> str2 = List.of("1", "2", "3");
    assertThat(str1, Matchers.containsInAnyOrder(str2.toArray()));
  }
}
