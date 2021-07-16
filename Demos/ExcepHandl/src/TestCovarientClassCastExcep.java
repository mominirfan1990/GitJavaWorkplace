class IdZeroException extends Exception
{
	String str;
	public IdZeroException(String string) 
	{
		 str= string;
	}
	public void show()
	{
		System.out.println(str);
	}
}

class Employe
{
	protected Employe getRecord(int id) throws IdZeroException
	{
		if(id==0)
		{
			throw new IdZeroException(" ID not be zero ");
		}
		return null ;
		
	}
}

class Maneger extends Employe
{
	protected Maneger getRecord(int id)
	{
		return null;
	}
}
class HrManeger extends Maneger
{
	protected Maneger getRecord(int id)
	{
		return null;
	}
}

class ProManeger extends Maneger
{
	protected Maneger getRecord(int id)
	{
		return null;
	}
}

public class TestCovarientClassCastExcep {

	public static void main(String[] args) throws IdZeroException 
	{
		HrManeger hm = new HrManeger();
		Employe ep = new Employe();
		 hm=(HrManeger) ep;   /// generet ClassCastException while Downcasting
		//ep.getRecord(0);
		
		
	}

}
