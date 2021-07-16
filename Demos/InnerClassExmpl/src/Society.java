

public class Society
{
	public String sname;
	private int sid;
	Society(){}
	Society(String nm,int id)
	{
		sname=nm;
		sid=id;
	}
	public void societyDetails()  // local method inner class
	{
		
		class Maintenace
		{
			int amount;
			Maintenace()
			{
				amount=5000;
			}
			public void diaplayMaintenece()
			{
				System.out.println("Maintenence "+amount);
			
			}
		}
		System.out.println("Society Name "+sname+" "+"Society id "+sid);
		Maintenace m= new Maintenace();
		m.diaplayMaintenece();
	}
	public static class Commitee   // static inner class 
	{
		int comiteid;
		Commitee()
		{
			comiteid=890;
		}
		public void showCommit()
		{
			System.out.println("In Commitee ");
			//societyDetails();
		}
	}
	class Flat   // simple inner class
	{
		int flatNo;
		String oName;
		Flat(){}
		Flat(int fn, String on)
		{
			flatNo=fn;
			oName=on;
		}
		public void flatDeatials()
		{
			societyDetails();
			System.out.println("Flat No "+flatNo+" Owner Name "+oName);
		}
	}
/*	public static void main(String...a)
	{
		//Society o = new Society("Trimurti",2341);
		
		Society.Commitee c=new Commitee();
		c.showCommit();

	}
*/
}
