package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplayTreeTest {

	@Test
	public final void testSplayTreeMin() {
		SplayTree<Integer> st = new SplayTree<Integer>();
    	st.insert(3);
    	st.insert(5);
    	st.insert(2);
    	st.insert(7);
    	st.insert(1);
	    assertEquals(st.findMin(st.root).byteValue(),1);
	}
	
	@Test
	public final void testAVLTreeFind() {
		SplayTree<Integer> st = new SplayTree<Integer>();
    	st.insert(3);
    	st.insert(5);
    	st.insert(2);
    	st.insert(7);
    	st.insert(1);
	    assertEquals(st.search(2),true);
	}
}
