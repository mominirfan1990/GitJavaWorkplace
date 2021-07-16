package StringExample;

import java.util.Scanner;

class Searh
{
	final private String us ="irfan";
	final private String ps ="irfan123";
	
	public void compare(String s1,String s2)
	{
		char usr[]= us.toCharArray();
		char pass[]=ps.toCharArray();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		boolean flag=true;
		if(ch1.length==usr.length && ch2.length==pass.length)
		{
			for(int i=0,j=0;   ; j++,i++)
			{
				if(i<ch1.length)
				{
					if(ch1[i]!=usr[i])
					{
						flag=true;
						break;
					}
					else	
						flag=false;
				}
				
				else if(i<ch2.length)
				{
					if(ch2[j]!=pass[j])
					{
						flag=true;
						break;
					}
					else	
						flag=false;
				}
				else
					break;
			}
			if(flag==false)
				System.out.println("valid  Username and Passward ");
			else
				System.out.println("Invalid Username or Passward  !");	
		}
		else
			System.out.println("Invalid Username or Passsward !");
	}
}
public class User_Pass_singleFor
{
		public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name:");
		String s1=sc.next();
		System.out.println("Enter Passward:");
		String s2=sc.next();
		Searh s=new Searh();
		s.compare(s1, s2);

	}


}
