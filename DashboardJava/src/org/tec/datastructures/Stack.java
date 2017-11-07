package org.tec.datastructures;
public class Stack <V> {

	private StackNode<V> top;

	public Stack (){
		top=null;
	}

	public void push (V value) {
		StackNode<V> node = new StackNode<V>();
		node.setValue(value);
		if (top == null)
			top = node;
		else {
			node.setNext(top);
			top = node;
		}
	}

	public void pop () {
		if (top != null)
			top = top.getNext();
	}

	public V peek () {
		if (top != null)
			return top.getValue();
		else{
			return null;
		}
	}

	public boolean empty () {
		if (top == null)
			return true;
		return false;
	}
	public static void main (String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.empty());

		stack.push(3);
		stack.push(10);
		stack.push(4);
		stack.push(7);

		System.out.println(stack.empty());

		System.out.println(stack.peek());

		stack.pop();
		System.out.println(stack.peek());
	}
}