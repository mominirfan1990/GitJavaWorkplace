//method called checkReverseSum which returns true if the sum of first three numbers is equal to sum of last three numbers.

package classTest7;

import java.util.Scanner;

public class ReverseSum {

	boolean flag = false;
	int sum=0,sum1=0;
	public void checkReverseSum(String s)
	{
		char ch[]=s.toCharArray();
		if(ch.length>=3)
		{
			for(int i=0; i<3; i++)
			{
				sum=sum+ch[i]-48;
			}
			for(int j=ch.length-1;j>=ch.length-3;j--)
			{
				sum1=sum1+ch[j]-48;
			}
			
			if(sum==sum1)
			{
				flag=true;
				System.out.println(flag);
			}
			else
				System.out.println(flag);
		}
		else
			System.out.println(flag);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the Sring num ");
		String sr=sc.next();
		ReverseSum rs = new ReverseSum();
		rs.checkReverseSum(sr);
	}

}
