package com.learning.examples.model;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
public class PaymentMessage implements Serializable {
  public int id;
  public String name;
  public Instant time;

  @SneakyThrows
  public String toString() {
    return new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(this);
  }
}
