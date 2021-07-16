		
class Car 
 {
	
		String color;
		public void changeColor(Car c2)
		{
			c2.color = color;
			color = "green";
		}
		


public static void main(String[] args)
		{
			Car c1= new Car();
			c1.color= "Blue";
			Car c2=c1;
			c2.changeColor(c1);
			c2.color = "Pink";
			System.out.println(c2.color);
			System.out.println(c1.color);
		}
		
}
