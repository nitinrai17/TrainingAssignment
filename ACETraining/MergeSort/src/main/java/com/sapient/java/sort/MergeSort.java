package com.sapient.java.sort;

import java.util.Arrays;

public class MergeSort {

	private int arr[];
	private int tmp[];
	private int length;

	private void merge(int lowerIndex, int midIndex, int highIndex) {
		int i = lowerIndex;
		int j = midIndex + 1;
		int k = highIndex;
		while (i <= midIndex && j <= highIndex) {
			if (tmp[i] < tmp[j]) {
				arr[k] = tmp[i];
				i++;
			} else {
				arr[k] = tmp[j];
				j++;
			}
			k++;
		}
		while (i <= midIndex) {
			arr[k] = tmp[i];
			i++;
			k++;
		}
		while (j <= highIndex) {
			arr[k] = tmp[i];
			j++;
			k++;
		}
	}

	private void doMerge(int lowerIndex, int highIndex) {
		if (lowerIndex < highIndex) {
			int midIndex = lowerIndex + ((highIndex - lowerIndex) / 2);
			doMerge(lowerIndex, midIndex);
			doMerge(midIndex + 1, highIndex);
			merge(lowerIndex, midIndex, highIndex);
		}
	}
	
	private void sort(int []arrayInput){
		this.arr=arrayInput;
		this.length=arrayInput.length;
		this.tmp = new int[length];
		doMerge(0,length-1);		
	}
	
	public static void main(String[] args) {
		int[] arrayInput= {33,23,98,45,62,85,45,31,78};
		new MergeSort().sort(arrayInput);
		Arrays.toString(arrayInput);
	}

}
