package StringAssignment;

import java.util.Scanner;

public class OccuranceOfChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str1  = sc.next();
		System.out.println("Enter the Character From String ");
		char ch  = sc.next().charAt(0);
		boolean flag = false;
		for(int i=0; i<str1.length(); i++)
		{
			if (str1.charAt(i)==ch)
			{
				System.out.println("First occurance of Entered char is "+ (i+1));
				flag=true;
				break;
			}
		}
		if (flag==false)
			System.out.println("Enetered character is not in string");
	}

}
