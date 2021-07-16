import java.util.Scanner;

public class square
{
 public static void main(String[] args)
 {
	 int a;
	Scanner sc;
	sc = new Scanner(System.in);
	System.out.println("Enter value");
	a= sc.nextInt();
	a= a*a;
	System.out.println("Square of enterd number is ="+ a);
 }
}
