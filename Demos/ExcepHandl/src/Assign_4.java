class NumeratorGreatherException extends Exception
{
	NumeratorGreatherException(String str)
	{
		System.out.println("in NumeratorGreatherException method ");
		System.out.println(str);
	}
}

class MultiCatchHandler 
{
	public void receive(int s, int k) 
	{
				try 
				{
					if(s<k)
					{
					
					throw new NumeratorGreatherException(" Numerator is less than Denominator");
					}
				} 
				catch (NumeratorGreatherException e)
				{
					//e.printStackTrace();
				}
		}
}

public class Assign_4
{

	public static void main(String[] args) //throws NumeratorGreatherException 
	{
		MultiCatchHandler ct = new MultiCatchHandler();
		int s=4,k=5;
		ct.receive(s,k);
	
	}

}
