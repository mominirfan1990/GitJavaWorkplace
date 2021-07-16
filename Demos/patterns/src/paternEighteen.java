import java.util.Scanner;

public class paternEighteen 
{

	public static void main(String[] args)
	{
		int j,i,num=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number");
		num=sc.nextInt();
		for(i=1;i<=num;i++ )
		{
			for(j=1;j<=num;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
		    
			}
			System.out.println();
}
	}
}

