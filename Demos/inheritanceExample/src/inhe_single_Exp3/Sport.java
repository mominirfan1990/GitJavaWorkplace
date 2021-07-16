//parent class of kabbadi class

package inhe_single_Exp3;

public class Sport 
{
	String level, number;
	int eventNum;
	
	Sport()
	{
	  eventNum=131;	
	  
	}
	Sport(int w)
	{
		
		eventNum=w;
	}
	void acceptdetails(String lev, String num)
	{
		level=lev;
		number=num;
	}
	public void show()
	{
		System.out.println("Game has a part of  "+  level+ "   And its pay with "+number+" player"+"Event Number "+eventNum);
	}
	
}
