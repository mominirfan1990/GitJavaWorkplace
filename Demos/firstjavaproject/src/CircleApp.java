import java.util.Scanner;

public class CircleApp 
{

	public static void main(String[] arg) 
	{
	 int a;
	 float b;
	 Scanner sc;
	 
	 sc=new Scanner(System.in);
	 
	 System.out.println("Enter Value of radius=" );
	 
	 a= sc.nextInt();
	 
	   
	 b= (float)(2*3.14f*a);
	 
	 System.out.println("Area of Circle=" + b);
		

	}

}
