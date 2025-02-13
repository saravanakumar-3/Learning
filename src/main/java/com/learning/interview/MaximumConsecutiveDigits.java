package com.learning.interview;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumConsecutiveDigits {
  public static void main(String[] args) throws JsonProcessingException {
    int[] array = {1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
    System.out.println(maxConsecutiveDigit(array));
  }

  private static int maxConsecutiveDigit(int[] array) {
    if ((array.length == 1)) {
      return 1;
    }
    int max = 0;
    int count = 1;
    for (int i = 1; i < array.length; i++) {
      if (array[i - 1] == array[i]) {
        count++;
      } else {
        count = 1;
      }
      max = Math.max(max, count);
    }
    return max;
  }
}
