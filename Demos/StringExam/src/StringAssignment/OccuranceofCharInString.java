package StringAssignment;

import java.util.Scanner;

public class OccuranceofCharInString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s  = sc.next();
/*		char ch[] = str.toCharArray();
		int count = 0;
		int temp=0; char ch1=' ';
		for(int i=0; i<ch.length; i++)
		{
			
			count =0;
			for(int j=0; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
					count++;
			}
			if (count>=temp)
			{
				temp=count;
				ch1=ch[i];
				System.out.println("Hieghest ferquency of  character "+ ch1 + "  is "+ temp);
			}	
		
	     }
*/	
		 int flag=0,count =1,j=0,m=0;
		 char[] chked = new char[s.length()];
		 for(int i=0; i<s.length();i++)
		 {
			 count =0;
			 for(int k =0;k<chked.length;k++)
			 {
				 if(s.charAt(i)==chked[k])
					 flag=1;
			 }
			 if(flag!=1)
			 {
				 for(j=i;j<s.length();j++)
				 {
					 if(s.charAt(i)==s.charAt(j))
					 {
						 count++;
					 }
				 }
				 chked[m]=s.charAt(i);m++;
				 System.out.println(s.charAt(i)+" occurance "+ count+ " times");
			 }
			 flag=0;
		 }
	}

}
