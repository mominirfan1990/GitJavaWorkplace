package Kp;

enum Fruit{
	Apple,Mango,Banana,Jackfruit,Orange;
}

class ENumDemo1 {

	public static void main (String[] args)
	{
		Fruit f;
/*		f=Fruit.Apple;
		System.out.println("Select Fruit : " +f);
		System.out.println();
		f=Fruit.Orange;
		
		if(f==Fruit.Apple)
			System.out.println("Fruit is Apple");
		if(f==Fruit.Orange)
			System.out.println("Fruit is orange");
		switch(f)
		{
			case Apple :System.out.println("Fruit is Apple");
						break;
			case Mango :System.out.println("Fruit is Mango");
			break;

		}
*/
		System.out.println("Here is all Fruit");
		
		Fruit allFruit[]=Fruit.values();
		for(Fruit ft:allFruit)
		System.out.println(ft);
		
		f=Fruit.valueOf("Mango");
		System.out.println("Fruit is "+ f);
		System.out.println("Value is "+f.ordinal());
	}
}
