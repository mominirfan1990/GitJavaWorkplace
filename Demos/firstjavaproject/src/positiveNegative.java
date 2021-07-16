
import java.util.Scanner;

public class positiveNegative


{

	public static void main(String[] args)
	{
		
		 int  a;
		 Scanner sc;
		 
		 sc=new Scanner(System.in);
		 
		 System.out.println("Please Enter Number =" );
		 
		 a= sc.nextInt();
		 if (a>0)
		 {
			 System.out.println("Your Entered Number" + "_" + a + "_" + "is Positive Number"); 
		 }
		 else
		 {
			 System.out.println("Your Entered  Number" + "_" + a +"_"+ "is Negative Number" );

		 }
		 
		 
	}
}