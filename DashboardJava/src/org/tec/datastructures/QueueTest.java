package org.tec.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testQueueEmpty() {
		Queue<String> queue = new Queue<String>();
		queue.push("s.0");
		queue.push("s.1");
		queue.push("s.2");
		queue.push("s.3");
		assertEquals(queue.empty(),false);
	}
	
	@Test
	public void testQueue() {
		Queue<String> queue = new Queue<String>();
		queue.push("s.0");
		queue.push("s.1");
		queue.push("s.2");
		queue.push("s.3");
		queue.pop();
		Queue<String> solucion = new Queue<String>();
		solucion.push("s.1");
		solucion.push("s.2");
		solucion.push("s.3");
		equals(queue.equals(solucion));
	}
}
