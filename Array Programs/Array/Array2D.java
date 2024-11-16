package com.Array;

import java.util.Iterator;

public class Array2D {

	static {
		System.out.println("---> Fetch array");
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static {
		System.out.println("---> Flexible array");
		int[][] arr = { { 1, 2, 3, 4, 5, 6 }, { 4, 5, 6, 5, 4, 3, }, { 7, 8, 9, 4, 2, 4 } };

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println(sum);
		}
	}

	static {
		System.out.println("---> 90 degree right ");
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				if (i == j)
					System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	static {
		System.out.println("---> Diaganol array");
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int DAS = 0;
		for (int i = 0; i < arr.length; i++) {
			DAS += arr[i][i];
		}
		System.out.println(DAS);
	}

	static {
		System.out.println("---> Anti - Diaganal array");
		int[][] arr = { { 1, 2, 4 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int DAS = 0;
		for (int i = 0; i < arr.length; i++) {
			DAS += arr[i][arr.length - 1 - i];
		}
		System.out.println(DAS);
	}

	public static void main(String[] args) {

	}
}
