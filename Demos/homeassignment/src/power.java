import java.util.Scanner;
public class power 
{
 public static void main(String[] args)
 {
	 double a,b;
	Scanner sc;
	sc = new Scanner(System.in);
	System.out.println("Enter value");
	a= sc.nextInt();

	System.out.println("Enter power value");
	b= sc.nextInt();
	
	a= (Math.pow(a,b));
	System.out.println("Square of enterd number is ="+ a);
 }
}