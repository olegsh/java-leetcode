package leetcode.addtwonumbers;

import leetcode.structures.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Addition {
  public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
    if (l1 == null && l2 == null) {
      return new ListNode<>(0);
    }
    ListNode<Integer> res = null;
    int sum = 0;
    while (l1 != null || l2 != null ) {
      sum /= 10;
      if (l1 == null) {
        sum += 0;
      } else {
        sum += l1.getData();
        l1 = l1.getNext();
      }
      if (l2 == null) {
        sum += 0;
      } else {
        sum += l2.getData();
        l2 = l2.getNext();
      }
      res = Helper.add2Node(res, sum % 10);
    }
    return res;
  }



  public static void main(String [] args) {
    Addition addition = new Addition();
    ListNode<Integer> n1 = new ListNode<>(5);
    Helper.add2Node(n1, 4);
    Helper.add2Node(n1, 4);
    Helper.add2Node(n1, 2);
    Helper.add2Node(n1, 7);
    Helper.add2Node(n1, 8);
    Helper.add2Node(n1, 0);
    Helper.add2Node(n1, 1);
    System.out.println();
    ListNode<Integer> n2 = new ListNode<>(5);
    Helper.add2Node(n2, 6);
    Helper.add2Node(n2, 4);
    ListNode<Integer> answ = addition.addTwoNumbers(n1, n2);
    System.out.println(answ.toString());
    System.out.println(Helper.convertListNode(answ));
  }

}
