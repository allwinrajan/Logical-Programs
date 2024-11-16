package com.Array;

public class IntersectionOfArray {
	
	public static void main(String[] args) {
	
		int [] array1 = {8,1,2,3,5,6,7};
		  int [] array2 = {4,7,8,3,1};
		  	 
		  	 for (int i = 0; i < array1.length; i++) {
				 for (int j = 0; j < array2.length; j++) {
					if( array1[i] == array2[j] ) {
						System.out.print(array1[i]+" ");
					}
				}
			}		  	    
	   }
  }
