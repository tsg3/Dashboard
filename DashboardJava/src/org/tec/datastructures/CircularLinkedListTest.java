package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularLinkedListTest {

	@Test
	public void testCircularLinkedListLength() {
		CircularLinkedList <Double> Lista = new CircularLinkedList <Double>();
		Lista.add (0.1);
		Lista.add (2.3);
		Lista.add (4.5);
		Lista.add (6.7);
		Lista.add (8.9);
		Lista.delete (3);
		assertEquals(Lista.length (),4);
	
	}
	@Test
	public void testCircularLinkedListHasCode() {
		CircularLinkedList <Double> Lista = new CircularLinkedList <Double>();
		Lista.add (0.1);
		Lista.add (2.3);
		Lista.add (4.5);
		Lista.add (6.7);
		Lista.add (8.9);
		Lista.delete (3);
		assertEquals(Lista.hashCode(),20439250);
	}
	
	@Test
	public void testCircularLinkedList() {
		CircularLinkedList <Double> Lista = new CircularLinkedList <Double>();
		Lista.add (0.1);
		Lista.add (2.3);
		Lista.add (4.5);
		Lista.add (6.7);
		Lista.add (8.9);
		Lista.delete (3);
		CircularLinkedList <Double> solucion = new CircularLinkedList <Double>();
		solucion.add (0.1);
		solucion.add (2.3);
		solucion.add (4.5);
		solucion.add (8.9);
		equals(Lista.equals(solucion));
	}
}
