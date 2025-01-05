package com.learning.leetcode;

import java.util.*;
import lombok.SneakyThrows;

public class RemoveElement {
  @SneakyThrows
  public static void main(String[] args) {
    int[] nums = {2, 2, 2};
    System.out.println(Arrays.toString(nums));
    System.out.println(removeElement(nums, 2));
    System.out.println(Arrays.toString(nums));
  }

  private static int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }
    int fromLast = nums.length - 1;
    for (int i = 0; i < fromLast; i++) {
      if (nums[i] == val) {
        for (; fromLast > i; fromLast--) {
          if (nums[fromLast] != val) {
            break;
          }
        }
        if (fromLast == i) {
            break;
        }
        nums[i] = nums[fromLast];
        nums[fromLast] = val;
        --fromLast;
      }
    }
    if (nums[fromLast] == val) {
      return fromLast;
    } else {
      return fromLast + 1;
    }
  }
}
