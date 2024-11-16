package com.Array;

public class RemoveAdjecentWord {

    static boolean adjecent(String s1,String s2) {
		/*If Two string are equal return back the value as false*/
    	/*If Two string are not equal return back the value as true*/
    	return !s1.equals(s2);
	}
	
	public static void main(String[] args) {
		//        0  1   2   3   4   5
	String s1 = "hi how how are are you";
	/* Convert the string into string array */
	String [] s2 = s1.split(" ");
	
	   for (int i = 0; i < s2.length-1; i++) 
	    {
		  if(adjecent(s2[i],s2[i+1])) 
		 {
		/*If Two string are not equal print the current string */
	   /* i --> will hold the current value */
			System.out.print(s2[i]+" ");
		 }
	   }
	   /*later manually we print last String at any term*/
    	System.out.print(s2[s2.length-1]);
   }
}
