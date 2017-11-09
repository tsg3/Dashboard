package org.tec.algorithms.sort;

import org.tec.datastructures.LinkedList;

/* Java program for Merge Sort */
public class MergeSort<V> implements Comparable<V>
{
	@Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}
    @SuppressWarnings("unchecked")
	// Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(LinkedList<V> list, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        LinkedList<V> L = new LinkedList<V>();
        LinkedList<V> R = new LinkedList<V>();

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L.add(list.pos(l+i).getValue());
        for (int j=0; j<n2; ++j)
            R.add(list.pos(m+1+j).getValue());


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (((Comparable<V>)L.pos(i).getValue()).compareTo(R.pos(j).getValue())<=0)
            {
                list.pos(k).setValue(L.pos(i).getValue());
                i++;
            }
            else
            {
            	list.pos(k).setValue(R.pos(j).getValue());
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
        	list.pos(k).setValue(L.pos(i).getValue());
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
        	list.pos(k).setValue(R.pos(j).getValue());
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(LinkedList<V> list, int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(list, l, m);
            sort(list , m+1, r);

            // Merge the sorted halves
            merge(list, l, m, r);
        }
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

        System.out.println("Given List");
        Lista.print2();

        MergeSort<Integer> ob = new MergeSort<Integer>();
        ob.sort(Lista, 0, Lista.length()-1);

        System.out.println("\nSorted List");
        Lista.print2();
    }
}
/* This code is contributed by Rajat Mishra */