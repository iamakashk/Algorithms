package com.akash.algorithms;

import java.util.Arrays;
/* Akash Kamble*/
public class SelectionSort {

	public static void main(String[] args) {
		/**
		 * 1. It is called selection sort because we select the max/min and push it 
		 * to end/start.
		 * 2. In-place algorithm( does not require any extra space )
		 * 3. O(n^2) time complexity - quadratic
		 * 4. Does not require much swapping like bubble sort.
		 * 5. Unstable algorithm
		 */
		
		int arr[] = { 20, 35, -15, 2, -22, 55, 1 };

		for (int unsortedIndex = arr.length - 1; unsortedIndex >= 0; unsortedIndex--) {

			int largestIndex = 0;
			for (int j = 0; j <= unsortedIndex; j++) {
				if (arr[largestIndex] < arr[j]) {
					largestIndex = j;
				}
			}
			swap(arr, unsortedIndex, largestIndex);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int arr[], int unsorted, int largest) {
		if (unsorted == largest) {
			return;
		}
		int temp = arr[largest];
		arr[largest] = arr[unsorted];
		arr[unsorted] = temp;
	}

}
