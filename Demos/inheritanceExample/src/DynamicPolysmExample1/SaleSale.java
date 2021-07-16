package DynamicPolysmExample1;

public class SaleSale 
{
	
	public static void main(String[] args)
	{
		ElectronicsEquip sp=null;
		//sp=new Refrigarotor();
		//sp.doSale();
		//System.out.println(sp instanceof Refrigarotor);  //check instance type 
		//sp=new Television();
		//Television t = (Television)sp; // downcast ElectronicsEquip type sp to televison type t
		//t.packaging();                 // calling television type method without creation Television type object
		//sp.doSale();
	
		//sp=new WashinfMachine();
		//sp.doSale();
		if (args[0].equals("Television"))
		{
			sp = new Television();
			
		}
		else if (args[0].equals("Refrigarotor"))
		{
			sp = new Refrigarotor();
		}
		else if( args[0].equals("WashinfMachine"))
		{
			sp = new WashinfMachine();
		}

		Shipping ss = new Shipping();
		ss.dispatch(sp);
	}

}
