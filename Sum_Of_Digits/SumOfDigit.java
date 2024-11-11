package SumOfDigits;

import java.util.Scanner;

public class SumOfDigit {
	
	static Scanner reader = new Scanner (System.in);
	
	static int sumofdigit(int input)
	{
		   int sum=0;
		while(input!=0)
		{
			int r=input%10;
			sum+=r;
			input/=10;
		}
		return sum;
	}	
		public static void main(String[] args) 
		{
			System.out.println("Enter the number");
			int input=reader.nextInt();
			System.out.println("Sum Of the Each Digit is : "+sumofdigit(input));
		}
	
}
