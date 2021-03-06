package org.tec.algorithms.sort;

import org.tec.datastructures.LinkedList;

public class SelectionSort<V> implements Comparable<V> {

	@SuppressWarnings("unchecked")
	public void selectionSort(LinkedList<V> list){
    for (int i = 0; i < list.length() - 1; i++)
    {
        int index = i;
        for (int j = i + 1; j < list.length(); j++){
            if (((Comparable<V>)list.pos(j).getValue()).compareTo(list.pos(index).getValue())<0){
                index = j;//searching for lowest index
            }
        }
        V smallerNumber = list.pos(index).getValue();
        list.pos(index).setValue(list.pos(i).getValue());
        list.pos(i).setValue(smallerNumber);
    }
}

    public static void main(String a[]){

    	SelectionSort<Integer> sS = new SelectionSort<Integer>();
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
        System.out.println("Before Selection Sort");
        Lista.print2();

        sS.selectionSort(Lista);//sorting array using selection sort

        System.out.println("After Selection Sort");
        Lista.print2();
    }
    @Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}
}