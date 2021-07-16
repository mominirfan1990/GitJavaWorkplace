//take input from user to enter no Y or N, if ans is Y then ask enter to N

import java.util.Scanner;

public class whileeneternobyUserY
{
	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
		
		char ans= 'y';
		int no=0;
		
		while (ans=='y'|| ans== 'Y')
		{
			System.out.println("Please eneter no");
			no = sc.nextInt();
			System.out.println("Square of given no is =" + (no*no));
			System.out.println("Do you want to continue (y/n)");
			ans= sc.next().charAt(0);
			
		}
		System.out.println("Thank you");
	}

}
