package ArrayAssignment_1;

import java.util.Scanner;

public class Find_Index_Choose_Num {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter lenght of array");
		int a= sc.nextInt();
		char ch[] = new char[a];
		for(int i=0; i<ch.length; i++) // accept array element
		{
			System.out.println("Eneter element of Array");
			ch[i]=sc.next().charAt(0);
		}
		for(char x:ch)				// display array
		{
			System.out.print(x+" ");
		}
		System.out.println("Please choose alphabet from above array ");
		char s = sc.next().charAt(0);
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]==s)
			{
				System.out.println("Alphabet "+ch[i]+ "  at "+i+"  Index");
			}
		}
	}

}
