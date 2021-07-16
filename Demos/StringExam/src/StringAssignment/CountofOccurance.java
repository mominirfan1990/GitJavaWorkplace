package StringAssignment;

import java.util.Scanner;

public class CountofOccurance{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str1  = sc.next();
		System.out.println("Enter the Character From String ");
		char ch  = sc.next().charAt(0);
		int count = 0;
		for(int i=0; i<str1.length(); i++)
		{
			if (str1.charAt(i)==ch)
			{
				count++;
			}
		}
		if(count ==0)
			System.out.println("character not found");
		else
			System.out.println("Number of occurance is "+count);
		
	} 
	}


