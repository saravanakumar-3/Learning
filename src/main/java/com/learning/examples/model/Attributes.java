package com.learning.examples.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.SneakyThrows;

@Data
public class Attributes {
  @JsonProperty("ID Nation")
  String idNation;

  @JsonProperty("Nation")
  String nation;

  @JsonProperty("ID Year")
  int idYear;

  @JsonProperty("Year")
  String year;

  @JsonProperty("Population")
  long population;

  @JsonProperty("Slug Nation")
  String slugNation;

  @SneakyThrows
  @Override
  public String toString() {
    return new ObjectMapper().writeValueAsString(this);
  }
}
