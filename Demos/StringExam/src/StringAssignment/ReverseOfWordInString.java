package StringAssignment;

import java.util.Scanner;

public class ReverseOfWordInString //reverse in between words only 
{
	public static void main(String arge[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter String ");
		String s= sc.nextLine();
		String sr[] = s.split(" ");
		
		for(int i=sr.length-1; i>=0 ;i--)
		{
			System.out.print(sr[i]+" ");
			
		}
	
	}
}

