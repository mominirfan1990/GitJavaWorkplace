package classTest7;

import java.util.Scanner;

public class Q_13CommonCharInString {

	public void commanChar(String str1, String str2)
	{
		char [] arr1=str1.toCharArray();
		char [] arr2=str2.toCharArray();
		char [] temp= new char[50];
		int k=0;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(arr2[j]!=0 && arr2[j]!=' ')
					{
						temp [k]=arr2[j];
						k++;
					}
				}
			}
		}		 
		for(int i=0; i<(temp.length-1); i++)
		{
			for(int j=0; j<(temp.length-1-i);j++)
			{
				if(temp[j]>temp[j+1])
				{
					char tp= temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=tp;
				}
			}
		}
		for(char x:temp)
		{
			System.out.print(x);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the 1st string ");
		String s1= sc.nextLine();
		System.out.println("Eneter the 2nd String ");
		String s2= sc.nextLine();
		Q_13CommonCharInString scom = new Q_13CommonCharInString();
		scom.commanChar(s1, s2);
		sc.close();
	}

}
