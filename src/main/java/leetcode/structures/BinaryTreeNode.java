package leetcode.structures;

public class BinaryTreeNode<E> {
  public E value;
  public BinaryTreeNode<E> left;
  public BinaryTreeNode<E> right;

  public BinaryTreeNode(E value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public BinaryTreeNode<E> insertLeft(E leftValue) {
    this.left = new BinaryTreeNode<>(leftValue);
    return this.left;
  }

  public BinaryTreeNode<E> insertRight(E rightValue) {
    this.right = new BinaryTreeNode<>(rightValue);
    return this.right;
  }
}
