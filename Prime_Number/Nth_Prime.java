package Prime_Number;

public class Nth_Prime {

	
					public static void main(String[] args) {
						
						
							int n=5;
							
							int count=0;
							
							for(int a=3;a<=100000;a++)
							{
								
								   int  no=a;
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
									count++;
								}
								
								if(count==n)
								{
									System.out.println(no);
									break;
								}
								
							}
						
						
					}
	
}
