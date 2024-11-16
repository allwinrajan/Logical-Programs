package com.Array;
import java.util.Scanner;

public class LexoGraphicalOrder {
	static Scanner reader = new Scanner (System.in);
	    public static void main(String[] args) {
	    	String str = "Apple";
	    	   String str2 = "Cat";
	    	
	    	
	    	if(str.compareTo(str2) > 0) {
	    		System.out.println("Not an LexoGraphicalOrder");
	    	     } if(str.compareTo(str2) < 0) {
	    		      System.out.println("LexoGraphicalOrder");
	    	           }
	   }
}
