import java.util.Scanner;
public class paternFifteen
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter Number ");
		int no=sc.nextInt();
		int i,j,sp=no-1,k,ch='a';
		
		for(i=1;i<=no;i++)
		{
			int num=ch+(i-1);
			for(k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++,num--)
			{
				System.out.print((char)num);
				
			}
			System.out.println();
			sp--;
		}

	}

}
