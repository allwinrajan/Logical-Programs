package Palindrome;

class returnPalindrome
{
	static boolean check()
	{
		String name="Madam";
		String rev="";
		
		
		for (int i=name.length()-1;i<=0;i--)
		{
			rev+=name.charAt(i);
		}
		
		if(name.equalsIgnoreCase(rev))
									return true;
		
		else
			return false;
	}
}

public class Retrun_type 
	
	{
	
	public static void main(String[] args) 
	
	{
		
		boolean result=returnPalindrome.check();
		
		if(result==true)
					{
		               System.out.println("palindrome");
		
					}              
	else
		{
			System.out.println("Not Palindrome");
		}
	}

	
	}
