// to search all occurrences of a word in given string
package StringAssignment;

import java.util.Scanner;

public class AllOccuranceOfWord {
	public static void main(String arge[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Eneter String ");
		String s= sc.nextLine();
		System.out.println(" Eneter word ");
		String wrd=sc.next();
		String sr[] = s.split(" ");   
		for(int i=0;i<sr.length;i++)
		{
			if(wrd.equals(sr[i]))
			{
				System.out.println("Occurance of word at index is "+(i+1));
				
			}
		}
		
	}



}
