package com.dsandalgo.algorithm.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		BinarySearch binarySearch = new BinarySearch();
		int index = binarySearch.binarySearch(arr, 9);
		System.out.println("index : " + index);
	}

	public int binarySearch(int arr[], int x) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = (int) Math.ceil((low + high) / 2);
			if (x == arr[mid]) {

				return mid;
			}
			if (x > arr[mid]) {
				low = mid + 1;
			}
			if (x < arr[mid]) {
				high = mid - 1;
			}
		}

		return -1;
	}

}
