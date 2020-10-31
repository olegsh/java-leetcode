package leetcode.addtwonumbers;

import leetcode.structures.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {
  private Addition addition;

  @Before
  public void setUp() throws Exception {
    addition = new Addition();
  }

  @Test
  public void testAdditionSimple() {
    ListNode<Integer> node1 = new ListNode<>(2);
    Helper.add2Node(node1, 4);
    Helper.add2Node(node1, 3);
    ListNode<Integer> node2 = new ListNode<>(5);
    Helper.add2Node(node2, 6);
    Helper.add2Node(node2, 4);
    assertEquals("708",
        Helper.convertListNode(
            addition.addTwoNumbers(node1, node2)));
  }

  @Test
  public void testAdditionLong() {
    ListNode<Integer> node1 = new ListNode<>(5);
    Helper.add2Node(node1, 4);
    Helper.add2Node(node1, 2);
    Helper.add2Node(node1, 7);
    Helper.add2Node(node1, 8);
    Helper.add2Node(node1, 0);
    Helper.add2Node(node1, 3);
    Helper.add2Node(node1, 2);

    ListNode<Integer> node2 = new ListNode<>(5);
    Helper.add2Node(node2, 6);
    Helper.add2Node(node2, 4);
    assertEquals("01778032",
        Helper.convertListNode(
            addition.addTwoNumbers(node1, node2)));
  }
}
