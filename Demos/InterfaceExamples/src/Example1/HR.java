package Example1;

public class HR extends Employee
{
	float hra,da,gross;
	int basic;
	public HR(int bas)
	{
		basic = bas;
		hra = (basic*0.15f);
		da =  (basic* 0.05f);
		gross = (basic+hra+da);
	}
	public float CalcTDS()
	{
			return basic*0.08f;
		
	}
	public void CalculatePT()
	{
		System.out.println("Proffessional tax for HR ::"+ pt);
	}
	
	public void calcNetSal()
	{
		float totalTax = pt+CalcTDS();
		System.out.println("Net slary for HR = "+(gross-totalTax));
	}
}
