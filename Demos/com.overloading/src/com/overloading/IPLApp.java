package com.overloading;

public class IPLApp
{
  public static void main(String[] args)
  {
	  IPLTeam z = new IPLTeam ();
	  
	  CSK cs = new CSK();
	  cs.no=11;
	  //cs.play();
	  z.IPLTeam(cs);
	  
	  RCB rc = new RCB();
	  
	  rc.no=12;
	  //rc.play();
	  //z.IPLTeam(rc);
  }
}
