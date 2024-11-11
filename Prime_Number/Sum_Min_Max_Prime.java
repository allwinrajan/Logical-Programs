package Prime_Number;

public class Sum_Min_Max_Prime {

	
	static int minprime(int s, int e)
	{
		
		for (int x = s ; x <= e ; x++)
		{
				
			     boolean flag=true;
			
			for (int y = 2 ; y < x ; y++)
			{
				if( x % y == 0)
				{
					flag=false;break;
				}
				
				if(flag==true)
				{
					return x;
				}
			}
		}
		return 0;
	}

	static int maxprime(int s,int e)
	{
		
		for(int x = s ; x >= e ; x-- )
		{
			
				boolean flag=true;
			for(int y = 2 ; y < x ; y++ )
			{
				if(x % y == 0)
				{
					flag=false;break;
				}
				
				if(flag==true)
				{
					return x;
				}
			}
		}
		return 0;
	}


	public static void main(String[] args) {

		
		int x=minprime( 3 , 50 );
		int y=maxprime( 50 , 3 );
		
		System.out.println(x+y);
//		System.out.println(y);
	
	
	
	}
	
	
	
}
