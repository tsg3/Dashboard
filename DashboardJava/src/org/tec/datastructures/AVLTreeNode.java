package org.tec.datastructures;

//Java program for insertion in AVL Tree
public class AVLTreeNode <V> {
	V value;
	int height;
	AVLTreeNode <V> left, right;

	AVLTreeNode(V value) {
		this.value = value;
		height = 1;
	}
}