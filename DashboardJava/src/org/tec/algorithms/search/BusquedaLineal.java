package org.tec.algorithms.search;

import org.tec.datastructures.LinkedList;
import org.tec.datastructures.LinkedListNode;

public class BusquedaLineal<V> implements Comparable<V> {

	@Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}

	@SuppressWarnings("unchecked")
	public int busquedaLineal(LinkedList<V> list, V value){
		LinkedListNode<V> node = list.root;
		int i = 0;
		while (((Comparable<V>)value).compareTo(node.getValue())!=0){
			node = node.getNext();
			i++;
		}
		return i;
	}
	public static void main(String[] args){
		LinkedList <Integer> Lista = new LinkedList <Integer>();
		Lista.add (1);
		Lista.add (3);
		Lista.add (2);
		Lista.add (5);
		Lista.add (4);
		Lista.add (13);
		Lista.add (45);
		Lista.add (2);
		Lista.add (1);

		BusquedaLineal<Integer> bL = new BusquedaLineal<Integer>();
		System.out.println(bL.busquedaLineal(Lista, 3));
		System.out.println(bL.busquedaLineal(Lista, 45));
	}

}
