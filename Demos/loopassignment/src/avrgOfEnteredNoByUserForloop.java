// entered number by user asking y/n and print avrg of number using for loop

import java.util.Scanner;

public class avrgOfEnteredNoByUserForloop 
{
	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
		char ans= 'y';
		float avg;
		int sum=0, i=0;
		
		for ( int no=0 ; ans=='y' || ans == 'Y'; i++ )
		{
			
			System.out.println("Please eneter no");
			no = sc.nextInt();
		
			System.out.println("Do you want to continue (y/n)");
			ans= sc.next().charAt(0);
			sum=sum+no;
				
		}
		avg=sum/i;
		System.out.println("Average of Enetered No is = " + avg);
	}

}
