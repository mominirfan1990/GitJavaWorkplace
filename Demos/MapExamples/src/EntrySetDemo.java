import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetDemo 
{
	Map<Integer, String> map;

	public void ceartHasgmap() 
	{
		map = new HashMap();
		map.put(12, "Irfan");
		map.put(13, "vishal");
		map.put(16, "Sneha");
		//System.out.println(map.entrySet());
		
		Set<Entry<Integer, String>> es= map.entrySet();
		Iterator<Entry<Integer,String>>itr=es.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String>os=itr.next();
			Integer o=os.getKey();
			String sr=os.getValue();
			System.out.println(o+" "+sr+"\n");
		}
	}
	public static void main(String...a)
	{
		EntrySetDemo es = new EntrySetDemo();
		es.ceartHasgmap();
				
	}
}

