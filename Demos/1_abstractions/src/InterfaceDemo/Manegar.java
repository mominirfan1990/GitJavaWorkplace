package InterfaceDemo;

public class Manegar extends Employee
{
	int basic;
	double TDS,netsal;
	public Manegar(int b)
	{
		basic=b;
	}
	@Override
	public void calculateTDS() 
	{
		TDS=basic*0.08;
		System.out.println("TDS "+TDS);
	}
	@Override
	public void calcuatePt() 
	{
		super.calcuatePt();
	}
	public void calculatenetSal()
	{
		netsal= (basic-pt-TDS);
		System.out.println("net salary "+netsal);
	}
	
}
