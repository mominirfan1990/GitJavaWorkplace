
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class ConCurntHashMap
{
	ConcurrentHashMap<Integer,String>map;
	public void creadMap()
	{
		map=new ConcurrentHashMap<>();
		map.put(11, "JAVA");
		map.put(12, "SQL");
		map.put(13, "JDBC");
		map.put(14, "Python");
		map.put(15, "AI");
	}
	public void showMap()
	{
		Set<Integer>st= map.keySet();
		Iterator<Integer>itr=st.iterator();
		while(itr.hasNext())
		{
			Integer temp= itr.next();
			System.out.println(temp+" "+map.get(temp));
		}
		System.out.println();
	}
		
}
class ItrtaorMap extends Thread
{
	ConCurntHashMap cmap;
	ItrtaorMap(ConCurntHashMap c)
	{
		cmap=c;
	}
	public void run()
	{
		cmap.showMap();
	}
}
class RemoveEntryMap extends Thread
{
	ConCurntHashMap cmap;
	RemoveEntryMap(ConCurntHashMap c)
	{
		cmap=c;
	}
	public void run()
	{
		cmap.map.remove(11);
	}
}

public class VideoAssignt_08 
{
	public static void main(String[] args)
	{
		ConCurntHashMap as= new ConCurntHashMap();
		as.creadMap();
		as.showMap();
		Thread t2= new ItrtaorMap(as);
		Thread t1=new RemoveEntryMap(as);
		t1.start();
		t2.start();
		
		
		
		
	}

}
