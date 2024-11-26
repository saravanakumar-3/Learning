package com.learning.leetcode.sortingalgorithms;

public class BubbleSort<T extends Comparable<T>> {
  private final T[] array;

  public BubbleSort(T[] array) {
    this.array = array;
  }

  public void sort() {
    for (int i = 0; i < array.length; i++) {
      boolean isSorted = true;
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j].compareTo(array[j + 1]) > 0) {
          T temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }
    }
  }
}
