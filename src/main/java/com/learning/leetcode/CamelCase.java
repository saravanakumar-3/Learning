package com.learning.leetcode;

import lombok.SneakyThrows;
import org.apache.commons.text.CaseUtils;

public class CamelCase {
  @SneakyThrows
  public static void main(String[] args) {
    System.out.println(getCamelCase("abc def-hij"));
    System.out.println(CaseUtils.toCamelCase("abc_def_hij", false, '_'));
  }

  public static String getCamelCase(String str) {
    StringBuilder r = new StringBuilder();
    char[] array = str.toCharArray();
    for (int i = 0; i < array.length; i++) {
      if (Character.isLetter(array[i])) {
        r.append(Character.toLowerCase(array[i]));
      } else {
        if (++i < array.length) {
          r.append(Character.toUpperCase(array[i]));
        }
      }
    }
    return r.toString();
  }
}
