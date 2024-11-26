package com.learning.leetcode;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMedianSortedArrays {
  @SneakyThrows
  public static void main(String[] args) {
    int[] nums1 = {};
    int[] nums2 = {1};
    System.out.println(findMedianSortedArrays(nums1, nums2));
  }

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int total = nums1.length + nums2.length;
    int middle;
    boolean isMiddle2 = false;
    if (total % 2 == 0) {
      middle = total / 2 - 1;
      isMiddle2 = true;
    } else {
      middle = total / 2;
    }

    double median = 0;
    int[] nums3 = new int[total];
    for (int i = 0, j = 0, k = 0; k < total; ) {
      if (k == middle+1) {
        median = nums3[middle];
        if (!isMiddle2) {
          break;
        }
      }
      if (isMiddle2) {
        if (k == middle + 2) {
          median = (median + nums3[middle+1]) / 2;
          break;
        }
      }

      if (i < nums1.length) {
        if (j < nums2.length) {
          if (nums1[i] <= nums2[j]) {
            nums3[k++] = nums1[i++];
          } else {
            nums3[k++] = nums2[j++];
          }
        } else {
          nums3[k++] = nums1[j++];
        }
      } else {
        nums3[k++] = nums2[j++];
      }
    }
    return median;
  }

  public static double findMedianSortedArraysBruteForce(int[] nums1, int[] nums2) {
    int[] merged = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();

    return 0;
  }
}
