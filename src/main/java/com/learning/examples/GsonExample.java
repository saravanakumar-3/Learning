package com.learning.examples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.learning.examples.model.PaymentMessageNew;

import java.time.LocalDateTime;

import static java.lang.System.out;

public class GsonExample {
  public static void main(String[] args) {
    PaymentMessageNew paymentMessage = new PaymentMessageNew(10, "santhosh", LocalDateTime.now());
    out.println(paymentMessage);
    Gson gson = new GsonBuilder().setDateFormat(0).setPrettyPrinting().create();
    out.println(gson.toJson(paymentMessage));
  }
}
