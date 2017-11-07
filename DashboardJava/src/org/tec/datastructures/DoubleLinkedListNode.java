package org.tec.datastructures;
public class DoubleLinkedListNode <V> {

	private DoubleLinkedListNode <V> next;
	private DoubleLinkedListNode <V> prev;
	private V value;

	public DoubleLinkedListNode <V> getNext() {
		return next;
	}
	public void setNext(DoubleLinkedListNode <V> next) {
		this.next = next;
	}
	public DoubleLinkedListNode <V> getPrev() {
		return prev;
	}
	public void setPrev(DoubleLinkedListNode <V> prev) {
		this.prev = prev;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
