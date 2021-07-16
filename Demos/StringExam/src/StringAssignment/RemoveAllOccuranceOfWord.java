// remove first occurrence of a word from string

package StringAssignment;

import java.util.Scanner;

public class RemoveAllOccuranceOfWord {
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
				continue;
			}
			System.out.print(sr[i]+" ");
		}
		
	}




}
