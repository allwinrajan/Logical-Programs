package com.String;

//import java.util.Set;
import java.util.TreeSet;

public class Panagram {
	public static boolean panagram(String s) {
    
		/* If there is any space In the sentence i want remove the space */		
		s = s.replaceAll(" ", "");
    
	    /*		Set<Character> input = new TreeSet<>(); /* -- Either Below Statement -- */	
		TreeSet<Character> input = new TreeSet<>();	
        /* TreeSet Will not allow duplicates as well as complete auto sort */	
		
		/*Fetch and Store all elements it in TreeSet*/
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			input.add(ch);
		}
		
		/*If after the insert each character in the treeSet the length of the treeSet is 26 then declare as PanaGram*/
		if(input.size()==26) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		String input = "abcdefghijklmnopqrstuvwxyz";
		if(panagram(input)) {
			System.out.println("Given String is Panagram");
		} else {
			System.out.println("Given String is Not An Panagram");
		}
	}
}
