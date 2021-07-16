import java.util.Scanner;
public class neonNo
{

	public static void main(String[] args)
	{
		int no1=0, rem=0,total=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter no");
		int no= sc.nextInt();
		
		no1 = (no*no);
		
		while(no1>0)
		{
		rem = no1%10;
		no1 = no1/10;
		total=total+rem;
		
		}
		
		if(total==no)
		{
		System.out.println("Given no is Neon number");
		}
		else
			System.out.println("Given no is not Neon number");
	
	}
	
}
