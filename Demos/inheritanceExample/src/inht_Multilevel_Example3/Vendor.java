package inht_Multilevel_Example3;

public class Vendor extends Hotel
{
	int venderID;
	String name, add ,mobNo;

	
	public void acceptDetailsVen(String nam, String adr, int eid, String mob)
	{
		venderID=eid;
		name = nam;
		add=adr;
		mobNo=mob;
	}
	
  public void displayVend()
  {
	  System.out.println("Vendor Details are ::");
	  System.out.println("Vendor name :"+name+"\n Vendor ID :"+ venderID+"\n Vendor Address"+add+"\n Vendor contact no. :"+mobNo);
  }
}
