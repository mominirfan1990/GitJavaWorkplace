package DynamicPolysmExample2;

public class Customer
{
	public static void main(String[] args)
	{
	
	 Cake cs;
	 cs = new Blackforest();
	 cs.bakeCake();
	 Blackforest bf = (Blackforest)cs;
	 bf.decorateCake();
	 bf.payBill();
	
		
		
		//Cake cs =null;
	//cs.decorateCake();
		
	//Cake.decorateCake();
		
	//Pinapple.decorateCake();
		
	//	Cake cs;
	//	cs = new Pinapple();
	//	cs.decorateCake();
		
	//	Cake cs = new Cake();
	//	cs.decorateCake();
		
	//	Pinapple p = new Pinapple();
	//	p.decorateCake();
	
	}
}
