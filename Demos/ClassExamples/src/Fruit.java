import java.util.Scanner;

public class Fruit 
{
	String name,color,taste;
	int price;
	
	public void acceptDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter name of Fruit");
		name = sc.nextLine();

		System.out.println("Eneter color of Fruit");
		color = sc.nextLine();

		System.out.println("Eneter taste of Fruit");
		taste = sc.nextLine();
		
		System.out.println("Eneter price of Fruit");
		price = sc.nextInt();
	}
	
	public void displayDetails()
	{
		System.out.println("name = " + name);
		System.out.println("color = " + color);
		System.out.println("taste = " + taste);
		System.out.println("price = " + price);
	}
	
/*	public static void main(String[] args)
	{
		Fruit f1,f2;
		f1=new Fruit();
		f2=new Fruit();
		f1.acceptDetails();
		f2.acceptDetails();
		f1.displayDetails();
		f2.displayDetails();
	}
	
*/
}
