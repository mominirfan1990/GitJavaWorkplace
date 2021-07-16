package StringAssignment;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter String ");
		String s= sc.nextLine();
		
	/*	char ch[]=s.toCharArray();
		for(int i=ch.length-1; i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	*/	
		for(int j=s.length()-1; j>=0; j--)
		{
			System.out.print(s.charAt(j));
		}
		
		
	}
}
