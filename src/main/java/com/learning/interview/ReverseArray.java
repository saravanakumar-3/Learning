package com.learning.interview;

public class ReverseArray {
  public static void main(String[] args) {
    char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
    System.out.println(array);
    System.out.println(reverseArray(array));
    System.out.println(reverseArrayWithoutNewArray(array));
    System.out.println(array);
  }

  private static char[] reverseArray(char[] array) {
    char[] reverse = new char[array.length];
    for (int i = 0; i < array.length; i++) {
      reverse[array.length - i - 1] = array[i];
    }
    return reverse;
  }

  private static char[] reverseArrayWithoutNewArray(char[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    return array;
  }
}
