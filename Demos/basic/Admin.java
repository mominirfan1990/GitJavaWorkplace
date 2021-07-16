package inht_Multilevel_Example3;

public class Admin 
{

	public static void main(String[] args)
	{
		Vendor vd  = new Vendor();
		vd.displayDetailsHot();
		System.out.println();
		
		vd.acceptDetailsVen("RK Services ", "Pune", 123,"9922847958");
		vd.displayVend();
		
		Grossary Gs = new Grossary();
		Gs.acceptDeatilsGross("milk  curd, IceCream", "Palak  methi  potato  tamato ", "Apple mango ", "Dal rice weat");
		Gs.displayGross();
		
		Maintenance mm = new Maintenance();
		mm.acceptDetailsMain("Electrical ", "Pumbing", "Civil construction");
		mm.dispayDeatilsMain();
		
		HouseKeeping sk = new HouseKeeping();
		sk.acceptDetailsHouse("Cleaning", "Coloring ", "Past control ", "Parking manegment");
		sk.displayHouse();
		
	}
}
