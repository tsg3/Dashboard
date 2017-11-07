package org.tec.datastructures;

public class StackNode<V> {

	private StackNode<V> next;
	private V value;

	public StackNode<V> getNext() {
		return next;
	}
	public void setNext(StackNode<V> next) {
		this.next = next;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

}
