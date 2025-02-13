package com.learning.examples;

import java.util.*;
import lombok.SneakyThrows;

public class Temp {
  @SneakyThrows
  public static void main(String[] args) {
    int[] arr = {2, 4, 1, 3};
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      boolean isSorted = true;
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
