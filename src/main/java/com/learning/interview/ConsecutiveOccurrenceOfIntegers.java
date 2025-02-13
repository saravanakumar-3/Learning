package com.learning.interview;

public class ConsecutiveOccurrenceOfIntegers {
  public static void main(String[] args) {
    int[] arr = {4, 3, 25, 6, 7, 8, 9, 2, 3, 10};
    System.out.println(getLongestConsecutiveOccurence(arr));
  }

  private static int getLongestConsecutiveOccurence(int[] arr) {
    int max = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] + 1 == arr[i]) {
        count++;
      } else {
        count = 0;
      }
      max = Math.max(max, count);
    }
    return max;
  }
}
