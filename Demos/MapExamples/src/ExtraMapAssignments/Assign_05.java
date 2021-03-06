package ExtraMapAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Batsman
{
	int bid;
	String bname;
	String matchid;
	int runs;
	
	Batsman() 
	{}
	Batsman(int bid, String bname, String matchid, int runs)
	{
		this.bid = bid;
		this.bname = bname;
		this.matchid = matchid;
		this.runs = runs;
	}
	@Override
	public String toString()
	{
		return "Batsman bid=" + bid + ", bname=" + bname + ", matchid=" + matchid + ", runs=" + runs;
	}
	
	
}
class Player
{
	int id;
	String name;
	Player(){}
	Player(int id, String nam)
	{
		this.id=id;
		name=nam;
	}
	@Override
	public String toString()
	{
		return "( "+id+" "+name+" )";
	}
	@Override
	public int hashCode() 
	{
		return name.hashCode()/(2*id);
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Player ot = (Player) obj;
		if (this.id== ot.id && this.name.equals(ot.name))
			return true;
		else
		return false;
	}
	
	
}
class Batsmen implements Comparable<Batsmen>
{
	int id;
	String name;
	int run;
	Batsmen(){}
	Batsmen(int id, String nm, int run)
	{
		this.id=id;
		name=nm;
		this.run=run;
	}
	public String toString()
	{
		return " Batsmen id "+id+" "+name+" "+run;
		
	}
	@Override
	public int compareTo(Batsmen o) 
	{
		if(this.run>o.run)
			return -1;
		if(this.run<o.run)
			return 1;
		else
			return 0;
	}
}
public class Assign_05 
{
	List<Batsman>list;
	Map<Player,Integer>map;
	public void creatList()
	{
		list=new ArrayList<>();
		list.add(new Batsman(111,"Virat","match1",100));
		list.add(new Batsman(112,"Sachin","match1",45));
		list.add(new Batsman(113,"Vrishabh","match3",10));
		list.add(new Batsman(112,"Sachin","match2",145));
		list.add(new Batsman(111,"Virat","match1",40));
	    list.add(new Batsman(112,"Sachin","match1",45));
	  
	    map=new HashMap<>();
	    int runs=0;
/*	    for(int i=0; i<list.size();i++)
	    {
	    	for(int j=0; j<list.size();j++)
	    	{
	    		if(list.get(i).bid==list.get(j).bid)
	    		{
	    			runs=runs+list.get(j).runs;
	    		}
	    	}
	    	Player p=new Player(list.get(i).bid, list.get(i).bname);
	    	map.put(p, runs);
	    	runs=0;
	    }
	    System.out.println(map);
*/	
  /*    for(Batsman lx:list)
	    {
	    	for(Batsman bx:list)
	    	{
	    		if(lx.bid==bx.bid)	
	    			runs=runs+bx.runs;
	    	}
	    	Player p =new Player(lx.bid,lx.bname);
	    	map.put(p, runs);
	    	runs=0;
	    }
		System.out.println(map);
	*/	
		Iterator<Batsman> itr=list.iterator();
		while(itr.hasNext())
		{
			Batsman br= itr.next();
			Player p= new Player(br.bid,br.bname);
			if(map.containsKey(p))
			{
				map.put(p, map.get(p)+br.runs);
			}
			else
				map.put(p, br.runs);
		}
		System.out.println(map);
	}
	public void creatNewList() // creat new list of new Batsmen class and sort by run in desending order
	{
		 List<Batsmen>list1=new ArrayList<>();
		 Set<Player>st= map.keySet();
		 Iterator <Player> itr1=st.iterator();
		 while(itr1.hasNext())
		 {
			Player et=itr1.next();
			list1.add(new Batsmen(et.id, et.name,map.get(et)));
		 }
		 System.out.println(" Before Sort "+list1);
		 Collections.sort(list1);
		 
		 System.out.println(" After Sort "+list1);	
	}
	public static void main(String[] args)
	{
		Assign_05 as = new Assign_05();
		as.creatList();
		as.creatNewList();
	}

}
