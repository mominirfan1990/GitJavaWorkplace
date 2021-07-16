// print a to z  and A to Z by same line


public class printatozAtoZbyFor
{

	public static void main(String[] args)
	{
			
		for( int i ='a',i1='A' ; i<='z'|| i1<='Z'; i++, i1++)
			System.out.println((char) i + "\t" + (char)i1);
	}

}
