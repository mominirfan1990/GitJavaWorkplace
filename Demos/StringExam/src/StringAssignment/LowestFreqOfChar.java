package StringAssignment;

import java.util.Scanner;

public class LowestFreqOfChar {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s  = sc.next();
     	 int flag=0,count =1,j=0,m=0;
		 char[] chked = new char[s.length()];
		 int []pos=new int[s.length()];
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
				 chked[m]=s.charAt(i);
				 pos[m]=count;
				 m++;
				 System.out.println(s.charAt(i)+" occurance "+ count+ " times");
			 }
			 flag=0;
		 }
		 int min=pos[0],comp=0;
		 for(int i=1;i<pos.length;i++)
		 {
			 if(pos[i]<min)
			 {
				 min=pos[i];
				 comp =i;
			 }
		 }
		 System.out.println("Lowest Fre. of char  "+ chked[comp] +" is "+ min );

	}



}
