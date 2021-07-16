
public class Fruitmain
{
	public static void main(String[] args)
	{
		Fruit f1,f2,f3;
		f1=new Fruit();
		f2=new Fruit();
		f1.acceptDetails();
		// f2.acceptDetails();
		f2.name = f1.name;     // its copy data from f1 memory  to f2 memory
		f2.color = f1.color;
		f2.taste = f1.taste;
		f2.price = f1.price;
		f1.displayDetails();
		f2.displayDetails();
		f3=f1;               // its assigne memory address of f1 to f3 but not create seprate memory
		f3.displayDetails();
		System.out.println("hashcode of f1 = " + f1.hashCode()); // show hashcode of f1
		System.out.println("hashcode of f2 = " + f2.hashCode());
		System.out.println("hashcode of f3 = " + f3.hashCode());
	}

}
