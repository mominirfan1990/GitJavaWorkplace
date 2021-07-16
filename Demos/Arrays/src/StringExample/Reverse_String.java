package StringExample;

import java.util.Scanner;

public class Reverse_String 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter String ");
		String s= sc.nextLine();
		
		char ch[]=s.toCharArray();
		for(char x:ch)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		for(int i=ch.length-1; i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
	}
}
