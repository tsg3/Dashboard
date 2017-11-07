package org.tec.datastructures;
public class CircularLinkedListNode <V> {

	private CircularLinkedListNode <V> next;
	private V value;

	public CircularLinkedListNode <V> getNext() {
		return next;
	}
	public void setNext(CircularLinkedListNode <V> next) {
		this.next = next;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
