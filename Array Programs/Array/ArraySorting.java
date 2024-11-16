package com.Array;

import java.util.Arrays;

public class ArraySorting {


	/*
	 * @DeclarAnArray
	 * 
	 * #DualPivotQuickSort
	 * 
	 * @inbuild
	 * 
	 * 
	 * */
	/*Arrays.sort(target);
	 * 
	 * @Sorting by Arrayas.sort(pass the value)
	 * 
	 * expected o/p :123456 
	 * 
	 * */
	/*
	 * Arrays.toString(pass the value)
	 * 
	 * expected o/p : [1, 2, 3, 4, 5, 6] 
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		
		int [] target= {2,5,3,4,1};
		Arrays.sort(target);
		for(int i=0;i<target.length;i++)
		{
			System.out.print(target[i]+" ");
		}
		
	}
}


	

