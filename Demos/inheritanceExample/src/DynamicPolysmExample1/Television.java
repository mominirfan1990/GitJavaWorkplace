package DynamicPolysmExample1;

public class Television extends ElectronicsEquip
{
	public void doSale()
	  {
		  System.out.println("10 % offer on Television with exchange offer");
	  }
	public void packaging()
	{
		System.out.println("Packing TV to dispatch");
	}
}

class Refrigarotor extends ElectronicsEquip
{
	public void doSale()
	  {
		  System.out.println("Buye two refrigarator only paying 1 amount");
	  }
	public void packaging()
	{
		System.out.println("Packing Refrigarater to dispatch");
	}

}

class WashinfMachine extends ElectronicsEquip
{
	public void doSale()
	  {
		  System.out.println("Advanced washing method with exchange officer on washing machine");
	  }
	public void packaging()
	{
		System.out.println("Packing washing Machine to dispatch");
	}

}