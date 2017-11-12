package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleLinkedListTest {

	@Test
	public void testDoubleLinkedListLength() {
		DoubleLinkedList <Integer> Lista = new DoubleLinkedList <Integer>();
		Lista.add (0);
		Lista.add (1);
		Lista.add (2);
		Lista.add (3);
		Lista.add (4);
		Lista.delete (1);
		assertEquals(Lista.length (),4);
	}
	
	@Test
	public void testDoubleLinkedListHasCode() {
		DoubleLinkedList <Integer> Lista = new DoubleLinkedList <Integer>();
		Lista.add (0);
		Lista.add (1);
		Lista.add (2);
		Lista.add (3);
		Lista.add (4);
		Lista.delete (1);
		assertEquals(Lista.hashCode(),20439250);
	}
	
	@Test
	public void testDoubleLinkedList() {
		DoubleLinkedList <Integer> Lista = new DoubleLinkedList <Integer>();
		Lista.add (0);
		Lista.add (1);
		Lista.add (2);
		Lista.add (3);
		Lista.add (4);
		Lista.delete (1);
		DoubleLinkedList <Integer> solucion = new DoubleLinkedList <Integer>();
		solucion.add (0);
		solucion.add (2);
		solucion.add (3);
		solucion.add (4);
		equals(Lista.equals(solucion));
	}
	
}
