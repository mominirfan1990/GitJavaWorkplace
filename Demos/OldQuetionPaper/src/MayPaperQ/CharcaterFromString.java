package MayPaperQ;

import java.util.Scanner;
import java.util.TreeSet;

public class CharcaterFromString 
{
	TreeSet<Character> tr;
	public void uniqueCharUsingBuffer(String s1, String s2)
	{
		tr=new TreeSet<>();
		
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer sb1=new StringBuffer(s2);
		for(int i=0; i<sb.length();i++)
		{
			for(int j=0;j<sb1.length();j++)
			{
				if(sb.charAt(i)==sb1.charAt(j))
				{
					tr.add(sb.charAt(i));
				}
			}
		}
		System.out.println(tr);
	}
	public void uniqueCharUsingArray(String s1, String s2)
	{
		tr=new TreeSet<>();
		
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		for(char x:a1)
		{
			for(char y:a2)
			{
				if(x==y)
				{
					if(x!=32)
					{
						tr.add(x);
					}
				}
			}
		}
		System.out.println(tr);
	}
	public void uniqueCharUsingStrMethod(String s1, String s2)
	{
		tr=new TreeSet<>();
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<s2.length(); j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					tr.add(s1.charAt(i));
				}
			}
		}
		System.out.println(tr);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter first string");
		String str1=sc.nextLine();
		System.out.println("eneter second string");
		String str2=sc.nextLine();
		
		CharcaterFromString cf = new CharcaterFromString();
	//	cf.uniqueCharUsingArray(str1, str2);
	//	cf.uniqueCharUsingBuffer(str1, str2);
		cf.uniqueCharUsingStrMethod(str1, str2);
		
		sc.close();
	}

}
