
public class Store 
{
	int maximumlevel=10;
	int minimumlevel =2;
	int noOfItemAvailable=5;
	
	public void addItem(int a) throws ItemStockOverFlowException
	{
		if((noOfItemAvailable+a)>maximumlevel)
		{
			throw new ItemStockOverFlowException();
		}
		else
			noOfItemAvailable=noOfItemAvailable+a;
	}
	public void removeItem(int b) throws ItemStockUnderFlowException
	{
		if((noOfItemAvailable-b)<minimumlevel)
		{
			throw new ItemStockUnderFlowException();
		}
		else
			noOfItemAvailable=noOfItemAvailable-b;
	}
	public void checkStock()
	{
		System.out.println("Available Stock "+noOfItemAvailable);
	}
	
	public static void main(String [] args)
	{
		Store sp = new Store();
		sp.checkStock();
		try
		{
			sp.removeItem(5);
		}
		catch(ItemStockUnderFlowException d)
		{
			
		}
		try 
		{
			sp.addItem(6);
		}
		catch(ItemStockOverFlowException e)
		{
			
		}
		sp.checkStock();
		
	}
}
