package gslabDemo;

public class Palindrome {

	public static void main(String[] args)
	{
		String str="iri";
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
	/*	
		String str1=new String(sb);
		if(str.equalsIgnoreCase(str1))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	*/	
		char arr[]=str.toCharArray();
		char arr1[]=str.toCharArray();
		
		for(int i=0; i<arr.length;i++)
		{
			if(i<(arr.length/2))
			{
				if(arr[i]==arr1[arr1.length-i-1])
					System.out.println("String is palindrome");
				else
					System.out.println("notpalindrome");
			}
		}
		
		int num=1234;
		int reverse=0;
		int reminder;
		while(num!=0)
		{
			reminder=num%10;
			reverse=reverse+reminder*10;
			num=num/10;
		}
		System.out.println(reverse);
		
	}

}
