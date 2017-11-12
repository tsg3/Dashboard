package org.tec.datastructures;
public class Queue <V> {

	private QueueNode<V> front;

	public Queue (){
		front=null;
	}

	public void push (V value) {
		QueueNode<V> node = new QueueNode<V>();
		node.setValue(value);
		if (front == null)
			front = node;
		else {
			QueueNode<V> current = front;
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(node);
		}
	}

	public void pop () {
		if (front != null)
			front = front.getNext();
	}

	public V peek () {
		if (front != null)
			return front.getValue();
		else{
			return null;
		}
	}

	public boolean empty () {
		if (front == null)
			return true;
		return false;
	}
	public static void main (String[] args){
		Queue<String> queue = new Queue<String>();
		System.out.println(queue.empty());

		queue.push("s.0");
		queue.push("s.1");
		queue.push("s.2");
		queue.push("s.3");

		System.out.println(queue.empty());

		System.out.println(queue.peek());

		queue.pop();
		
		System.out.println(queue.peek());
	}
}