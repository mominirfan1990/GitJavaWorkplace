package StringExample;

import java.util.Scanner;

class StringNum
{
	public void findNum(String s)
	{
		char ch[]= s.toCharArray();
	/*	for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>=48 && ch[i]<=57 || ch[i]==32)  // or we can write (ch[i]>='0' && ch[i]<='9' || ch[i]==32)
			{
				System.out.print(ch[i]);
			}
		}
	*/	for(char x :ch)     // using for each
		{
			if(x >=48 && x <=57 || x ==32)
			{
				System.out.print(x);
			}
		}
	}
}

public class Exract_Num_From_String {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Eneter String");
		String str =  sc.nextLine();
		
		StringNum sn = new StringNum();
		sn.findNum(str);
	}

}
