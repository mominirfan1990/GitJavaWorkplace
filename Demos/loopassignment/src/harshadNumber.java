// Harshad number if sum of given number and mod of it is equal to original number then its harshad number. 171= 171%(1+7+1)=0

import java.util.Scanner;

public class harshadNumber
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number");
		int num= sc.nextInt();
		int a=num,sum=0,rem;
		
		while(num>0)
		{
		 rem=num%10;
		 num=num/10;
		 sum=sum+rem;
		 }
		if(a%sum==0)
			System.out.println("Given number is Harshad number");
		else
			System.out.println("Given Number is Not Harshad number");
	}

}
