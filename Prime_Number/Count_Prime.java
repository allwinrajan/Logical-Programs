package Prime_Number;

public class Count_Prime {

	
	
				static int countprime(int s ,int e)
				{
								int count=0;
						for ( int x = s ; x <= e ; x++ )
						{
								 boolean flag=true;
							for( int y = 2 ; y < x ; y++ )
							{
								if( x % y == 0)
								{
									flag=false;
								}
							}
							
							if(flag==true)
							{
								count++;
							}
						
						}
						
					 return count;
				}
						
				
				public static void main(String[] args) 
				
				{
					
						int x=countprime(2,10);
						
						System.out.println(x);
					
				}
				
				
				
}
