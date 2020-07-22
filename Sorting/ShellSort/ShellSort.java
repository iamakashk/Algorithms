package com.akash.algorithms;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int arr[] = {20,35,-15,7,55,1,-22};
		
		for(int gap = arr.length/2 ; gap > 0 ; gap--) {
			
			for(int j = gap; j < arr.length; j++) {
				int value = arr[j];
				int hole = j;
				while(hole >= gap && arr[hole-gap] > value) {
					arr[hole] = arr[hole-gap];
					hole = hole-gap;
				}
				arr[hole] = value;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
