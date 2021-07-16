package InterfaceDemo;

public interface TaxPayer 
{
	static final int pt=200;
	 void calcuatePt();
	 void calculateTDS();
	default void information()
	{
		System.out.println("tax paying date is 31 march ");
	}
}
