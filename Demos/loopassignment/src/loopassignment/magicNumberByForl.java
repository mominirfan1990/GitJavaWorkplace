
package loopassignment;

import java.util.Scanner;
public class magicNumberByForl 
{

	public static void main(String[] args)
	{
		int magicnum=55, i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pease enter number");
		
		for(i=0;i<7;i++)
		{
			j=sc.nextInt();
			int diff = j-magicnum;
			
			if(diff>4)
				System.out.println("Entered number is greather than magic number");
			else if (diff<=-4)
				System.out.println("Entered Number is lessor than magic number");
			else if ((diff!=0) && (diff<4) && (diff >-4))
				System.out.println("You are near to Magic Number");
			else if (diff==0)
				System.out.println("You got a Magic Number");
				
		}
		System.out.println("You over with your trials better luck next time");
			
	}
}
