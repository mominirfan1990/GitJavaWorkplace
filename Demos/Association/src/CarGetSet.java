//Association with containment aggregation with get set method

public class CarGetSet 
{
	 private int regno, avg;
	 private String model;
	 DriverGetSet d;
	
	public void setRengo(int x)
	{
		regno = x;
	}
	public void setAvg(int y)
	{
		avg = y;
	}
	public void setModel(String z)
	{
		model = z;
	}
	
	public int getRegno()
	{
		return regno;
	}
	public String getModel()
	{
		return model;
	}
	public int getAvg()
	{
		return avg;
	}
	
	public void setD1( DriverGetSet d1)
	{
		d=d1;
	}
	public  DriverGetSet getD1()
	{
		return d;
	}
		
	
	public void diDetails()
		 {
			 System.out.println("car Details "+ "\nReg No :"+ regno + "\n Average : "+ avg + "\n model : "+model + "\n\n"+d);
		 } 
 
		
	public void polutionCertificate()
		 {
			d.TakeRTOExam();
			System.out.println( "Car is PUC Certified");
		 }
	 
		
	public static void main(String[] args)
	{
		
		CarGetSet bmw = new CarGetSet();
		bmw.setAvg(20);
		bmw.setRengo(123456);
		bmw.setModel("bmw-s1");
		
		DriverGetSet d1= new DriverGetSet();
		d1.setName("Ashish");
		d1.setAge(25);
		d1.setLicno(987654);

		bmw.setD1(d1);
					
		bmw.diDetails();
		bmw.polutionCertificate();
	}


}
