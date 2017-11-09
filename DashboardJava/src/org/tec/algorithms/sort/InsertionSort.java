package org.tec.algorithms.sort;

import org.tec.datastructures.LinkedList;

public class InsertionSort<V> implements Comparable<V> {
    /*public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }*/
	@SuppressWarnings("unchecked")
	public void insertionSort(LinkedList<V> list) {
        int n = list.length();
        for (int j = 1; j < n; j++) {
            V key = list.pos(j).getValue();
            int i = j-1;
            while ( (i > -1) && ( ((Comparable<V>)list.pos(i).getValue()).compareTo(key) > 0 ) ) {
            	list.pos(i+1).setValue(list.pos(i).getValue());
                i--;
            }
            list.pos(i+1).setValue(key);
        }
    }

    public static void main(String a[]){
        /*int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }  */
    	InsertionSort<Integer> iS = new InsertionSort<Integer>();
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
        System.out.println("Before Insertion Sort");
        Lista.print2();

        iS.insertionSort(Lista);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        Lista.print2();
    }
    @Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}
}