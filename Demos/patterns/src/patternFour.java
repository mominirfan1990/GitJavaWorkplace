import java.util.Scanner;

public class patternFour
{



	public static void main(String[] args)
		{
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Please eneter no ");
			int no = sc.nextInt();
			
			char num='A';
			int i,j;
			for(i=1; i<=no; i++)
			{
				num='A';
				for(j=1; j<=i; j++)
				{
					System.out.print(num );
					num++;
					
				}
				System.out.println();
				
				
			}
		}
	}


