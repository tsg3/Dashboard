package org.tec.benchmark;

import org.perfidix.annotation.Bench;
import org.tec.algorithms.sort.BubbleSort;
import org.tec.algorithms.sort.InsertionSort;
import org.tec.algorithms.sort.MergeSort;
import org.tec.algorithms.sort.QuickSort;
import org.tec.algorithms.sort.SelectionSort;
import org.tec.algorithms.sort.ShellSort;
import org.tec.datastructures.LinkedList;

public class Sort {

	@Bench
	public void BubbleSort() {
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
        bS.bubbleSort(Lista);
	}

	@Bench
	public void InsertionSort() {
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
        iS.insertionSort(Lista);
	}

	@Bench
	public void MergeSort() {
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
        MergeSort<Integer> ob = new MergeSort<Integer>();
        ob.sort(Lista, 0, Lista.length()-1);
	}

	@Bench
	public void QuickSort() {
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
	     QuickSort<Integer> ob = new QuickSort<Integer>();
	     ob.sort(Lista, 0, n-1);
	}

	@Bench
	public void SelectionSort() {
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
        sS.selectionSort(Lista);//sorting array using selection sort
	}

	@Bench
	public void ShellSort() {
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
     ShellSort<Integer> ob = new ShellSort<Integer>();
     ob.shellSort(Lista);
	}

}
