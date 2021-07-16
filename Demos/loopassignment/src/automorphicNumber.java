// Automorphic number if last digit of Squre of given no is equal to given number. ex 5=25 


import java.util.Scanner;
public class automorphicNumber
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Number");
		int num= sc.nextInt();
		int a=num,c=0;
		
		num=num*num;
		c=num%10;
		
		if(a==c)
		{
			System.out.println("Given number is Automorphic Number");
		}
		else
			System.out.println("Given number is not Automorphic Number");
		
	}
}
