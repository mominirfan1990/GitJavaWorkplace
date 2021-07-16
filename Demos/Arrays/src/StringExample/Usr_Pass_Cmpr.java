package StringExample;

import java.util.Scanner;

public class Usr_Pass_Cmpr 
{
	final String us ="irfanmomin";
	final String ps ="Tanveer";
	public void compare(String s1,String s2)
	{
		char usr[]= us.toCharArray();
		char pass[]=ps.toCharArray();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		boolean flag=true;
		if(ch1.length==usr.length && ch2.length==pass.length)
		{
			for(int i=0;i<ch1.length;i++)
			{
				if((int)ch1[i]!=(int)usr[i])
				{
					flag=true;
					break;
				}
				else
					flag=false;
			}
			if(flag==false)
			{
				for(int i=0;i<ch2.length;i++)
				{
					if((int) ch2[i]!=(int)pass[i])
					{
						flag = true;
						break;
					}
					else
						flag=false;
				}
				if(flag==false)
					System.out.println("valid  Username and Passward ");
				else
					System.out.println("Invalid Username or Passward  !");
			}
			else
				System.out.println("Invalid Username or Passward  !");
			
			
		}
		else
		{
			System.out.println("Invalid Username or Passsward !");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name:");
		String s1=sc.next();
		System.out.println("Enter Passward:");
		String s2=sc.next();
		Usr_Pass_Cmpr s=new Usr_Pass_Cmpr();
		s.compare(s1, s2);
		
		

	}

}
