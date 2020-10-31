package leetcode.addtwonumbers;

import leetcode.structures.ListNode;

public class Helper {
  public static ListNode<Integer> add2Node(ListNode<Integer> node, Integer value) {
    if (node == null) {
      return new ListNode<>(value);
    }
    if (node.getNext() == null) {
      node.setNext(new ListNode<>(value));
    } else {
      ListNode<Integer> curr = node;
      while (curr.getNext() != null) {
        curr = curr.getNext();
      }
      curr.setNext(new ListNode<>(value));
    }
    return node;
  }

  public static String convertListNode(ListNode<Integer> node) {
    if (node == null) {
      return "";
    }
    StringBuffer buf = new StringBuffer();
    while (node != null) {
      buf.append(node.getData());
      node = node.getNext();
    }
    return buf.toString();
  }
}
