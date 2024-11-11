package Reverse_Each_Word;

import java.util.Scanner;

public class Reverse_word {
	static Scanner reader = new Scanner (System.in);
	static String Reverse(String S)
	{
				String res="";
		
		for (int i = S.length()-1; i >= 0 ; i--) 
		{
			res+=S.charAt(i);
		}
		return res+" ";
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		String input = reader.nextLine();
		String [] str = input.split(" ");
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(Reverse(str[i]));
		}
	}
}
