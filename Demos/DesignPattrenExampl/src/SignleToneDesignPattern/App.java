package SignleToneDesignPattern;

public class App 
{
	public static App singleobj=null;
	private App()
	{}
	public static App getObject()
	{
		if(singleobj!=null)
			return singleobj;
		else
			singleobj=new App();
		return singleobj;
		
	}
	
}
