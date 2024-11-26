package com.learning.leetcode;

import lombok.SneakyThrows;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
  @SneakyThrows
  public static void main(String[] args) {
    Set<List<Integer>> s = new HashSet<>();
    s.add(List.of(1,2));
    s.add(List.of(1,2));
    s.add(List.of(2,2));
    System.out.println(s);
    int[] num = {-1, 0, 1, 2, -1, -4};
    Arrays.sort(num);
    System.out.println("1234".substring(0, 1));
    System.out.println("1234".substring(1, 2));
    System.out.println("1234".substring(2, 3));
    System.out.println("1234".substring(3, 4));
    int[] nn = new int[2];
    System.out.println(Arrays.toString(num));
    System.out.println(threeSum(num));
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        for (int k = j+1; k < nums.length; k++) {
          int numI = nums[i];
          int numJ = nums[j];
          int numK = nums[k];
          if (numI + numJ + numK == 0) {
            boolean r = false;
            if (!list.isEmpty()) {
              for (List<Integer> l : list) {
                List<Integer> temp = new ArrayList<>(List.copyOf(l));
                if (temp.remove(Integer.valueOf(numI))
                    && temp.remove(Integer.valueOf(numJ))
                    && temp.remove(Integer.valueOf(numK))) {
                  r = true;
                  break;
                }
              }
            } else {
              list.add(List.of(numI, numJ, numK));
              continue;
            }
            if (!r) {
              list.add(List.of(numI, numJ, numK));
            }
          }
        }
      }
    }
    return list;
  }
}
