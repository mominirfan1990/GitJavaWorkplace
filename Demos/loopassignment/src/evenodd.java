


import java.util.Scanner;

public class evenodd 


{

	public static void main(String[] args)
	{
		
		 int  a;
		 Scanner sc;
		 
		 sc=new Scanner(System.in);
		 
		 System.out.println("Please Enter Number =" );
		 
		 a= sc.nextInt();
		 if (a%2 ==0)
		 {
			 System.out.println("Your Entered Number" + "_" + a + "_" + "is Even Number"); 
		 }
		 else
		 {
			 System.out.println("Your Entered  Number" + "_" + a +"_"+ "is Odd Number" );
		 }
		 
		 
	}
}
