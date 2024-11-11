package ReverseString;

public class UsingcharAt {
	public static void main(String[] args) {
		
		String name="Allwin";
		String rev="";
		
		for (int i=name.length()-1;i>=0;i--)
		
		{
		
			rev+=name.charAt(i);
			
		}
		
		System.out.println(rev);
	}

}
