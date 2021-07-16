package StringAssignment;

import java.util.Scanner;

public class RemoveAllRepeated {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str1  = sc.next();
		char chr[]= str1.toCharArray();
		char chek[] = new char[chr.length]; int j=0;
		boolean flag=false;
		for(int i=0; i<chr.length; i++)
		{
			flag=false;
			for(int k=0;k<chr.length;k++)
			{
				if(i!=k)
				{
					if (chr[i]==str1.charAt(k))
					{
						flag=true;
						break;	
					}
				}
				
			}
			if(flag!=true)
			{
				chek[j]=chr[i];
				j++;
			}
		}
		for(int k=0; k<chek.length;k++)
		{
			System.out.print(chek[k]);
		}

		
	}

}
