package com.learning.examples;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.examples.model.Attributes;
import com.learning.examples.model.PopulationData;
import java.util.*;
import lombok.SneakyThrows;

// https://datausa.io/api/data?drilldowns=Nation&measures=Population
//
//        population > 329725481

public class JsonPropertyExample {
  @SneakyThrows
  public static void main(String[] args) {
    String url = "https://datausa.io/api/data?drilldowns=Nation&measures=Population";
    String response = given().get(url).then().extract().asString();
    System.out.println("----".repeat(50));
    ObjectMapper om = new ObjectMapper();
    PopulationData populationData = om.readValue(response, PopulationData.class);
    System.out.println(populationData.toString());
    List<Attributes> list =
        populationData.getData().stream()
            .filter(attributes -> attributes.getPopulation() > 329725481)
            .toList();
    System.out.println(list);
  }
}
