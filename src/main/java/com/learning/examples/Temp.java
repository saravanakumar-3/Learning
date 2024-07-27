package com.learning.examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.model.PaymentMessage;
import lombok.SneakyThrows;
import net.minidev.json.JSONObject;
import org.apache.commons.lang3.StringEscapeUtils;

public class Temp {
  @SneakyThrows
  public static void main(String[] args) {
    PaymentMessage m = new PaymentMessage();
    m.id = 2;
    m.name = "HI";
    String x = new ObjectMapper().writeValueAsString(m);
    x = x.replaceAll("\"", "\\\\\"");
    System.out.println(x);
    System.out.println(JSONObject.escape(x));
    System.out.println(StringEscapeUtils.escapeJson(x));
    System.out.println("\\\"");
  }
}
