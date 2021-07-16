import java.util.Scanner;

public class patternFive
{


	public static void main(String[] args)
		{
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Please eneter no ");
			int row = sc.nextInt();
			
			int i,j;
			
			for(i=row; i>=1; i--)
			{
				for(j=i; j>=1; j--)
				{
					System.out.print("*  ");
				}
				System.out.println();
			}
			
		}
}
