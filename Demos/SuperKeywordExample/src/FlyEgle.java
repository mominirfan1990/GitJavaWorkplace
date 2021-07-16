 class Birds
 {
	
	public void move()
	{
		System.out.println("Birds are flying ");
	}
	
 }
 class Egle extends Birds
 {
	public void move()
	{
		super.move();     // invoke Bird class method 
		System.out.println("Egle fly heigh than other birds");
	}
 }
 
 public class FlyEgle
 {
	 public static void main(String str [])
	 {
		 Birds br = new Egle();
		 
		 br.move();    // call Egle class method
	 }
 }

 