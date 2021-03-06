package HashTableDemo;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableExampl {

	public static void main(String[] args) 
	{
		Hashtable<Integer, String> h= new Hashtable<>();
		h.put(9, "JAVA");
	//	h.put(13, null); // null key and value not allowed in hashTable otherwise gives NullPointerException
	//	h.put(null," ABC ");
		h.put(10, "SQL");
		h.put(11, "C++");
		h.put(12, "DBA");
		h.put(13, "VB");
		System.out.println(h);
		
		h.remove(9);
		System.out.println(h.values());
		
		Enumeration en=h.elements(); // gives only values of collection
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		Set<Integer> st=h.keySet();
		Iterator<Integer>itr=st.iterator();
		while(itr.hasNext())
		{
			Integer num=itr.next();
			System.out.println(num+" "+h.get(num));
		}
		System.out.println(h.size());
	}

}
