import java.util.Scanner;

public class ExponantialSeriesApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number a = ");
		int a= sc.nextInt();
		System.out.println("please enter number b = ");
		int b=sc.nextInt();
		System.out.println("Please eneter number n = ");
		int n= sc.nextInt();
		
		ExponantioalSeris e1= new ExponantioalSeris();
		e1.acceptDetails(a, b, n);
		e1.displayDetails();
		e1.calculateExponantail();
	}
}
