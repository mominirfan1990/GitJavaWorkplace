package ClassTestOnArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Q_3_ArrayListIterat {

	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		list1.add("JAVA");
		list1.add("C++");
		list1.add("SQL");
		list1.add("Python");
		
		ArrayList<ArrayList<String>> list ;
		list= new ArrayList<>();
		list.add(list1);
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
