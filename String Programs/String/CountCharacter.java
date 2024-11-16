package com.String;

public class CountCharacter {
	
	static int countword(String str) {
		str=str.replaceAll(" ", "");
		return str.length();
	}
	public static void main(String[] args) {
		String str = "I am AllwinRajan";
		System.out.println(countword(str));
	}

}
