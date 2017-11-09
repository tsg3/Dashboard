package org.tec.algorithms.sort;

import org.tec.datastructures.LinkedList;

//Java program for implementation of QuickSort
public class QuickSort<V> implements Comparable<V>
{
	@Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}
 @SuppressWarnings("unchecked")
/* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
 int partition(LinkedList<V> list, int low, int high)
 {
     V pivot = list.pos(high).getValue();
     int i = (low-1); // index of smaller element
     for (int j=low; j<high; j++)
     {
         // If current element is smaller than or
         // equal to pivot
         if (((Comparable<V>)list.pos(j).getValue()).compareTo(pivot)<=0)
         {
             i++;

             // swap arr[i] and arr[j]
             V temp = list.pos(i).getValue();
             list.pos(i).setValue(list.pos(j).getValue());
             list.pos(j).setValue(temp);
         }
     }

     // swap arr[i+1] and arr[high] (or pivot)
     V temp = list.pos(i+1).getValue();
     list.pos(i+1).setValue(list.pos(high).getValue());
     list.pos(high).setValue(temp);

     return i+1;
 }


 /* The main function that implements QuickSort()
   arr[] --> Array to be sorted,
   low  --> Starting index,
   high  --> Ending index */
 void sort(LinkedList<V> list, int low, int high)
 {
     if (low < high)
     {
         /* pi is partitioning index, arr[pi] is
           now at right place */
         int pi = partition(list, low, high);

         // Recursively sort elements before
         // partition and after partition
         sort(list, low, pi-1);
         sort(list, pi+1, high);
     }
 }

 // Driver program
 public static void main(String args[])
 {
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
     int n = Lista.length();
     Lista.print2();

     QuickSort<Integer> ob = new QuickSort<Integer>();
     ob.sort(Lista, 0, n-1);
     System.out.println("sorted array");
     Lista.print2();
 }
}
/*This code is contributed by Rajat Mishra */