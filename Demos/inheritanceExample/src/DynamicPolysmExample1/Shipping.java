package DynamicPolysmExample1;

public class Shipping 
{
	public void dispatch(ElectronicsEquip e)
	{
		if (e instanceof Television)
		{
			
			((Television) e).packaging();
		}
		else if (e instanceof Refrigarotor)
		{
			((Refrigarotor) e).packaging();
		}
		else if ( e instanceof  WashinfMachine )
		{
			((WashinfMachine) e).packaging();
		}
		else
		{
			System.out.println("enter corect product");
		}
	}
}
