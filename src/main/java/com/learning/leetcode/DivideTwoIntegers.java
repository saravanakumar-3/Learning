package com.learning.leetcode;

public class DivideTwoIntegers {
  public static void main(String[] args) {
    System.out.println(divide(-1010369383, -2147483648));
  }

  public static int divide(int dividend, int divisor) {
    if (divisor == 1 || divisor == -1) {
      if (divisor == 1) {
        return dividend;
      }
      if (dividend == Integer.MIN_VALUE) {
        return Integer.MAX_VALUE;
      }
      return -dividend;
    }
    if (divisor == Integer.MIN_VALUE) {
      if (dividend == Integer.MIN_VALUE)
        return 1;
      else
        return 0;
    }
    int sign = 1;
    long divident1 = dividend;
    long divisor1 = divisor;
    if (divident1 < 0 || divisor1 < 0) {
      if (!(divident1 < 0 && divisor1 < 0)) {
        sign = -1;
      }
      if (divident1 < 0) {
        divident1 = -divident1;
      }
      if (divisor1 < 0) {
        divisor1 = -divisor1;
      }
    }
    int quotient = 0;
    long total = divisor1;
    if (total <= divident1) {
      ++quotient;
    }
    long total1 = divisor1;
    int quotient1 = 1;
    while (true) {
      if (total + total <= divident1) {
        total = total + total;
        quotient = quotient + quotient;
        continue;
      } else if (total + total1 <= divident1) {
        total = total + total1;
        quotient = quotient + quotient1;
        total1 = total1 + total1;
        quotient1 = quotient1 + quotient1;
      } else {
        total1 = divisor1;
        quotient1 = 1;
      }
      if (total + divisor1 <= divident1) {
        total = total + divisor1;
        ++quotient;
      } else {
        break;
      }
    }
    return quotient * sign;
  }
}
