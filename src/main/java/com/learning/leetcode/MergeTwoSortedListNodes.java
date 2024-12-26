package com.learning.leetcode;

import com.learning.examples.model.ListNode;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedListNodes {
  @SneakyThrows
  public static void main(String[] args) {
    ListNode head1 = new ListNode(1);
    ListNode list1 = head1;
    list1.next = new ListNode(2);
    list1 = list1.next;
    list1.next = new ListNode(4);
    ListNode head2 = new ListNode(1);
    ListNode list2 = head2;
    list2.next = new ListNode(3);
    list2 = list2.next;
    list2.next = new ListNode(4);
    printNode(head1);
    printNode(head2);
    printNode(mergeTwoLists(head1, head2));
    printNode(mergeTwoListsRewritten(head1, head2));
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode head = null;
    ListNode tail = null;
    while (list1 != null || list2 != null) {
      if (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
          if (head == null) {
            head = new ListNode(list1.val);
            tail = head;
          } else {
            tail.next = new ListNode();
            tail = tail.next;
            tail.val = list1.val;
          }
          list1 = list1.next;
        } else {
          if (head == null) {
            head = new ListNode(list2.val);
            tail = head;
          } else {
            tail.next = new ListNode();
            tail = tail.next;
            tail.val = list2.val;
          }
          list2 = list2.next;
        }
      } else if (list1 != null) {
        while (list1 != null) {
          if (head == null) {
            head = new ListNode(list1.val);
            tail = head;
          } else {
            tail.next = new ListNode();
            tail = tail.next;
            tail.val = list1.val;
          }
          list1 = list1.next;
        }
      } else {
        while (list2 != null) {
          if (head == null) {
            head = new ListNode(list2.val);
            tail = head;
          } else {
            tail.next = new ListNode();
            tail = tail.next;
            tail.val = list2.val;
          }
          list2 = list2.next;
        }
      }
    }
    return head;
  }

  public static ListNode mergeTwoListsRewritten(ListNode list1, ListNode list2) {
    ListNode head = new ListNode();
    ListNode cur = head;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        cur.next = list1;
        list1 = list1.next;
      } else {
        cur.next = list2;
        list2 = list2.next;
      }
      cur = cur.next;
    }
    cur.next = list1 != null ? list1 : list2;
    return head.next;
  }

  private static void printNode(ListNode merged) {
    List<Integer> list = new ArrayList<>();
    while (merged != null) {
      list.add(merged.val);
      merged = merged.next;
    }
    System.out.println(list);
  }
}
