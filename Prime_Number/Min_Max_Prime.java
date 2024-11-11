package Prime_Number;

class Min_max
{
	static int min(int sr ,int er)
	{
		
				for(int a=sr;a<=er;a++)
				
			{
					
					int no=a;
					
				boolean flag=true;
				
				for(int b=2;b<no;b++)
				
				{
					if(no%b==0)
					{
						flag=false;
						break;
					}
					
					
				}
					if(flag==true)
					{
						return no;
					}
				
			}
		return 0;
	}



	static int max(int er,int sr) 
	{
					for (int x=er;x>=sr;x--)
					{
							int nu=x;
						boolean flag=true;
						
						for(int y=2;y<nu;y++)
						{
							if(nu%y==0)
							{
								flag=false;
								break;
							}
						}
						
							if(flag==true)
							{
								return nu;
							}
					}
					return 0;
	}
}

public class Min_Max_Prime {

						public static void main(String[] args) 
						
						{
							
							int min=Min_max.min(3, 50);
							int max=Min_max.max(50, 3);
							
							System.out.println(min+max);
							
						}
	
}
