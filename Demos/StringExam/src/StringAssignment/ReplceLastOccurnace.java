package StringAssignment;
import java.util.Scanner;
public class ReplceLastOccurnace 
{
	public void LastOccurance(String s,char old, char nw)
	{
	  char ch[]=s.toCharArray();
	  for(int i=ch.length-1;i>0;i--)
	  {
		  if(ch[i]==old)
		  {
			  ch[i]=nw;
		  }
	  }
	  for(char x :ch)
	  {
		  System.out.print(x);
	  }
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter The String");
		String str = sc.next();
		System.out.println("Eneter Character to be Replace");
		char old=sc.next().charAt(0);
		System.out.println("Eneter New Character ");
		char nw = sc.next().charAt(0);
		
		ReplceLastOccurnace rpl = new ReplceLastOccurnace();
		rpl.LastOccurance(str, old, nw);
	}
}
