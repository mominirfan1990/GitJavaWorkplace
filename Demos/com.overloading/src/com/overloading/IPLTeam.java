package com.overloading;


	class CSK
	{
		int no;
		public void play()
		{
			System.out.println("CSK is playing with " + no+ "  of players");
		}
	}
	
	class RCB
	{
		int no;
		public void play()
		{
			System.out.println("RCB is playing  " + no + "  og players"); 
		}
	}
	


public class IPLTeam
{
	public void IPLTeam(CSK c)
	{
		c.play();
	}
	
	public void IPLTeam(RCB r)
	{
		r.play();
	}
}


