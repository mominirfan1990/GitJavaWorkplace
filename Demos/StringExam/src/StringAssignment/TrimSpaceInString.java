package StringAssignment;

public class TrimSpaceInString {

	public static void main(String[] args)
	{
		String s1=" Think Quotiont a  ";
		System.out.println(s1+"\nlenght before trim "+s1.length());
//		String s2= s1.trim( );
//		System.out.println(s2);
//		System.out.println(s2.length());
		int cnt=0,a;
		int chr = 0;
		char ar[]= s1.toCharArray();
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==' ')
				cnt++;
			else
				break;
		}
		s1=s1.substring(cnt);
		System.out.println("Lenght after leading trim "+s1.length());
		
		a=s1.length()-cnt;
		s1=s1.substring(0,a);
		System.out.println("Lenght after trailing  trim "+s1.length());
		
	}

}
