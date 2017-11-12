package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testStackTestEmpty() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(10);
		stack.push(4);
		stack.push(7);
		stack.pop();
		assertEquals(stack.empty(),false);
	}
	
	@Test
	public void testStackTest() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(10);
		stack.push(4);
		stack.push(7);
		stack.pop();
		Stack<Integer> solucion = new Stack<Integer>();
		solucion.push(10);
		solucion.push(4);
		solucion.push(7);
		equals(stack.equals(solucion));
	}

}
