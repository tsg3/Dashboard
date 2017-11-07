package org.tec.datastructures;
public class LinkedListNode <V> {

	private LinkedListNode <V> next;
	private V value;

	public LinkedListNode <V> getNext() {
		return next;
	}
	public void setNext(LinkedListNode <V> next) {
		this.next = next;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
