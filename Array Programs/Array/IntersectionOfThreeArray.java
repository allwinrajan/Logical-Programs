package com.Array;

public class IntersectionOfThreeArray {

	public static void intersection(int[]arr1,int[]arr2,int[]arr3) {
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				if(arr2[i]==arr3[j]) {
					System.out.print(arr2[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5,6};
			int [] arr2 = {1,7,4,8,3,9};
			     int [] arr3 = {7,3,9,2,8,5};
			     	intersection(arr1,arr2,arr3);
	}
}
