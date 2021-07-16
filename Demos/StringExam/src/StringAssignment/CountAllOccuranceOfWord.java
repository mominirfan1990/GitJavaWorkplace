// count occurrences of a word in a given string.

package StringAssignment;

import java.util.Scanner;

public class CountAllOccuranceOfWord {
	public static void main(String arge[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Eneter String ");
		String s= sc.nextLine();
		System.out.println(" Eneter word ");
		String wrd=sc.next();
		String sr[] = s.split(" ");  
		int count=0;
		for(int i=sr.length-1;i>=0;i--)
		{
			if(wrd.equals(sr[i]))
			{
				count++;
				
			}
		}
		System.out.println("count of all occurrences of a word "+count);
		
	}


}
