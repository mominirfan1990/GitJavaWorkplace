import java.util.Scanner;

public class AddOfNumberInString {

	public void addStringNum(String s)
	{
		int temp=0,add=0;
		char ch []= s.toCharArray();
		for(int i=0; i<ch.length; i++)     // for(char x : ch)
		{
			if(ch[i]>='0' && ch[i]<='9' )   // or if(ch[i]>=48 && ch[i]<=57 ) 
			{
				temp=ch[i]-48;
				add=add+temp;
			}
		}
		System.out.println("Addition of Number in String is "+ add);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter String");
		String s=sc.next();
		
		AddOfNumberInString ads = new AddOfNumberInString();
		ads.addStringNum(s);
		
	}

}
