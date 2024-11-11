package Prime_Number;

public class Given_number {
	
							public static void main(String[] args) 
							{
							
								int n=8;
								
								boolean flag=true;
								
							   for(int x=2;x<n;x++)
								
							   {
								   if(n%x==0)
								   {
									   flag=false;
									   break;
								   }
								   										 
							   }
							   if(flag==true)
							   {
								   System.out.println("prime");
							   }
							   
							   else
								   System.out.println("not prime");
								
							}
	

}
