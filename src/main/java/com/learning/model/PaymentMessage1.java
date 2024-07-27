package com.learning.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class PaymentMessage1 implements Serializable {
  public int id;
  public String name;
}
