// child class of defence class

package inht_hirarchical_Example2;

public class AirForce extends Defence
{
		  int soldNum;
		  String oprtArea;
		  
		  void acceptDetails(int sn,String oa)
		  {
			 soldNum = sn;
			 oprtArea = oa;
		  }
		  void display()
		  {
			  System.out.println("AirFoce  have "+ soldNum+"Solders"+ "\n Operating Area on  "+ oprtArea);
			
		  }
		  
		  public static void main(String[] args)
		  {
			  AirForce ar = new AirForce();
			  ar.acceptDetails(15000, "Air");
			  ar.details("India", "Independant Nuclear ", "Rank 1", 100000);
			  ar.display();
			  ar.displayDetails();
			  
		  }

}
