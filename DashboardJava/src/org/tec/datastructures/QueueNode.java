package org.tec.datastructures;

public class QueueNode<V> {

	private QueueNode<V> next;
	private V value;

	public QueueNode<V> getNext() {
		return next;
	}
	public void setNext(QueueNode<V> next) {
		this.next = next;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

}
