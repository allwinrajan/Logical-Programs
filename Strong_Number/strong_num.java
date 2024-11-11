package Strong_Number;

public class strong_num {

	public static void main(String[] args) {
		
		int n=145,c=n,r,s=0;
		
		while(n!=0)

		{
			r=n%10;
			int f=1;
			while(r>=1)
			{
				f*=r;
				r--;
			}
			
			s+=f;
			
			n/=10;
		}
		if(c==s)
			System.out.println(c+" is Strong Number");
		
	}
	
}
