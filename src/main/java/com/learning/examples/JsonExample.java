package com.learning.examples;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonExample {
  public JsonExample() {}

  public static void main(String[] args) throws IOException {
    byte[] jsonData =
        Files.readAllBytes(
            Paths.get(
                "C:\\Users\\sardurai\\Documents\\Repo\\Learning\\src\\main\\resources\\templates\\PaymentMessage.txt"));
    System.out.println(jsonData.toString());
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode rootNode = objectMapper.readTree(jsonData);
    System.out.println(rootNode);
    JsonNode node = rootNode.path("id");
    node.elements();
    System.out.println(node.asInt());
  }
}
