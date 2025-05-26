package com.learning.examples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

import lombok.Data;
import lombok.SneakyThrows;

@Data
public class PopulationData {

  List<Attributes> data;
  Object source;

  @SneakyThrows
  @Override
  public String toString() {
    return new ObjectMapper().writeValueAsString(this);
  }
}
