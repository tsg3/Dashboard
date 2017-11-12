package org.tec.algorithms.sort;

import static org.junit.Assert.*;

import org.junit.Test;
import org.tec.datastructures.LinkedList;

public class SelectionSortTest {

	@Test
	public final void testSelectionSortLength() {
		SelectionSort<Integer> sS = new SelectionSort<Integer>();
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
		sS.selectionSort(Lista);
		assertEquals(Lista.length(),9);
	}
	
	
	@Test
	public final void testPosSelectionSort() {
		SelectionSort<Integer> sS = new SelectionSort<Integer>();
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
		sS.selectionSort(Lista);
		assertEquals(Lista.pos(0),Lista.root);
	}
	
	@Test
	public final void testSelectionSort() {
		SelectionSort<Integer> sS = new SelectionSort<Integer>();
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
		sS.selectionSort(Lista);
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
