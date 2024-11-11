package ReverseString;

public class WithoutcharAt {

	public static void main(String[] args) {
		
		String name="Allwin";
		
		char [] ch=name.toCharArray();
		
		for (int x=ch.length-1;x>=0;x--)
		{
			System.out.print(ch[x]);
		}
		
	}
}
