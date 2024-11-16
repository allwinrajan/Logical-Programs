package com.Array;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumPermutation {
    static int fact(int no)
	{
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact *= i;
		}
		return fact;
	}
	static int permutation(String [] string)
	{
		ArrayList<Integer> A = new ArrayList<>();
		
		for (int j = 0; j < string.length; j++) {
			String str = string[j];
			str = str.replaceAll("[aeiou]", "");
			A.add(fact(str.length()));
		}
		Collections.sort(A);
		return A.get(A.size()-1);
	}
	public static void main(String[] args) 
	{
		String [] str = {"hellllo","cbcc","aeiouu"};
		System.out.println(permutation(str));
	}
}
