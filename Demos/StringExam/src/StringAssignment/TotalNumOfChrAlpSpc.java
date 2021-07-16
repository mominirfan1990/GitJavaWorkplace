// to find total number of alphabets, digits or special character in a string

package StringAssignment;
import java.util.Scanner;
 
public class TotalNumOfChrAlpSpc 
{
	public void CountTotal(String str)
	{
		int spcnt=0,salphcnt=0,calphcnt=0,digtcnt=0;
		char ch []=str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='0' && ch[i]<='9') // for digit ASCII
			{
				digtcnt++;
			}
			else if(ch[i]>='a' && ch[i]<='z') // for small alphabet AsCII
			{
				salphcnt++;
			}
			else if(ch[i]>='A' && ch[i]<='Z') // for Capital alphabet AsCII
			{
				calphcnt++;
			}
			else if (ch[i]>=33 && ch[i]<=47 ||ch[i]>=91 && ch[i]<=96 ||ch[i]>=58 && ch[i]<=64) // for all Special Character ASCII
			{
				spcnt++;
			}
		}
		System.out.println("No of Alphabet in Eneter String = "+ " Capital "+calphcnt+"  Small "+salphcnt);
		System.out.println("No of Digit in Entered String = "+digtcnt);
		System.out.println("No of Special Character in Entered String = "+ spcnt);
	
	}	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter String ");
		String str=sc.next();

		TotalNumOfChrAlpSpc tn = new TotalNumOfChrAlpSpc();
		tn.CountTotal(str);
	}

}
