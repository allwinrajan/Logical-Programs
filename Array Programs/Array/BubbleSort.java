package com.Array;

import java.util.Arrays;

public class BubbleSort {

	
	static int[] bubblesort(int[]input)
		{
			for (int i = 0; i < input.length; i++) 
			{
				for (int j = 0; j < input.length-1-i; j++) 
				{
					if(input [ j ] > input[ j+1 ])
					{
						int temp = input [ j ];
						input[ j ] = input [ j+1 ];
						input [ j+1 ] = temp;
					}
				}
			} 
			
			return input; 
		}
	
		public static void main(String[] args) 
		{	
				         int [] arr= {5,4,3,2,1};
				System.out.println(Arrays.toString(bubblesort(arr)));
		}

}

/* Bubble sort algorithm : 
 * 
 * @ declare : If we want to sort array without sorting in-build method we use bubble sort algorithm
 * 
 * @ Agenda :Once we get the max position we won't want to compare next value
 * 			Then decrement
 * 
 * 			--->Iteration will be based on the array length	
 * 			--->When first iteration complete i want decrement comparison
 * 			
 * @step1 : if the first index value more than next index value we implement the swap two integer method
 * 			Through that we keep move on the process till getting that elements max index value
 * 
 * @step2 : Once the it will get reach the max index value we apply the same process to the other elements till getting 
 * 			their sorted format
 * 
 *			                     0 1 2 3 4	--->index value
 *								|5|4|3|2|1| 
 *								 ^
 *								|4|5|3|2|1|	
 *								   ^
 *								|4|3|5|2|1|			^  <---> it will declare the increment 
 *									 ^				*  <----> it will declare that element get reach that place
 *								|4|3|2|5|1|
 *									   ^
 *								|4|3|2|1|'5'|--->1 iteration complete because 5 getting that place
 *								 ^        *
 * 								|3|4|2|1|5|
 * 								   ^
 * 								|3|2|4|1|5|
 * 								     ^
 * 								|3|2|1|'4'|5|--->2 iteration complete because 4 getting that place
 * 								 ^      *
 * 								|2|3|1|4|5|
 * 								   ^
 * 								|2|1|'3'|4|5|--->3 iteration complete because 3 getting that place
 * 								 ^	  *
 * 								|'1'|'2'|3|4|5|--->4 iteration complete because 2 & 1 getting that place 
 * 								  *   *	
 * 					
 * 	
 * */

/*								{5,4,3,2,1}

			for( i = 0 ; i < arr.length ; i++) // number of iteration
			{
				for ( j = 0; j < arr.length-1-i; j++) // comparison
				{
					if(0th index > 1th index value) // first index value greater than next value we apply swap
					{
						SWAP THE ELEMENT INSIDE THE INDEX VALUE
					}
				}
			}


*/