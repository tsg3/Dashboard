package org.tec.algorithms.sort;

import org.tec.datastructures.LinkedList;

//Java implementation of ShellSort
public class ShellSort<V> implements Comparable<V>{
	@Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}

 @SuppressWarnings("unchecked")
public
/* function to sort arr using shellSort */
 int shellSort(LinkedList<V> list)
 {
     int n = list.length();

     // Start with a big gap, then reduce the gap
     for (int gap = n/2; gap > 0; gap /= 2)
     {
         // Do a gapped insertion sort for this gap size.
         // The first gap elements a[0..gap-1] are already
         // in gapped order keep adding one more element
         // until the entire array is gap sorted
         for (int i = gap; i < n; i += 1)
         {
             // add a[i] to the elements that have been gap
             // sorted save a[i] in temp and make a hole at
             // position i
             V temp = list.pos(i).getValue();

             // shift earlier gap-sorted elements up until
             // the correct location for a[i] is found
             int j;
             for (j = i; j >= gap && ((Comparable<V>)list.pos(j-gap).getValue()).compareTo(temp)>0; j -= gap)
            	 list.pos(j).setValue(list.pos(j-gap).getValue());

             // put temp (the original a[i]) in its correct
             // location
             list.pos(j).setValue(temp);
         }
     }
     return 0;
 }

 // Driver method
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
     System.out.println("List before sorting");
     Lista.print2();

     ShellSort<Integer> ob = new ShellSort<Integer>();
     ob.shellSort(Lista);

     System.out.println("List after sorting");
     Lista.print2();
 }
}
/*This code is contributed by Rajat Mishra */