package com.learning.examples;

import static java.lang.System.out;

import java.io.IOException;
import java.util.List;

public class RegexExample {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    //    Pattern pattern = Pattern.compile("[a-zA-Z0-9\\._\\-]+");
    //    String str = "7999.#";
    //    Matcher matcher = pattern.matcher(str);
    //    out.println(matcher.matches());
    //
    //    String s = "acacaca";
    //    out.println(s.replace("a", "b"));
    //    List<String> strr = new ArrayList<>();
    //    strr.add("1");
    //    update(strr);
    //    out.println(strr);
    //
    //    StringBuilder b = new StringBuilder();
    //    b.append("s");

    out.println("11".matches("null|[1-9]"));
  }

  private static void update(List<String> strr) {
    strr.add("2");
  }
}
