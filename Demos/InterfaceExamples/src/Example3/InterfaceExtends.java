package Example3;
public class InterfaceExtends
{
	public  static void main(String[] args)
	{
		ScientficCalc sc = new Lab();
		sc.addition(10, 30);
		sc.division(20, 2);
		sc.substraction(30, 13);
		sc.findCube(3);
		//System.out.println("Square is :"+sc.findSqure(4));
		float t = sc.findSqure(4);
		System.out.println("Squre is "+t);
		
		
		
	
	}
}
