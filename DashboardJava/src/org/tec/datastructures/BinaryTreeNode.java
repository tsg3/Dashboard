package org.tec.datastructures;

public class BinaryTreeNode <V> {

	private BinaryTreeNode<V> leftChild;
	private BinaryTreeNode<V> rightChild;
	private V value;


	public BinaryTreeNode<V> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(BinaryTreeNode<V> leftChild) {
		this.leftChild = leftChild;
	}
	public BinaryTreeNode<V> getRightChild() {
		return rightChild;
	}
	public void setRightChild(BinaryTreeNode<V> rightChild) {
		this.rightChild = rightChild;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
		}



}
