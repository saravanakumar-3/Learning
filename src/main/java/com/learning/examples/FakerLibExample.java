package com.learning.examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import lombok.SneakyThrows;

public class FakerLibExample {
  @SneakyThrows
  public static void main(String[] args) {
    Faker faker = new Faker();
    System.out.println(faker.internet().emailAddress());
    System.out.println(faker.internet().password());
    System.out.println(faker.book().title());
  }
}
