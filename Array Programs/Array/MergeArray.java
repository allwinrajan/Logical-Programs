package com.Array;


import java.util.TreeSet;

public class MergeArray {
	
  public static Object array(int [] arr1 ,int [] arr2) {
	int [] arr3 = new int [ arr1.length + arr2.length ];
		
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		  System.arraycopy(arr2, 0, arr3,arr1.length , arr2.length);
		  
		     TreeSet<Object> t = new TreeSet<>();
		
		        for(int x : arr3) {
			                       t.add(x);
		                                    } return t;
	}
	public static void main(String[] args) {
     int [] arr1 = {6,8,3,5,6,2,1,1,0};
      int [] arr2 = {16,18,13,15,16,12,11,10};
	   System.out.println(array(arr1,arr2));
		}
}
