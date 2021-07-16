// print no which are odd and divisible by 3 in 1st 50 no.


public class continueused 
{
	public static void main(String[] args)
	{
	int i=0;
	
	while(i<50)
	{
		i++;
		
		if(i%2==0)    // check even no(i%2==0) if yes skip next
			continue;  
		
		if  (i%3==0) 
			          // check no is divisible by 3 then print
		System.out.println("No is =" + i);
		
	}
	}
}
