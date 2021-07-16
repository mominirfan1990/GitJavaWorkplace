package StringExample;
import java.util.Scanner;

class CharArray
{
	public int getLenght(String s)
	{
		char ch[]=s.toCharArray();
		return ch.length;
	}
	}
public class String_To_Char_lenght
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();       // take enetered whole line
		// String str = sc.next();       // take only enetered line 1st word
		CharArray ca = new CharArray();
		int x=ca.getLenght(str);
		
		System.out.println(" Lenght 0f String   "+ str+"  is "+x);
		char q= 'A';
		
				
	}
}
