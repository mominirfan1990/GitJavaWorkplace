package classTest7;

import java.util.Scanner;

public class Q_1PalindromeString {
	
	public void findPalindrome(String str)
	{
		String sr[]=str.split(" ");
		String ck[]= new String[sr.length];
		int k=0; boolean flag=true;
		String st[]= new String[sr.length];
		for(int i=0;i<sr[i].length();i++ // array index out of bound error
		{
			flag=true;
			for(int j=0;j<(sr[i].length()/2);j++)
			{
				if(sr[i].charAt(j)==sr[i].charAt(sr[i].length()-1-j))
				{
					continue;
				}
				else
				{
					flag=false;
					break;
				}
			}
				if(flag!=false)
				{
					st[k]=sr[i];
					k++;
				}
		}
		int count=0;
		int max=st[0].length();
		for(int z=1; z<st.length; z++)
		{
			if(max<st[z].length())
			{
				max=st[z].length();
				count=z;
			}
		}
		if(count==0)
			System.out.println("longest palindrome word is "+st[0]);
		else if(count>0)
			System.out.println("longest palindrome word is "+st[count]);
	
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the sentence");
		String str=sc.nextLine();
		Q_1PalindromeString  pl = new Q_1PalindromeString();
		pl.findPalindrome(str);
		sc.close();
		
	}

}
