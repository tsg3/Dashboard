package org.tec.algorithms.sort;

import static org.junit.Assert.*;

import org.junit.Test;
import org.tec.datastructures.LinkedList;

public class QuickSortTest {

	@Test
	public final void testQuickSortLength() {
		QuickSort<Integer> qS = new QuickSort<Integer>();
    	LinkedList <Integer> Lista = new LinkedList <Integer>();
		Lista.add (1);
		Lista.add (3);
		Lista.add (2);
		Lista.add (5);
		Lista.add (4);
		Lista.add (13);
		Lista.add (45);
		Lista.add (2);
		Lista.add (1);
		int n = Lista.length();
		qS.sort(Lista, 0, n-1);
		assertEquals(Lista.length(),9);
	}
	
	
	@Test
	public final void testPosQuickSort() {
		QuickSort<Integer> qS = new QuickSort<Integer>();
    	LinkedList <Integer> Lista = new LinkedList <Integer>();
		Lista.add (1);
		Lista.add (3);
		Lista.add (2);
		Lista.add (5);
		Lista.add (4);
		Lista.add (13);
		Lista.add (45);
		Lista.add (2);
		Lista.add (1);
		int n = Lista.length();
		qS.sort(Lista, 0, n-1);
		assertEquals(Lista.pos(0),Lista.root);
	}
	
	@Test
	public final void testQuickSort() {
		QuickSort<Integer> qS = new QuickSort<Integer>();
    	LinkedList <Integer> Lista = new LinkedList <Integer>();
		Lista.add (1);
		Lista.add (3);
		Lista.add (2);
		Lista.add (5);
		Lista.add (4);
		Lista.add (13);
		Lista.add (45);
		Lista.add (2);
		Lista.add (1);
		int n = Lista.length();
		qS.sort(Lista, 0, n-1);
		LinkedList <Integer> solucion = new LinkedList <Integer>();
		solucion.add (1);
		solucion.add (1);
		solucion.add (2);
		solucion.add (2);
		solucion.add (3);
		solucion.add (4);
		solucion.add (5);
		solucion.add (13);
		solucion.add (45);
		equals(Lista.equals(solucion));
	}

}
