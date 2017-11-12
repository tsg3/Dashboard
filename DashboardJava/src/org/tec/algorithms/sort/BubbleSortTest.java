package org.tec.algorithms.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.tec.datastructures.LinkedList;

public class BubbleSortTest {

	@Test
	public final void testBubbleSortLength() {
		BubbleSort<Integer> bS = new BubbleSort<Integer>();
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
		bS.bubbleSort(Lista);
		assertEquals(Lista.length(),9);
	}
	
	
	@Test
	public final void testPosBubbleSort() {
		BubbleSort<Integer> bS = new BubbleSort<Integer>();
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
		bS.bubbleSort(Lista);
		assertEquals(Lista.pos(0),Lista.root);
	}
	
	@Test
	public final void testBubbleSort() {
		BubbleSort<Integer> bS = new BubbleSort<Integer>();
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
		bS.bubbleSort(Lista);
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
