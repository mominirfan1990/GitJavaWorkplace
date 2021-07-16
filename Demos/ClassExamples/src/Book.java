import java.util.Scanner;

public class Book 
{
	String name,publisher,langauge;
	int publishingYear;
	
	public void acceptDetails()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Book");
		name=sc.nextLine();
		System.out.println("Eneter Language of book");
		langauge=sc.nextLine();
		System.out.println("Eneter Publisher of Book");
		publisher=sc.nextLine();
		System.out.println("Enter Year of Publishing");
		publishingYear=sc.nextInt();
	
	}
	
	public void displayDetails()
	{
		System.out.println("Name of book = " + name);
		System.out.println("Langauge of Book = "+ langauge);
		System.out.println("Publisher of Book = "+publisher);
		System.out.println("Year of Publishing = " + publishingYear);
	}
	 
	}
