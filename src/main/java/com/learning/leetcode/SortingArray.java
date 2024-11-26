package com.learning.leetcode;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.ethlo.time.DateTime;
import lombok.SneakyThrows;

public class SortingArray {
  @SneakyThrows
  public static void main(String[] args) {
    int[] x = {2, 4, 1, 5, 3, 6, 8, 0, 2, 5, 7, 8};
    Instant start = Instant.now();
    System.out.println(start);
    System.out.println(Arrays.toString(sortArray(x)));
    Instant end = Instant.now();
    System.out.println(end);
    System.out.println(ChronoUnit.MICROS.between(start, end));
    do{

    } while (false);
  }

  private static int[] sortArray(int[] x) {
    for (int i = 0; i < x.length; i++) {
      boolean isSorted = true;
      for (int j = 0; j < x.length - 1 - i; j++) {
        if (x[j] > x[j + 1]) {
          int temp = x[j + 1];
          x[j + 1] = x[j];
          x[j] = temp;
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }
    }
    return x;
  }
}
