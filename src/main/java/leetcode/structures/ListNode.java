package leetcode.structures;

public class ListNode<E> {
  private E data;
  private ListNode<E> next;

  public ListNode(E data) {
    this.data = data;
    this.next = null;
  }

  public ListNode(E data, ListNode<E> next) {
    this.data = data;
    this.next = next;
  }

  public E getData() {
    return data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public ListNode<E> getNext() {
    return next;
  }

  public void setNext(ListNode<E> next) {
    this.next = next;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return "ListNode{" +
        "data=" + data +
        ", next=" + next +
        '}';
  }
}
