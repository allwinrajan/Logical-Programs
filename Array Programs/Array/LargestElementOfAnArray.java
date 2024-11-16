package com.Array;

import java.util.Arrays;

public class LargestElementOfAnArray {
	
	static int Largest(int [] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public static void main(String[] args) {
		int [] arr = {9,4,2,5,8,3,1};
		System.out.println(Largest(arr));
	}

}
