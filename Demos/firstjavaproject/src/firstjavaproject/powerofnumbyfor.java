package firstjavaproject;

import java.util.Scanner;

public class powerofnumbyfor 
{
	public static void main(String[] args)
	{
		int baseno, powerno, ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter base number  ");
		baseno = sc.nextInt();
		System.out.println("Please enter power number ");
		powerno = sc.nextInt();
		int i = powerno;
		int i1= baseno;
		
		for ( i1=baseno; i>1; )
		{
			i1= i1*baseno;
			i--;
			
		}
		System.out.println(i1);
			
	
	}

}
