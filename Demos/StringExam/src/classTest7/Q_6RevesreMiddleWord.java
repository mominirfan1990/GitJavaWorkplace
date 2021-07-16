//Reverse middle words of a string

package classTest7;

import java.util.Scanner;

public class Q_6RevesreMiddleWord {
	public static void main(String arge[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter String ");
		String s= sc.nextLine();
		String sr[] = s.split(" ");
		for(int i=0;i<sr.length ;i++)
		{
			if(i==(sr.length-1) || i==0)
			{
				System.out.print(sr[i]+" ");	
			}
			else
			{
				char ch[]=sr[i].toCharArray();
				for(int j=ch.length-1; j>=0; j--)
				{
					System.out.print(ch[j]);
				}
				System.out.print(" ");
			}
		}
	}
}
