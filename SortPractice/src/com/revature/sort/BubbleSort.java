package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length - 1; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (arr[j] > arr[j+1]) { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            }
        }
	}
}
