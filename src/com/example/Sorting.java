package com.example;

public class Sorting {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 3, 4, 6, 10, 1, 7, 0, 45, -1 };
		System.out.println("  ----------Before sorting -------");
		for (int i = 0; i < arr.length; i++)
			System.out.print("  " + arr[i]);

		// bubbleSort(arr);
		// selectionSort(arr);
		// insertionSort(arr);
		//topological sort.
		//quick sort
		mergeSort(arr);

		System.out.println("\n  ----------After sorting -------");
		for (int i = 0; i < arr.length; i++)
			System.out.print("  " + arr[i]);
	}

	private static int[] mergeSort(int arr[]) {

		System.out.println("\n  ----------Merge sorting -------");

		int low = 0;
		int high = arr.length - 1;

		mergeSorting(arr, low, high);

		return arr;
	}

	private static void mergeSorting(int arr[], int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;
			mergeSorting(arr, low, mid);
			mergeSorting(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}

	}

	private static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	private static int[] insertionSort(int arr[]) {
		System.out.println("\n  ----------Insertion Sort -------");
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (val > arr[j]) {
					int temp = val;
					val = arr[j];
					arr[j] = temp;
				}
			}
			arr[i] = val;
		}
		return arr;
	}

	private static int[] selectionSort(int arr[]) {
		System.out.println("\n  ----------Selection Sort -------");
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
		return arr;
	}

	private static int[] bubbleSort(int arr[]) {
		System.out.println("\n  ----------Bubble Sort -------");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

//	private static int[] shellSort(int arr[]) {
//		System.out.println("\n  ----------Insertion Sort -------");
//		for (int i = 0; i < arr.length; i++) {
//			int val = arr[i];
//			for (int j = i + 1; j < arr.length; j++) {
//				if (val > arr[j]) {
//					int temp=val;
//					val = arr[j];
//					arr[j]=temp;
//				}
//			}
//			arr[i] = val;
//		}
//		return arr;
//	}
}
