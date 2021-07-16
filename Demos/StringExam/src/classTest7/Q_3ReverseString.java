//reverse a given string in place? (that means without using second string)

package classTest7;

import java.util.Scanner;

public class Q_3ReverseString {
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Eneter String ");
			String s= sc.nextLine();
			
			for(int j=s.length()-1; j>=0; j--)
			{
				System.out.print(s.charAt(j));
			}
			
			
		}
	}


