import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Create movie Map (Map<String,Map) within Map and search particular movie showing on which theater with available seat

public class MovieSearch {
	Map<String, Map> map;
	Map<Integer, Map> map1, map2, map3;
	Map<String, Integer> mapA, mapB, mapC, mapD, mapE, mapF;

	public void creatMap() {
		mapA = new HashMap<>();
		mapB = new HashMap<>();
		mapA.put("URI", 0);
		mapB.put("SHOLEY", 10);

		mapC = new HashMap<>();
		mapD = new HashMap<>();
		mapC.put("TANHAJI", 00);
		mapD.put("DDLJ", 05);

		mapE = new HashMap<>();
		mapF = new HashMap<>();
		mapE.put("TITANIC", 8);
		mapF.put("URI", 0);

		map1 = new HashMap<>();
		map1.put(1, mapA);
		map1.put(2, mapB);

		map2 = new HashMap<>();
		map2.put(1, mapC);
		map2.put(2, mapD);

		map3 = new HashMap<>();
		map3.put(1, mapE);
		map3.put(2, mapF);

		map = new HashMap<>();
		map.put("INOX", map1);
		map.put(" PVR ", map2);
		map.put("City Pride", map3);

		System.out.println(map);
	}

	public void movieIterat() {
		Set<Entry<String, Map>> st = map.entrySet();
		Iterator<Entry<String, Map>> itr = st.iterator();

		while (itr.hasNext()) {
			Entry<String, Map> sr = itr.next();
			System.out.println("Theater name " + sr.getKey());

			Map<Integer, Map> m1 = sr.getValue();

			Set<Entry<Integer, Map>> st1 = m1.entrySet();
			Iterator<Entry<Integer, Map>> itr1 = st1.iterator();
			while (itr1.hasNext()) {
				Entry<Integer, Map> sr1 = itr1.next();
				System.out.println("Screen No " + sr1.getKey());

				Map<String, Integer> m2 = sr1.getValue();

				Set<Entry<String, Integer>> st2 = m2.entrySet();
				Iterator<Entry<String, Integer>> itr2 = st2.iterator();
				while (itr2.hasNext()) {
					Entry<String, Integer> sr2 = itr2.next();
					System.out.println(" Movie name " + sr2.getKey());
					System.out.println("Available seat " + sr2.getValue());
				}
			}
			System.out.println();
		}
	}

	public void searchMovie(String spass) {
		boolean flag=false;
		Set<Entry<String, Map>> st = map.entrySet();
		Iterator<Entry<String, Map>> itr = st.iterator();

		while (itr.hasNext()) {
			Entry<String, Map> sr = itr.next();
			Map<Integer, Map> m1 = sr.getValue();

			Set<Entry<Integer, Map>> st1 = m1.entrySet();
			Iterator<Entry<Integer, Map>> itr1 = st1.iterator();
			while (itr1.hasNext()) {
				Entry<Integer, Map> sr1 = itr1.next();
				Map<String, Integer> m2 = sr1.getValue();

				Set<Entry<String, Integer>> st2 = m2.entrySet();
				Iterator<Entry<String, Integer>> itr2 = st2.iterator();
				while (itr2.hasNext()) {
					Entry<String, Integer> sr2 = itr2.next();
					String str = sr2.getKey();
					if (str.equals(spass) && sr2.getValue() != 0) {
						System.out.println("\nThearter Name   - " + sr.getKey());
						System.out.println("Movie Name      - " + sr2.getKey());
						System.out.println("Screen No       - " + sr1.getKey());
						System.out.println("Avaialable Seat - " + sr2.getValue());
						System.out.println("Seat Filling fast Book Hurry");
						flag=true;
					}
				}
			}
		}
		if(flag==false)
			System.out.println(" Movie "+spass+" All Theartor are housefull No Seat Availabe " );
	}

	public static void main(String[] args) {
		MovieSearch ms = new MovieSearch();
		ms.creatMap();
		// ms.movieIterat();
		ms.searchMovie("URI");
	}

}
