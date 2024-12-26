package com.learning.examples.model;

import java.io.Serializable;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class PaymentMessage implements Serializable {
  public int id;
  public String name;
  public Instant time;
}
