package com.revature.sort;

public class MergeSort {
	
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length < 2) {
			return;
		}
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		
		for (int i=0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int j=mid; j < arr.length; j++) {
			right[j-mid] = arr[j];
		}
		
		sort(left);
		sort(right);
		merge(arr, left, right);
	}
	
	private static void merge(int[] arr, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int count = 0;
		while(i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				arr[count++] = left[i++];
			} else {
				arr[count++] = right[j++];
			}
		}
		while(i < left.length) {
			arr[count++] = left[i++];
		}
		while(j < right.length) {
			arr[count++] = right[j++];
		}
	}
}
