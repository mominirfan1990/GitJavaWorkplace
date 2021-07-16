package Example1;

public class VP extends Employee
{
	float hra,da,gross;
	int basic;
	public VP(int bas)
	{
		basic = bas;
		hra = (basic*0.10f);
		da =  (basic* 0.05f);
		gross = (basic+hra+da);
	}
	public float CalcTDS()
	{
			return basic*0.10f;
		
	}
	public void CalculatePT()
	{
		System.out.println("Proffessional tax for VP ::"+ pt);
	}
	
	public void calcNetSal()
	{
		float totalTax = pt+CalcTDS();
		System.out.println("Net slary for VP = "+(gross-totalTax));
	}
}
