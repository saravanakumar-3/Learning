package com.learning.examples.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Data
public class PaymentMessage2 implements Serializable {
  public int id;
  public String name;
}
