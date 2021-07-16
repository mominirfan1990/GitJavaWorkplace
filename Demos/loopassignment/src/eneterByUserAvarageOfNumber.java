// eneter number asked user to enter number or not and yes show average of enter number using while number
import java.util.Scanner;

public class eneterByUserAvarageOfNumber 
{

	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
		
		char ans= 'y';
		int no=0 , i=0, sum=0;
		float avg;
		
		while (ans=='y'|| ans== 'Y')
		{
			System.out.println("Please eneter no");
			no = sc.nextInt();
		
			System.out.println("Do you want to continue (y/n)");
			ans= sc.next().charAt(0);
			sum=sum+no;
			i++;
	
		}
		avg=sum/i;
		System.out.println("Average of Enetered No is = " + avg);
	}

}


