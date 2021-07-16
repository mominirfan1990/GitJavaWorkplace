package classTest7;

import java.util.Scanner;

public class Q_8_SortStringByLenght {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter String ");
		String s= sc.nextLine();
	 
		String str[]=s.split(" ");
		String s1 [] =new String[s.length()];
		String max=str[0];
		
		for(int i=0; i<str.length-1; i++)
		{
			for(int j=0; j<str.length-1-i; j++)
			{
				if(str[j].length()>str[j+1].length())
				{
					s1[j]=str[j];
					str[j]=str[j+1];
					//s1[j+1]=s1[j];
				
				}	
			}
		}
		for(String sx:s1)
		{
			System.out.print(sx);
		}
				
	}

}
