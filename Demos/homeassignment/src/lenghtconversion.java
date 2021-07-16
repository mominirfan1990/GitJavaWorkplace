import java.util.Scanner;
public class lenghtconversion

{
	public static void main (String[]args)
	{
		float lenght;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Please Eneter Lenght In Centimeter");
		lenght = sc.nextInt();
				
		
		System.out.println("Enetered Lenght In Centimeter is =" + lenght);
		System.out.println("Entered Lenght In Meter is =" + lenght/100);
		System.out.println("Entered Lenght In Kilometere is =" + lenght/100000);
	}
	
	

}
