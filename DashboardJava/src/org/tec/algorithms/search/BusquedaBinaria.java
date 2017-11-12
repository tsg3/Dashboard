package org.tec.algorithms.search;

import org.tec.algorithms.sort.BubbleSort;
import org.tec.datastructures.LinkedList;
import org.tec.datastructures.LinkedListNode;

public class BusquedaBinaria<V> implements Comparable<V> {

	@Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}

	@SuppressWarnings("unchecked")
	public int busquedaBinaria(LinkedList<V> list, V value){
		int n = list.length();
		int centro;
		int inf = 0;
		int sup = n-1;
		while (inf<=sup){
			centro=(sup+inf)/2;
			if (((Comparable<V>)list.pos(centro).getValue()).compareTo(value)==0)
				return centro;
			else if (((Comparable<V>)value).compareTo(list.pos(centro).getValue())<0)
				sup=centro-1;
			else
				inf = centro+1;
		}
		return -1;

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

		BubbleSort<Integer> bS = new BubbleSort<Integer>();
		bS.bubbleSort(Lista);
		Lista.print2();

		BusquedaBinaria<Integer> bL = new BusquedaBinaria<Integer>();
		System.out.println(bL.busquedaBinaria(Lista, 3));
		System.out.println(bL.busquedaBinaria(Lista, 45));
	}

}