import java.util.Scanner;

public class SqoorRoot_Of_Number
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp, sqroot;
		
		sqroot= (num/2);
		
		for(int i=1; i!=0;  )
		{
			temp = sqroot;
			sqroot =(temp+(num/temp))/2;
			i=temp-sqroot;
		}
		if(num==(sqroot*sqroot))
		System.out.println(sqroot);
		else
			System.out.println("Number is not squre number");
		


/*		do       // same ogic using while
		{
			temp = sqroot;
			sqroot=((temp+(num/temp))/2);
			
		}
		while((temp-sqroot)!=0);
			
		System.out.println(sqroot);
		
		

*/		
	}
	

}
