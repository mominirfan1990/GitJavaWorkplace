package StringAssignment;

import java.util.Scanner;

public class CompareTwoString {
		
			public void compare(String s1,String s2)
			{
				char ch1[]=s1.toCharArray();
				char ch2[]=s2.toCharArray();
				boolean flag=true;
				if(ch1.length==ch2.length)
				{
					for(int i=0;i<ch1.length;i++)
					{
						if(ch1[i]!=ch2[i])
							flag=true;
						else
							flag=false;
					}
					if(flag==false)
						System.out.println("Strings are equals!");
					else
						System.out.println("String are not equal!");
					
				}
				else
				{
					System.out.println("String are not equal!");
				}
			}

			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter 1st word:");
				String s1=sc.next();
				System.out.println("Enter 2nd word:");
				String s2=sc.next();
				CompareTwoString s=new CompareTwoString();
				s.compare(s1, s2);
				
				

			}

		}


