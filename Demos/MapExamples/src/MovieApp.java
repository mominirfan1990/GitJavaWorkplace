//Create movie Map (Map<String,Map) within Map and search particular movie showing on which theater
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MovieApp {
	Map<Integer, String> map1, map2, map3;
	Map<String, Map> map;

	public void creatMovieList() {
		map1 = new HashMap<>();
		map1.put(1, "URI");
		map1.put(2, "DDLJ ");
		map1.put(3, "TANAJHI");

		map2 = new HashMap<>();
		map2.put(1, "THAPPAD");
		map2.put(2, "URI");
		map2.put(3, "PANGA");

		map3 = new HashMap<>();
		map3.put(1, "DANGAL");
		map3.put(2, "DABBANG");
		map3.put(3, "3IDIOTS");

		map = new HashMap<>();
		map.put("INOX", map1);
		map.put("PVR", map2);
		map.put("CityPride", map3);

	}

	public void display() 
	{
		Set<Entry<String, Map>> st = map.entrySet();
		Iterator<Entry<String, Map>> itr = st.iterator();
		while (itr.hasNext())
		{
			Entry<String, Map> th = itr.next();
			System.out.println(" Theoter Name " + th.getKey());

			Map<Integer, String> mov = th.getValue();
			Set<Entry<Integer, String>> sm = mov.entrySet();
			Iterator<Entry<Integer, String>> its = sm.iterator();
			while (its.hasNext()) 
			{
				Entry<Integer, String> tt = its.next();
				System.out.println(" Screen No. " + tt.getKey() + "  Movie Name  " + tt.getValue());
			}

		}
	}

	public void findMovie(String movi)
	{
		System.out.println(movi + " -Availabel On- ");
		boolean flag = false;

		Set st = map.entrySet();
		Iterator<Entry> itr = st.iterator();
		while (itr.hasNext())
		{
			Entry<String, Map> et = itr.next();
			Map<Integer, String> mm = et.getValue();

			Set ss = mm.entrySet();
			Iterator<Entry> its = ss.iterator();
			{
				while (its.hasNext()) 
				{
					Entry<Integer, String> ent = its.next();
					if (ent.getValue().equals(movi)) 
					{
						System.out.println("Theator Name - " + et.getKey() + " -on Screen No- " + ent.getKey());
						flag = true;
					}
				}
			}
		}
		if (flag != true)
			System.out.println(" Movie Dont running at any Theator ");
	}

	public static void main(String[] args) {
		MovieApp ma = new MovieApp();
		ma.creatMovieList();
		ma.display();
		ma.findMovie("URI");
	}

}
