package Prime_Number;

public class Range_Of_Prime {

							public static void main(String[] args) 
							
							{

								for( int a=3;a<=50;a++)
								{
										int n=a;
									boolean flag=true;
									
								for(int b=2;b<n;b++)
								{
									if(n%b==0)
									{
										flag=false;
										break;
									}
								}
								if(flag==true)
								{
									System.out.print(n+" ");
								}
							}
								
						}
	
	
	
}
