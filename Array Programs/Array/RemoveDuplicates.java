package com.Array;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int [] array1 = {1,3,9,2,6,8,2,8,9};
		
		String str="aagsjh";
		
		char [] ch = str.toCharArray();
		
		Arrays.sort(ch);
		
		TreeSet<Integer> T = new TreeSet<>();
		
		for (int i = 0; i < array1.length; i++) 
		{
			T.add(array1[i]);
		}
		System.out.println(T);
	}
}
