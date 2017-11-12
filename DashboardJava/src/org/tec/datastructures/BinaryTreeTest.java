package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public final void testBinaryTreeMax() {
		BinaryTree<Integer> T = new BinaryTree<Integer>();
		T.add(6);
		T.add(1);
		T.add(30);
		T.add(13);
		T.add(78);
		T.add(2);
		T.add(3);
		T.delete(78);
		T.inOrder(T.root);
		int dato = T.root.getValue();
		assertEquals(dato,6);
	}

}
