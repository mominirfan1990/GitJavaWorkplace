package ArrayAssignment_1;

import java.util.Scanner;

class Book
{
	String bname;
	int year;
	Book()
	{
		
	}
	Book(String nn, int yr)
	{
		bname=nn;
		year=yr;
	}
	public void display()
	{
		System.out.println("Book name :"+bname+" \n Publ. Year ::"+year);
	}
}

public class Auther 
{
	String name;
	Book bk[]=new Book[4];
	Auther()
	{
		
	}
	Auther(String nam, Book bk[]) 
	{
		name=nam;
		this.bk=bk;
	}
	public void displayDetails()
	{
		System.out.println("Auther name ::"+name);
		System.out.println("Book Details are ::");
		for(Book qw: bk)
		{
			System.out.print("      Name of Book     "+qw.bname +" ");
			System.out.println("    Publication year "+qw.year+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Auther Details you want to enter");
		int x= sc.nextInt();
		Auther at[]=new Auther[x];
		for(int i=0; i<at.length;i++)
		{
			at[i]=new Auther();
			System.out.println("Eneter name of Auther ");
			String nam = sc.next();
			at[i].name=nam;
			System.out.println("How many Book Of Auther you want to enter ");
			int y =sc.nextInt();
			Book bk[]= new Book[y];
			for(int j=0;j<bk.length;j++)
			{
				bk[j]=new Book();
				System.out.println("Eneter Book name");
				bk[j].bname=sc.next();
				System.out.println("Eneter Publ. Year");
				bk[j].year=sc.nextInt();
			}
			at[i]= new Auther(nam,bk);
		}
		for(int j=0; j<at.length;j++)
		{
			at[j].displayDetails();
		}
	}
}
