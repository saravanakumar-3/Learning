package com.learning.examples.model;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class PaymentMessageNew implements Serializable {
  public int id;
  public String name;
  public LocalDateTime time;
}
