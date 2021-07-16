package gslabDemo;

public class StringSecondElement {

	public static void main(String[] args) 
	{
		String str= "aababbsd";
		char temp=str.charAt(0);
		for(int i=1; i<str.length(); i++)
		{
			if(str.charAt(i)!=temp)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
		

	}

}
