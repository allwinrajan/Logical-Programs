package Palindrome;

public class Withequals {
	
	public static void main(String[] args) {
		
		
		String name="MARAm";
		
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev+=name.charAt(i);
					
		}
		
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
			
		}
	
		else
		System.out.println("Not palindrome");
	}
	

}
