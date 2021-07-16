package classTest7;
import java.util.Scanner;

public class Q_14FindWordFromSentenceFormed
{
	
	public void FormWord(String str,String s1)
	{
		int count =0,count1=0;
		for(int j=0; j<s1.length();j++)
		{
			count=0;
			for(int i=0; i<str.length();i++)
			{
				if(s1.charAt(j)==str.charAt(i))
				{
					count++;	
				}
			}
			if(count!=0)
			{
				count1++;
				continue;
			}
			else
				break;
		}
		if(count1==s1.length())
		{
			System.out.println(" Word = "+s1+" Yes can be formed");
		}
		else
		{
			System.out.println("Word = "+s1+" No formed");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the sentense of word ");
		String str = sc.nextLine();
		System.out.println("Eneter word to be formed ");
		String swrd = sc.next();
		Q_14FindWordFromSentenceFormed fsw = new Q_14FindWordFromSentenceFormed();
		fsw.FormWord(str,swrd );
		sc.close();
	}

}
