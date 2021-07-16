package StringAssignment;

import java.util.Scanner;

public class VowelsAndConsonateInString {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter String ");
		String s= sc.nextLine();
		int count =0,count2=0;
		char ch[]=s.toCharArray();
		for(char x:ch)
		{
			if(x=='a' || x=='e' ||  x== 'i' || x== 'o' || x== 'u')
			{
				count ++;
			}
			else if (x>=65 && x<=89 || x>=97 && x<=177)
			{
				count2++;
			}
		}
		System.out.println("Number of Vowels are "+count);
		System.out.println("Number of Constant are "+count2);
		
	}
}
