package com.String;
import java.util.Arrays;
import java.util.Scanner;
/*
 * @declare : Take two string if the each character is equals of one string  
 * 			  is equals to second string of each character
 *  
 * @Steps : Convert string into character Array because in-build method sort\
 * 		   only accept array 
 * 
 * 		   So we want convert the string into array type 
 * 
 *  	   Through that we can sort the string in ascending order
 *  
 *  	   Then compare the sorted array if its an equal then that two string is anagram
 *  
 *  	   If it's not equal then we declare the given two string is not an anagram
 *  
 *  	   Note : We must and should be convert the string to char array format 
 *  			  Because sort method only accept array
 *  
 * */
public class Check_Anagram 
{
	static Scanner reader=new Scanner(System.in);
	static boolean anagram(String input1,String input2)
	{
		
		
		if(input1.length()!=input2.length())
		
		{
			return false;
		}
		
		char[]ch=input1.toCharArray();
		char[]ch2=input2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch,ch2);
	
	}
		
	public static void main(String[] args) 
		{
			
			
			System.out.println("Enter The First String");
			String input1=reader.nextLine();//cat
			System.out.println("Enter The Two String");
			String input2=reader.nextLine();//act
			
			
			if(anagram(input1,input2))
			{
				System.out.println(input1+" & "+input2+" is Both Are Anagram");
			}
			
			
			else
			{
				System.out.println(input1+" & "+input2+" is Both Not Are Anagram");

			}
		}
		
}



