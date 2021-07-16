// child class of defence class

package inht_hirarchical_Example2;

public class Army extends Defence
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
	  System.out.println("Army have "+ soldNum+"Solders"+ "\n Operating Area on  "+ oprtArea);
	 
  }
  
  public  static void main(String[] args)
  {
	 Army am = new Army();
	 am.acceptDetails(20000, "Land");
	 am.details("India", "Independant Nuclear ", "Rank 1", 100000);
	 am.display();
	 am.displayDetails();
  }
  
 }
