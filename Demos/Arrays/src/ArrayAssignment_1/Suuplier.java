package ArrayAssignment_1;

import java.util.Scanner;

public class Suuplier
{
	String name,mob;
	int itemId[];
	
	Suuplier()
	{
		
	}
	Suuplier(String name, String mob, int id[])
	{
		this.name=name;
		this.mob=mob;
		for(int i=0; i<id.length;i++)
		{
			itemId=id;
		}
	}
	public void display()
	{
		System.out.println("Supplier Details are");
		System.out.println("Name ::"+ name+" \n Mobile number ::"+mob);
		System.out.println("Item Id is ");
		for(int i=0; i<itemId.length;i++)
		{
			System.out.print(itemId[i]+" ");
		}
	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in);
		System.out.println("Please eneter Number of Items ");
		int x= sc.nextInt();
		int [] id = new int[x];
		System.out.println("Eneter item id ");
		for(int i=0; i<id.length;i++)
		{
			id[i]=sc.nextInt();
		}
		Suuplier sp = new Suuplier("TexSoft", "9988776645", id);
		sp.display();
							
	}

}
