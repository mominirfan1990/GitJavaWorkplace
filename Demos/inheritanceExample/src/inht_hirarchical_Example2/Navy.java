// child class of defence class

package inht_hirarchical_Example2;


public class Navy extends Defence
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
		  System.out.println("Navy have "+ soldNum+"Solders"+ "\n Operating Area on  "+ oprtArea);
	  }
	  
	  public static void main(String[] args)
	  {
		  Navy nv = new Navy();
		  nv.acceptDetails(10000, " Sea");
		  nv.details("India", "Independant Nuclear ", "Rank 1", 100000);
		  nv.display();
		  nv.displayDetails();
	  }
	  
	
}
