package SignleToneDesignPattern;

import java.util.HashSet;
import java.util.Set;

public class Recurssion
{
	int i=-1;
	Recurssion()
	{}
	public void displaychar(String str)
	{
		i++;
		if(i<str.length())
		{
			System.out.println(str.charAt(i));
			this.displaychar(str);
		}
		
	}
	public static void main(String[] args)
	{
		Recurssion rs= new Recurssion();
		rs.displaychar("hello");
		
		StringBuffer sb= new StringBuffer("hello");
		System.out.println(sb.length());
		String str= "hello";
		
		System.out.println((str.indexOf(str.charAt(str.length()-1)))+1);
		
	}

}
