//reverse of eneterd no

import java.util.Scanner;

public class reverseNoUsingFor 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Please Enter No.");
		int no= sc.nextInt();
		
		for (  ; no>0 ;no = no/10 )
		{
			int rem = no%10;
			System.out.print(rem);
			
			
			
		}
		
		
		
	}

}
