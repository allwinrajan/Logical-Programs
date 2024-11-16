package com.Array;

public class UniqueNumberOfArray {
	public static void unique(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag=true;
			   for (int j = 0; j < arr.length; j++) {
				  if(i!=j && arr[i]==arr[j]) {
					 flag=false;break;
				    } 
			      }
			      if(flag) {
				    System.out.print(arr[i]+" ");
			    }
		     }
	      } public static void main(String[] args) {
		      int [] arr = {1,2,3,3,4,5,5,5,8,2};
		         unique(arr);
	            }
            }