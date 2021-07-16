package inht_Multilevel_Example3;

public class Grossary extends Vendor
{
	String mP,vP,fP,kP;
	public void acceptDeatilsGross(String milk,String veg,String Fru,String Kir)
	{
		mP=milk;
		vP=veg;
		fP=Fru;
		kP=Kir;
	}
	public void displayGross()
	{	
		System.out.println("Grossary avialble");
		System.out.println(" Milk Products ::"+mP);
		System.out.println("Vegetables ::"+vP);
		System.out.println("Fruits ::"+fP);
		System.out.println("Kirana ::"+kP);
	}
}
