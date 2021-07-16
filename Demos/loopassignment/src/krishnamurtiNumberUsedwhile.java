// krishnamurti Number uesd by while  ex. no ==145, if 1!+4!+5! = 145 then its krishnamurti number


import java.util.Scanner;

public class krishnamurtiNumberUsedwhile
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter no");
		int num= sc.nextInt();
		int A=num, sum=0;
		
		while(num>0)
		{
			int rem =num%10;
			num=num/10;
			int i = rem-1;
		
			while(i>0)
			{
				rem=rem*i;
				i--;				
			}
			sum=sum+rem;
			
		}
		if(A==sum)
		{
			System.out.println("Given number is Krushnamurti Number");
		}
		else
			System.out.println("Given number is not Krushnamurti Number");
		
		
	}
}
