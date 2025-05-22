package com.learning.selenium;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import lombok.SneakyThrows;
import org.skyscreamer.jsonassert.*;
import org.testng.annotations.Test;

@Test
public class CompareJsonStrings {
  private static final String json1 =
      "{\"firstName\":\"Amsa\",\"lastName\":\"Saravanakumar\", \"ids\":[1,2,3]}";
  private static final String json2 =
      "{\"firstName\":\"Amsa\",\"lastName\":\"Saravanakumar\", \"ids\":[1,2,3]}";
  private static final String json3 =
      "{\"lastName\":\"Saravanakumar\",\"firstName\":\"Amsa\", \"ids\":[1,2,3]}";
  private static final String json4 =
      "{\"firstName\":\"Amsa\",\"lastName\":\"Saravanakumar\", \"ids\":[2,1,3]}";
  private static final ObjectMapper om = new ObjectMapper();

  @SneakyThrows
  public void compareJson() {
    // Will validate even when element in array are in different order
    System.out.println("-".repeat(50));
    JSONAssert.assertEquals(json1, json2, JSONCompareMode.LENIENT);
    JSONAssert.assertEquals(json1, json3, JSONCompareMode.LENIENT);
    JSONAssert.assertEquals(json1, json4, JSONCompareMode.LENIENT);
    System.out.println("-".repeat(50));

    // Using Jackson lib, will fail when array element are in different order
    // Will validate even when element in array are in different order
    JsonNode jsonNode1 = om.readTree(json1);
    JsonNode jsonNode2 = om.readTree(json2);
    JsonNode jsonNode3 = om.readTree(json3);
    JsonNode jsonNode4 = om.readTree(json4);
    System.out.println("-".repeat(50));
    System.out.println(jsonNode1.equals(jsonNode2));
    System.out.println(jsonNode1.equals(jsonNode3));
    System.out.println(jsonNode1.equals(jsonNode4));
    System.out.println("-".repeat(50));
  }
}
