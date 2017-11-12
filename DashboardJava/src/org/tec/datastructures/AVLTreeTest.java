package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class AVLTreeTest {

	@Test
	public final void testAVLTreeMax() {
		 AVLTree<Integer> tree = new AVLTree<Integer>();
		 tree.root = tree.insert(tree.root, 10);
	     tree.root = tree.insert(tree.root, 20);
	     tree.root = tree.insert(tree.root, 30);
	     tree.root = tree.insert(tree.root, 40);
	     tree.root = tree.insert(tree.root, 50);
	     tree.root = tree.insert(tree.root, 25);
	     assertEquals(tree.max(3, 4),4);
	}

	@Test
	public final void testAVLTreeHeight() {
		 AVLTree<Integer> tree = new AVLTree<Integer>();
		 tree.root = tree.insert(tree.root, 10);
	     tree.root = tree.insert(tree.root, 20);
	     tree.root = tree.insert(tree.root, 30);
	     tree.root = tree.insert(tree.root, 40);
	     tree.root = tree.insert(tree.root, 50);
	     tree.root = tree.insert(tree.root, 25);
	     assertEquals(tree.height(tree.root),3);
	}
	//tree.getBalance(tree.root.right)
	
	@Test
	public final void testAVLTreeBalanceRight() {
		 AVLTree<Integer> tree = new AVLTree<Integer>();
		 tree.root = tree.insert(tree.root, 10);
	     tree.root = tree.insert(tree.root, 20);
	     tree.root = tree.insert(tree.root, 30);
	     tree.root = tree.insert(tree.root, 40);
	     tree.root = tree.insert(tree.root, 50);
	     tree.root = tree.insert(tree.root, 25);
	     assertEquals(tree.getBalance(tree.root.right),-1);
	}
	
	@Test
	public final void testAVLTreeBalanceLeft() {
		 AVLTree<Integer> tree = new AVLTree<Integer>();
		 tree.root = tree.insert(tree.root, 10);
	     tree.root = tree.insert(tree.root, 20);
	     tree.root = tree.insert(tree.root, 30);
	     tree.root = tree.insert(tree.root, 40);
	     tree.root = tree.insert(tree.root, 50);
	     tree.root = tree.insert(tree.root, 25);
	     assertEquals(tree.getBalance(tree.root.left),0);
	}
}
