//entered no is palindrom or not

import java.util.Scanner;
public class palindrom
{
	public static void main(String[] args)
	{
		int no,rem=0,rev=0,original=0,old;
		Scanner sc=new Scanner (System.in);
		System.out.println("Please Enter No.");
		no= sc.nextInt();
		 
		old=no;
		
		while(no>0)
		{
			rem = no%10;
			System.out.print(rem);
			original=(original*10)+rem;
			no = no/10;
			
					
		}
		System.out.print(" ");
		System.out.println("");
		
		if(old==original)
		{
			System.out.println("enetered no is palindrome");
		}
		else
			System.out.println("enetered no is not palindrome");
		
		
	}

}
