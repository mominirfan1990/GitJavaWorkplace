import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AdharCheck 
{
	Map<String, String> map;
	
	public void voteCal()
	{
		map= new HashMap<>();
		map.put("1213", "BJP");
		map.put("1214", "BJP");
		map.put("1215", "Cong");
		map.put("1216", "NCP");
		map.put("1217", "BJP");
		
		Collection <String> cvalue =map.values();   // take values collection in cvalue
		Iterator <String> itr = cvalue.iterator();  // Assign iterator to value collection
		Map<String, Integer> newmap =new HashMap<>(); // creat new HashMap which is empty initially
		
		while(itr.hasNext())
		{
			String temp = itr.next();
			Integer keyval = Collections.frequency(cvalue, temp);
			newmap.put(temp,keyval);
				
		}
		System.out.println(newmap);
	}
	
	public static void main(String[] args)
	{
		AdharCheck ad = new AdharCheck();
		ad.voteCal();
	}

}
