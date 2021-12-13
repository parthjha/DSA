package com.example;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		// -3 1 4
		// 0 3 4
		// 1 4 5

		// dushant.singh@cars24.com

		// int[] arr = { -3, -2, 2, 3, 4, 5, -9, -8 };
		int[] arr = { -3, -2, 2, 3, -5, 2, 3, 4, 5, 6, -9, -8 };
		int sum = Integer.MIN_VALUE, curr = 0;
		int start = 0,start_0 = 0, end = 0;
		for (int i = 0; i < arr.length; i++) {
			curr = curr + arr[i];
			if (sum < curr) {
				sum = curr;
				start_0=start;
				end=i;
			}
			if (curr <= 0) {
				curr = 0;
				start=i+1;
			}
		}

		System.out.println(sum);
		System.out.println(start_0 + "   " + end);

	}

}
