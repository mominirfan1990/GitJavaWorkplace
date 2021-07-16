package ArrayAssignment_Home_1;

import java.util.Scanner;

public class Assing_09_String 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter lenght of array");
		String sr[]= new String[sc.nextInt()];
		for(int i=0; i<sr.length; i++)
		{
			System.out.println("Please enter elemet of string array");
			sr[i]=sc.next();
		}
		for(String st:sr)
		{
			System.out.println(st+" ");
		}
		
	}

}
