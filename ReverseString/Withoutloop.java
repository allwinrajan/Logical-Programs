package ReverseString;



public class Withoutloop {

	static String name="Level";
	static String rev="";
	
	static void reverse(int n)
	{
		
		
		if(n>=0)
		{
			
			rev+=name.charAt(n);
			n--;
			reverse(n);
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		reverse(name.length()-1);
		
		
		
		if(name.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
		
	}
	
}
