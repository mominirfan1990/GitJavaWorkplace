package classTest7;

public class Q_7_RemoveCharFromString {
	public static void main(String [] args)
	{
	String s1="india is great nation";
	String s2="in";
	char ch[]=s1.toCharArray();
	 int k=0; 
	char temp[]=new char[ch.length];
	for(int i=0;i<ch.length;i++)
	{
			if(ch[i]!=s2.charAt(0) && ch[i]!=s2.charAt(1))
			{
				temp[k]=ch[i];
			    k++;
			}
	}
	for(char c: temp)
	{
		System.out.print(c);
	}
	}
}
