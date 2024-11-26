package com.learning.leetcode.sortingalgorithms;

import lombok.SneakyThrows;

import java.util.Arrays;

public class ApplicationMain {
  @SneakyThrows
  public static void main(String[] args) {
    Integer[] array = {2, 4, 1, 5, 3, 6, 8, 0, 2, 5, 7, 8, 0, 2};
    BubbleSort<Integer> bubbleSort = new BubbleSort<>(array);
    System.out.println(Arrays.toString(array));
    bubbleSort.sort();
    System.out.println(Arrays.toString(array));
  }
}
