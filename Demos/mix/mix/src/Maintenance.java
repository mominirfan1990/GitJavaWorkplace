package inht_Multilevel_Example3;

public class Maintenance extends Vendor
{
	String elec,pumbe,civil;
 public void acceptDetailsMain(String elec, String pumb, String cvl)
 {
	this.elec=elec; 
	pumbe=pumb;
	civil=cvl;
 }
 public void dispayDeatilsMain()
 {
	 System.out.println("Maintenance Worker Availble for :"+ elec +" "+pumbe+" "+civil);
 }
 
}
