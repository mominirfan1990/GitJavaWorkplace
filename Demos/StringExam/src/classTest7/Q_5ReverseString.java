package classTest7;
import java.util.Scanner;
class StringReverse
{
	public void reverseString(String str)
	{
		char []ch= str.toCharArray();
		char []fin=new char[ch.length];
		int [] sp=new int[ch.length];
		int k=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]==' ')
			{
				sp[k]=i;
				k++;
			}	
		}
		k=0;int s=0;
		for(int j=ch.length-1; j>=0; j-- 
		{
		
			if(k!=sp[s])
			{
				fin[k]=ch[j];
				k++;
			}
			else if(sp[s]!=0)
			{
				fin[k]=' ';
				s++;
				k++;
						
			}
		}
		for(char x:fin)
		{
			System.out.print(x);
		}
	}
}
public class Q_5ReverseString
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String str= sc.nextLine();
		
		StringReverse sr = new StringReverse();
		sr.reverseString(str);
		sc.close();
	}

}
