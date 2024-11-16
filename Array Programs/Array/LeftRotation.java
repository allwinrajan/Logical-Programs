package com.Array;

public class LeftRotation {
	public static void rotation(int k,int [] arr) {
		k=k%arr.length;        //   2     
		for (int i = 0; i < arr.length; i++) {
			if(k < arr.length)// 5 > 5 
			{
				System.out.print(arr[k]+" ");k++;
			} else {
				System.out.print(arr[k-arr.length]+" ");//5-5=0
				k++;
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		rotation(2,arr);
	}
}
//1 2 3 4 5 --> 0
//2 3 4 5 1 --> 1
//3 4 5 1 2 --> 2
//4 5 1 2 3 --> 3
//5 1 2 3 4 --> 4
//1 2 3 4 5 --> 5
//2 3 4 5 1 --> 6
//3 4 5 1 2 --> 7
//4 5 1 2 3 --> 8
//5 1 2 3 4 --> 9
//1 2 3 4 5 --> 10


