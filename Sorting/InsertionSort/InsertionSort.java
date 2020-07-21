package com.akash.algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		/*
		 * 1. In-place algorithm
		 * 2. O(n^2) time complexity
		 * 3. Stable Algorithm 
		 */
		int[]  arry = {20,35,-1,55,0,400};
		
		for(int i = 0 ; i < arry.length; i++) {
			int value = arry[i];
			int hole = i;
			while( hole > 0 && arry[hole-1] > value) {
				arry[hole] = arry[hole-1]; // copying to next element because it is larger
				hole = hole-1;
			}
			arry[hole] = value;
		}
		System.out.println(Arrays.toString(arry));
	}

}
