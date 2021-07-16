package ArrayAssignment_1;

import java.util.Scanner;

public class AlphConver_CopyIn_2ndArray
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please eneter lenght of array");
	int lnght = sc.nextInt();
	char ch[]= new char [lnght];
	for (int i=0; i<ch.length; i++)
	{
		System.out.println("Eneter element of array");
		ch[i]= sc.next().charAt(0);
	}
	for(char x:ch)
	{
		System.out.print(x+" ");
	}
	char cd[] = new char[ch.length]; 
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]>=65 && ch[i]<= 89) // convert capital to small alphabet
		{
			cd[i]=(char)(ch[i]+32);// converted alphabet stored in copy array 
		}
		else if (ch[i]>=97 && ch[i]<= 177) // convert small to capital alpabet
		{
			cd[i]=(char)(ch[i]-32);
		}
		else
		{
			cd[i]=ch[i];
		}
	}
	System.out.println();
	for (char z:cd)
	{
		System.out.print(z+" ");
	}
	
	}

}