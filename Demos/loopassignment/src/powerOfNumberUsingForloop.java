// find power of enterd number by for loop



import java.util.Scanner;

public class powerOfNumberUsingForloop
{
	public static void main()
	{
	
		int baseno, powerno, ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter base number  ");
		baseno = sc.nextInt();
		System.out.println("Please enter power number ");
		powerno = sc.nextInt();
		int i= powerno;
		for (  ;i>0; i--  )
		{
			ans= baseno*i;
					
		}
		System.out.println(ans);
		
	
	}
}
