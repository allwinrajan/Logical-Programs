package com.Array;

public class OccurenceOfElementInArray {
	public static int occur(int [] arr,int target) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int [] arr = {1,1,2,2,2,2,2,3,4};
		int x=1;
		System.out.println(x+" occurs "+occur(arr,x)+" times.");
	}
}
