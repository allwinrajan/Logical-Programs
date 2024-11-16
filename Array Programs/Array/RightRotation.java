package com.Array;

public class RightRotation {
	public static void rotation(int k,int [] arr) {
		k=k % arr.length;
		for (int i = 0; i < arr.length; i++) {
			if(i < k) // 3 < 3
			{
				System.out.print(arr[arr.length+i-k]+" ");// 3 4 5
			} else {          // arr[5 + 0 - 3]
				              //     l   i   k
				System.out.print(arr[i-k]+" ");
			}
		}
		System.arraycopy(arr, k, arr, k, k);
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		rotation(3, arr );
	}
}
// 1 2 3 4 5 --> 0
// 5 1 2 3 4 --> 1
// 4 5 1 2 3 --> 2
// 3 4 5 1 2 --> 3
// 2 3 4 5 1 --> 4
// 1 2 3 4 5 --> 5
// 5 1 2 3 4 --> 6
// 4 5 1 2 3 --> 7
// 3 4 5 1 2 --> 8
// 2 3 4 5 1 --> 9
// 1 2 3 4 5 --> 10

// k = k % arr.length  7 % 5 = 2
// 7
