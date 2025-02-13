package com.learning.examples;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class FileReadingExample {
  public static void main(String[] args) throws IOException {
    File folder = new File("C:\\Users\\sardurai\\Downloads\\New folder");
    for (File file : folder.listFiles()) {
      BufferedReader br = new BufferedReader(new FileReader(file));

      StringBuilder str = new StringBuilder();
      String line;
      while ((line = br.readLine()) != null) {
        str.append(line).append(System.lineSeparator());
      }
      HashMap<String, String> map =
          new ObjectMapper().readValue(str.toString(), new TypeReference<>() {});
      map.containsKey("schemaDescription");
      Predicate s;
      JsonPath.read(str, "$.schemaDescription");
    }
  }
}
