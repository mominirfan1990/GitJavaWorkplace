
public class Person
{

	String name,address,gender;
	int age;
	Address a1;
	Person()
	{
		name= "SHree";
		address = "Rasta Peth";
		gender = "male";
		age = 25;
		a1=a1;
	}
	
	Person(String a, String b, String c, int d,Address a1)
	{
		name= a;
		address = b;
		gender = c;
		age = d;
		this.a1=a1;
	}
	 
	public void displayDisplay()
	{
		System.out.println("Name ::"+ name + "\n Address ::"+ address+ "\n Gender ::"+gender+"\n Age "+age+"\n"+ a1);
	}
	
	public static void main(String[] args)
	{
		
		Address a = new Address();
		Person p1= new Person();
		p1.displayDisplay();
		
		Address a1= new Address("Pune", "Maharashtra", "India");
		Person p2=new Person("Ganesha","GanjPeth","male",24,a1);
		p2.displayDisplay();
		
		
		
	}
}
