import java.util.Scanner;

public class additionTwoNumber
  {

	public static void main(String[] arg) 
	{
	 int a,b,c;
	 Scanner sc;
	 
	 sc=new Scanner(System.in);
	 
	 System.out.println("Enter Value of a=" );
	 
	 a= sc.nextInt();
	 
	 System.out.println("Enter Value of b=" );
	 
	 b= sc.nextInt();
	  
	 c=a+b;
	 
	 System.out.println("Addition of two number is=" + c);
		

	}

}
