
/*public class ternaryoperators
{

	public static void main(String [] args)
	{
		int a=8,b=67;
		int max =(a>b)?a:b;
		System.out.println("Maximun value is ="+ max);
	}
}*/


/*
import java.util.Scanner;
public class  ternaryoperators
{
	public static void main(String[] args)
	{
		int N1,N2;
		char E,N;
		Scanner sc;
		sc= new Scanner(System.in);
		System.out.println("First Number = ");
		N1=sc.nextInt();
		
		System.out.println("Second Number = ");
		N2=sc.nextInt();
		
		char max = (N1==N2)?'E':'N';
		
		System.out.println( max);
		
	}
}
*/


import java.util.Scanner;
public class  ternaryoperators
{
	public static void main(String[] args)
	{
	/*	int a=80,b=91,c=89;
		//int max = (a<b)?(a<c)?a:c:(b<c)?b:c;  // ternary for minimum value
		//System.out.println("minimun value is " + max);
		
		int max = a>b?a>c?a:c:b>c?b:c;  // ternary for maximum value
		System.out.println("maximum value is "+ max);
	*/	
		int a = 41;
		String b = "Bronze" ,s="Silver" ,g="Gold" ,p="Platinum" ;
		String result = a<60?a<40?a<25?b:s:g:p;
		System.out.println(result);
	}
}





