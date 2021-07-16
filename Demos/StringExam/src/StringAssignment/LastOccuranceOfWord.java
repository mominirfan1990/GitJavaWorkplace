 // to find last occurrence of a word in a given string

package StringAssignment;
import java.util.*;
import java.util.Scanner;

public class LastOccuranceOfWord {
	public static void main(String arge[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Eneter String ");
		String s= sc.nextLine();
		System.out.println(" Eneter word ");
		String wrd=sc.next();
		String sr[] = s.split(" ");   
	//	char ch[]=wrd.toCharArray();
		boolean flag = false;
		int count=0;
/*		for(int i=sr.length-1;i>=0;i--)
		{
	
			for(int j=0;j<sr[i].length();j++)
			{	
				count++;
				if(sr[i].charAt(j)==ch[j])
				{
					flag=true;
				}
				else
					flag=false;
			}
			if(flag==true)
			{
				System.out.println("Word LAst index is "+(s.length()-count));
				break;
			}
			count++;
		}
*/
		for(int i=sr.length-1;i>=0;i--)
		{
			if(wrd.equals(sr[i]))
			{
				System.out.println("Occurance of word last index is "+(i+1));
				break;
			}
		}
		
//		System.out.println(s.lastIndexOf(soc)); // by using function
	}

}
