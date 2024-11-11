package Prime_Number;

public class Next_Prime {
	
	static int prime() {
	
	int n=5;
	for (int i=n+1;i<10000;i++)
	{
		int no=i;
		boolean flag=true;
	for(int j=2;j<no;j++)
		{
			if(no%j==0)
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

							public static void main(String[] args) 
							{
							
								int num=prime();								
								System.out.println(num);
						 }
	
	
	
	
}
