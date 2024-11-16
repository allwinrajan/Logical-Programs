package com.String;

public class CountWord {

	static int count(String str) {
		String [] rev = str.split(" ");
		return rev.length;
	}
	public static void main(String[] args) {
		String str = "This Is a Example String Taken";
		System.out.println(count(str));
	}
}
