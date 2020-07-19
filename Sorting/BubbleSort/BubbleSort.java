package com.akash.algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		/*
		 * 1. In-place algorithm
		 * 2. O(n^2) Time complexity
		 * 3. Algorithm degrades quickly
		 */

		int arr[] = { -15, 7, 20, 1, -2, 55, 10 };

		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int unsortedIndex = len-i;
			for(int j = 0 ; j < unsortedIndex-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp  = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
