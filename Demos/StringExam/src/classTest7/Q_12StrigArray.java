package classTest7;

public class Q_12StrigArray {
	
	public void findout()
	{
		String str[]= {"Winter", "fall", "summer", "spring"};
		char []ch=new char[str.length];
		for(int i=0; i<ch.length; i++)
		{
			if(str[i].length()>i)
			{
				ch[i]=str[i].charAt(i);
			}
			else	
				ch[i]='#';
		}
		for(char x:ch)
		{
			System.out.print(x);
		}
	}
	
	public static void main(String[] args) 
	{
		Q_12StrigArray ss= new Q_12StrigArray();
		ss.findout();
	}

}
