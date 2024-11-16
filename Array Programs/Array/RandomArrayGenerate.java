package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArrayGenerate 
{
	static Scanner reader=new Scanner(System.in);
		public static void main(String[] args) 
		{
				  
					System.out.println("Enter The Array Size");
					int size = reader.nextInt();
					int [] arr = new int [size];
					for (int i = 0; i < arr.length; i++) 
					{
					 System.out.println("Enter the Values");
					 int value=reader.nextInt();
					 arr[i]=value;
					}
			System.out.println(Arrays.toString(arr));
	    }
}
