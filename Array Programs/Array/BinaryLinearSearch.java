package com.Array;

public class BinaryLinearSearch {
	
	public static void main(String[] args) 
	{
		int [] n= {5,6,7,8,9,10,11,12};
		int target=12;
		int result1=linearSearch(n,target);
		int result2=binarySearch(n,target);
		
		if(result1!=-1)
		             System.out.println("Element found in index in linear : "+result1);
		else
			System.out.println("Element is not found in array");
		
		if(result2!=-1)
            System.out.println("Element found in index in Binary : "+result2);
        else
	        System.out.println("Element is not found in array");
	}

	public static int linearSearch(int[] n, int target) 
	{
			int step = 0;
		for (int i = 0; i < n.length; i++) 
		{
               step++; //it will count the number of times the loop will run
			if(n[i]==target)
			{
				System.out.println("Steps Taken by Linear : "+step);
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] n, int target) 
	{
		//5,6,7,8,9
		int step = 0;
		int left=0;
		int right=n.length-1;
		
		while(left <= right)
		{
			step++; //whenever the loop will get passed
			int mid=(left+right)/2;
			
			if(n[mid]==target)
			{
				System.out.println("Steps Taken by Binary : "+step);
				return mid;
				
			}
			else if(n[mid] < target)
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
			
		}
		return -1;
	}
}
