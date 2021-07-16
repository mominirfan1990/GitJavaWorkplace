package InterfaceDemo;

abstract public class Employee implements TaxPayer
{

	@Override
	public void calcuatePt() 
	{
	 System.out.println("professional tax is "+pt);	
	}

}
