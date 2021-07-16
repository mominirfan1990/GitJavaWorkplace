package ArrayExtra;

class Person
{
	int adhar ;
	String name ; 
	Car[] cars ; 
}

class Car
{
	String model ;
	int price ;
}

public class Q_02
{
	public static void main(String[] args)
	{
		Person[] parr = new Person[4];
		for(int i = 0 ; i<parr.length;i++) 
		{
			parr[i] = new Person();
			parr[i].adhar = 1234 ;
			parr[i].name = "abc";
			parr[i].cars = new Car[2];
			for (int j = 0 ; j<2 ; j++) 
			{
		//		parr[i].cars.model = "bmw";  // need to call by car object
		//		parr[i].cars.price = 200000;
		}	}
}

}
