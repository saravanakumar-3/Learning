package com.learning.examples;

import static io.restassured.RestAssured.given;

public class RestAssuredExamples {

  public static void main(String[] args) {
    postExample();
  }

  public static void getExample() {
    String url = "http://localhost:8080/investors";
    given().when().get(url).then().log().all();
  }

  public static void postExample() {
    String url = "http://localhost:8080/investors";
    String payload =
        "{\n"
            + "    \"name\": \"Arun\",\n"
            + "    \"mobile\": 2321566125,\n"
            + "    \"address\": \"Velur\"\n"
            + "}";
    given()
        .header("Content-Type", "application/json")
        .body(payload)
        .when()
        .post(url)
        .then()
        .log()
        .all();
  }
}
