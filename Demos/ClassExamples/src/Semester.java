// pass by object

public class Semester 
{

	int phy, chem, math;
	
	public void acceptDetails(int x, int y, int z)
	{
		phy =x;
		chem = y;
		math = z;
	}
	
	public void show()
	{
		System.out.println("physics marks = "+ phy);
		System.out.println("Chemistry marks = " + chem);
		System.out.println("math marks = "+ math);
	}
	
/*	public void calculateResult(Semester s1,Semester s2)  // only receive object as parameter
	
	{
		phy = s1.phy +s2.phy;
		chem  = s1.chem + s2.chem;
		math = s1.math + s2.math;
	}
*/
	 public Semester calculateResult(Semester s1)   // receive object as parameter and also return object
	 {
		 Semester temp=new Semester();
		 temp.phy=phy+s1.phy;
		 temp.chem=phy+s1.chem;
		 temp.math=phy+s1.math;
		 return temp;
	 }
	
	
}




