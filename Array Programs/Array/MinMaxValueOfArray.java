package com.Array;

public class MinMaxValueOfArray {
   public static void findout(int [] arr) {
	   int min = arr[0];
	   for (int i = 0; i < arr.length; i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	   System.out.println("Minimum Value : "+min);
   }
	public static void main(String[] args) {
		int [] arr = {7,8,4,1,4,5,2,3};
		findout(arr);
		String str="sdfghjkl";
	}
}
