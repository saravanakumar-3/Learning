package com.learning.examples;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileReadingExample {
  public static void main(String[] args) throws IOException {
    List<String> stringList = new ArrayList<>();
    File folder = new File("C:\\Users\\sardurai\\Downloads\\New folder");
    for (File file : folder.listFiles()) {
      BufferedReader br = new BufferedReader(new FileReader(file));

      StringBuilder str = new StringBuilder();
      String line;
      while ((line = br.readLine()) != null) {
        str.append(line).append(System.lineSeparator());
      }
      HashMap<String, String> map =
          new ObjectMapper()
              .readValue(str.toString(), new TypeReference<HashMap<String, String>>() {});
      map.containsKey("schemaDescription");
      JsonPath.read(str, "$.schemaDescription");
    }
  }
}
