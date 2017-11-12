package org.tec.algorithms.sort;

import org.tec.datastructures.LinkedList;
import org.tec.datastructures.LinkedListNode;

public class BubbleSort<V> implements Comparable<V>{
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
     @SuppressWarnings("unchecked")
	public void bubbleSort(LinkedList<V> list) {
        int n = list.length();
        LinkedListNode<V> temp = new LinkedListNode<V>();
        LinkedListNode<V> tempj;
        LinkedListNode<V> tempj2;
     	for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(((Comparable <V>)list.pos(j-1).getValue()).compareTo(list.pos(j).getValue())>0){
                	tempj = list.pos(j-1);
                	tempj2 = list.pos(j);
                	temp.setValue(tempj.getValue());
                	tempj.setValue(tempj2.getValue());
                	tempj2.setValue(temp.getValue());
                }
            }
        }
    }
    public static void main(String[] args) {
    	BubbleSort<Integer> bS = new BubbleSort<Integer>();
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

        System.out.println("Array Before Bubble Sort");
        Lista.print2();

        bS.bubbleSort(Lista);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        Lista.print2();


        }
	@Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}
}