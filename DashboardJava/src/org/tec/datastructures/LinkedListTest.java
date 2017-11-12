package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testLinkedListLength() {
		LinkedList <String> Lista = new LinkedList <String>();
		Lista.add ("34td1");
		Lista.add ("34td2");
		Lista.add ("34td3");
		Lista.add ("34td4");
		Lista.add ("34td5");
		Lista.delete (3);
		assertEquals(Lista.length (),4);
	}
	
	@Test
	public void testLinkedListHasCode() {
		LinkedList <String> Lista = new LinkedList <String>();
		Lista.add ("34td1");
		Lista.add ("34td2");
		Lista.add ("34td3");
		Lista.add ("34td4");
		Lista.add ("34td5");
		Lista.delete (3);
		assertEquals(Lista.hashCode(),5326611);
	}
	@Test
	public void testLinkedList() {
		LinkedList <String> Lista = new LinkedList <String>();
		Lista.add ("34td1");
		Lista.add ("34td2");
		Lista.add ("34td3");
		Lista.add ("34td4");
		Lista.add ("34td5");
		Lista.delete (3);
		LinkedList <String> solucion = new LinkedList <String>();
		solucion.add ("34td1");
		solucion.add ("34td2");
		solucion.add ("34td3");
		solucion.add ("34td5");
		equals(Lista.equals(solucion));
	}
}
