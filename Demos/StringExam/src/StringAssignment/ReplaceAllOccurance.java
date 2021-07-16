package StringAssignment;

import java.util.Scanner;

public class ReplaceAllOccurance {
	public void ReplaceCharactor(String s,char old, char nw)
	{
		char ch[]=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]==old)
			{
				ch[i]=nw;
			}
		}
		for(char x:ch)
		{
			System.out.print(x);
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the String");
		String str = sc.next();
		System.out.println("Eneter Character To replace ");
		char crpl = sc.next().charAt(0);
		System.out.println("Enter new Character");
		char cnew = sc.next().charAt(0);
		
		ReplaceAllOccurance rall = new ReplaceAllOccurance();
		rall.ReplaceCharactor(str,crpl, cnew);
	}
}
